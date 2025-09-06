package rl_arcade.games.car_obstacle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

import rl_arcade.config.Config;
import rl_arcade.proto.GameServiceProto.GameAction;
import rl_arcade.proto.GameServiceProto.GameState;
import rl_arcade.proto.GameServiceProto.ObstacleInfo;
import rl_arcade.proto.GameServiceProto.PlayerData;


// Core game logic engine
public class GameEngine {
    private Car car;
    private List<Obstacle> obstacles;
    private int score;
    private boolean gameOver;
    private float lastReward;
    private Random random;

    // Player's data
    private List<GameState> playerStates;
    private List<GameAction> playerActions;
    private List<Float> playerRewards;
    private boolean collectingPlayerData;

    // Initial game engine
    public GameEngine() {
        this.random = new Random();
        this.obstacles = new CopyOnWriteArrayList<>();
        this.playerStates = new ArrayList<>();
        this.playerActions = new ArrayList<>();
        this.playerRewards = new ArrayList<>();

        reset();
    }

    // Reset game to initial state
    public void reset() {
        car = new Car();
        obstacles.clear();
        score = 0;
        gameOver = false;
        lastReward = 0;

        // QUESTION: why do we need if statement here?
        if (collectingPlayerData) {
            playerStates.clear();
            playerActions.clear();
            playerRewards.clear();
        }
    }

    // Update game state per one frame
    public void update() {
        if (gameOver) return;

        // Spawn new obstacle randomly
        if (random.nextDouble() < Config.OBSTACLE_SPAWN_RATE) {
            int lane = random.nextInt(Config.NUM_LANES);
            obstacles.add(new Obstacle(lane));
        }

        // Update all obstacles
        for(int i = obstacles.size() - 1; i >= 0; i--) {
            Obstacle obs = obstacles.get(i);
            obs.update();

            // Remove inactive obstacles
            if (!obs.isActive()) {
                obstacles.remove(i);
                score++; 
                lastReward = Config.REWARD_DODGE;
            }

            // Check collision
            if (checkCollison(car, obs)) {
                gameOver = true;
                lastReward = Config.PENALTY_COLLISION;
            }
        }

        // Small reward for surviving
        if (!gameOver && lastReward == 0) {
            lastReward = Config.REWARD_SURVIVE;
        } 
    }

    private boolean checkCollison(Car car, Obstacle obstacle) {
        return car.getBounds().intersects(obstacle.getBounds());
    }

    // Process player/AI action
    public void processAction(GameAction.Action action) {
        if (gameOver) return;

        // Store player data if in player model
        if (collectingPlayerData) {
            playerStates.add(getCurrentGameState());
            playerActions.add(getCurrentGameAction(action));
        }

        lastReward = 0;

        switch (action) {
            case LEFT:
                if (car.getLane() > 0) {
                    car.moveLeft();
                } else {
                    lastReward = Config.PENALTY_WALL_HIT;
                }
                break;
            case RIGHT:
                if (car.getLane() < Config.NUM_LANES - 1) {
                    car.moveRight();
                } else {
                    lastReward = Config.PENALTY_WALL_HIT;
                }
                break;
            case UP:
            case DOWN:
            case STAY:
                break;
        }

        // Store reward if collection player data
        if (collectingPlayerData) {
            playerRewards.add(lastReward);
        }
    }

    // Get current player (game) state
    public GameState getCurrentGameState() {
        GameState.Builder stateBuilder = GameState.newBuilder()
            .setCarLane(car.getLane())
            .setGameOver(gameOver)
            .setScore(score)
            .setReward(lastReward);
        
        // Add obstacles' information
        for(Obstacle obs : obstacles) {
            if (obs.isActive()) {
                ObstacleInfo obstacleInfo = ObstacleInfo.newBuilder()
                    .setLane(obs.getLane())
                    .setYPosition((float)obs.getNormalizedY())
                    .build();
                stateBuilder.addObstacles(obstacleInfo);
            }
        }

        return stateBuilder.build();
    }

    // Get current player action
    public GameAction getCurrentGameAction(GameAction.Action action) {
        GameAction.Builder actionBuilder = GameAction.newBuilder()
            .setAction(action);
        
        return actionBuilder.build();
    }

    // Get player's data for training
    public PlayerData getPlayerData() {
        return PlayerData.newBuilder()
            .addAllStates(playerStates)
            .addAllActions(playerActions)
            .addAllRewards(playerRewards)
            .build();
    }

    // Setters and getters
    public void setCollectingPlayerData(boolean collecting) {
        this.collectingPlayerData = collecting;
    }

    public Car getCar() {return car;}
    public List<Obstacle> getObstacles() {return obstacles;}
    public int getScore() {return score;}
    public boolean isGameOver() {return gameOver;}
    public float getLastReward() {return lastReward;}
}

