package rl_arcade;

import rl_arcade.games.car_obstacle.CarObstacleGame;


public class App {

    public static void main(String[] args) {
        CarObstacleGame game = new CarObstacleGame(false);
        game.start();
    }
}

