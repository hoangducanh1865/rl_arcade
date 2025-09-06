package rl_arcade.games.car_obstacle;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;


// Main game window and entry point
public class CarObstacleGame extends JFrame{
    private GameEngine gameEngine;
    private GamePanel gamePanel;

    // Create and initialize game window
    public CarObstacleGame(boolean aiMode) {
        super("Car Obstacle Avoidance Game");

        gameEngine = new GameEngine();

        // Set up player data collection if player mode
        if (!aiMode) {
            gameEngine.setCollectingPlayerData(true);
        }

        gamePanel = new GamePanel(gameEngine, aiMode);
        
        // Set up window 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        add(gamePanel);
        pack();
        setLocationRelativeTo(null);

        // Window closing handler
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                gamePanel.stopGame();
            }
        });
    }

    // Start game window
    public void start() {
        SwingUtilities.invokeLater(() -> {
            setVisible(true);
            gamePanel.requestFocus();
        });
    }

    // Getters for server access
    public GameEngine getGameEngine() {return gameEngine;}
    public GamePanel getGamePanel() {return gamePanel;}
}
