package rl_arcade;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import rl_arcade.config.Config;
import rl_arcade.games.car_obstacle.GameEngine;
import rl_arcade.games.car_obstacle.GamePanel;
import rl_arcade.config.Config;
import rl_arcade.games.car_obstacle.Car;
import rl_arcade.proto.GameServiceProto.*;
import rl_arcade.proto.GameServiceProto.GameAction;
import rl_arcade.proto.GameServiceProto.GameState;
import rl_arcade.proto.GameServiceProto.ObstacleInfo;
import rl_arcade.proto.GameServiceProto.StartGameRequest;
import rl_arcade.games.car_obstacle.GameEngine;


public class App {

    public static void main(String[] args) {
        testVisualGame();
    }

    // Test the visual game with GUI
    private static void testVisualGame() {
        SwingUtilities.invokeLater(() -> {
            // Create game engine
            GameEngine gameEngine = new GameEngine();
            
            // Create main game window
            JFrame gameFrame = new JFrame("RL Arcade - Car Obstacle Game");
            gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            gameFrame.setResizable(false);
            
            // Create game panel (set to false for player mode, true for AI mode)
            boolean aiMode = false; // Change to true to test AI mode
            GamePanel gamePanel = new GamePanel(gameEngine, aiMode);
            
            // Add panel to frame
            gameFrame.add(gamePanel);
            gameFrame.pack();
            
            // Center the window on screen
            gameFrame.setLocationRelativeTo(null);
            
            // Make window visible
            gameFrame.setVisible(true);
            
            // Request focus for keyboard input
            gamePanel.requestFocusInWindow();
            
            System.out.println("=== Game Started ===");
            System.out.println("Controls:");
            System.out.println("  LEFT/A  - Move car left");
            System.out.println("  RIGHT/D - Move car right");
            System.out.println("  R       - Restart game (when game over)");
            System.out.println("  Close window to exit");
            System.out.println("Current mode: " + (aiMode ? "AI Mode" : "Player Mode"));
        });
    }

    // Alternative: Test both player and AI modes
    private static void testBothModes() {
        SwingUtilities.invokeLater(() -> {
            // Player mode window
            createGameWindow("Player Mode", false, 100, 100);
            
            // AI mode window (offset position)
            createGameWindow("AI Mode", true, 600, 100);
        });
    }
    
    private static void createGameWindow(String title, boolean aiMode, int x, int y) {
        GameEngine gameEngine = new GameEngine();
        
        JFrame frame = new JFrame("RL Arcade - " + title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        
        GamePanel gamePanel = new GamePanel(gameEngine, aiMode);
        frame.add(gamePanel);
        frame.pack();
        
        frame.setLocation(x, y);
        frame.setVisible(true);
        
        if (!aiMode) {
            gamePanel.requestFocusInWindow();
        }
    }
}

