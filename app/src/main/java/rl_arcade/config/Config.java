package rl_arcade.config;


public class Config {

    // Game window size
    public static final int WINDOW_WIDTH = 400;
    public static final int WINDOW_HEIGHT = 600;

    // Game mechanics 
    public static final int NUM_LANES = 5;
    public static final int LANE_WIDTH = WINDOW_WIDTH / NUM_LANES;
    public static final int CAR_WIDTH = 60;
    public static final int CAR_HEGHT = 80;
    public static final int OBSTACLE_WIDTH = 60;
    public static final int OBSTACLE_HEIGHT = 60;

    // Game speed and timing 
    public static final int FPS = 60;
    public static final int FRAME_TIME = 1000 / FPS;
    public static final  double OBSTACLE_SPEED = 5.0; // QUESTION: how is 5.0 fast? 
    public static final double OBSTACLE_SPAWN_RATE = 0.01; // Probability per frame

    // Reward and penalties
    public static final float REWARD_SURVIVE = 0.1f;
    public static final float REWARD_DODGE = 1.0f; // QUESTION: what is this?
    public static final float PENALTY_COLLISION = -10.0f;
    public static final float PENALTY_WALL_HIT = -0.5f;

    // Server configuration
    public static final int GRPC_PORT = 50051;
}
