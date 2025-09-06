package rl_arcade.games.car_obstacle;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;
import javax.swing.Timer;

import rl_arcade.config.Config;
import rl_arcade.proto.GameServiceProto.GameAction;


// Game display panel with rendering and input handling
public class GamePanel extends JPanel {

    private GameEngine engine;
    private boolean aiMode;
    private Timer gameTimer;
    private Font scoreFont;
    private Font gameOverFont;

    // Use for AI auto-reset
    private long gameOverTime = 0;
    private boolean waitingForReset = false;
    private static final int RESET_DELAY = 2000; // 2 seconds

    // Initialize game panel
    public GamePanel(GameEngine engine, boolean aiMode) {
        this.engine = engine;
        this.aiMode = aiMode;
        this.scoreFont = new Font("Arial", Font.BOLD, 20);
        this.gameOverFont = new Font("Arial", Font.BOLD, 40);

        setPreferredSize(new Dimension(Config.WINDOW_WIDTH, Config.WINDOW_HEIGHT));
        setBackground(Color.WHITE);
        setFocusable(true);

        // Add keyboard control for player mode
        if (!aiMode) {
            addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    handleKeyPress(e);
                }
            });
        }

        // Start game loop
        startGameLoop();
    }

    // Handle keyboard input for player mode
    private void handleKeyPress(KeyEvent e) {
        GameAction.Action action = GameAction.Action.STAY;

        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT:
            case KeyEvent.VK_A:
                action = GameAction.Action.LEFT;
                break;
            case KeyEvent.VK_RIGHT:
            case KeyEvent.VK_D:
                action = GameAction.Action.RIGHT;
                break;
            case KeyEvent.VK_UP:
            case KeyEvent.VK_W:
                action = GameAction.Action.UP;
                break;
            case KeyEvent.VK_DOWN:
            case KeyEvent.VK_S:
                action = GameAction.Action.DOWN;
                break;
            case KeyEvent.VK_R:
                if (engine.isGameOver()) {
                    engine.reset();
                }
        }

        engine.processAction(action);
    }

    // Start the game loop timer
    private void startGameLoop() {
        gameTimer = new Timer(Config.FRAME_TIME, e -> {
            engine.update();

            if (aiMode && engine.isGameOver()) {
                if (!waitingForReset) {
                    gameOverTime = System.currentTimeMillis();
                    waitingForReset = true;
                    System.out.println("AI game over. Score: " + engine.getScore() + ". Resetting in 2 seconds...");
                } else if (System.currentTimeMillis() - gameOverTime > RESET_DELAY) {
                    engine.reset();
                    waitingForReset = false;
                    System.out.println("AI game auto-reset. New game started.");
                }
            }

            repaint(); // QUESTION: where is this function defined?
        });
        gameTimer.start();
    }

    // Paint game components
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Enable anti-aliasing for smoother graphics
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, 
                            RenderingHints.VALUE_ANTIALIAS_ON);
        
        // Draw lanes deviders
        drawLanes(g2d);

        // Draw car
        engine.getCar().draw(g2d); // QUESTION: how?

        // Draw obstacles
        for (Obstacle obs : engine.getObstacles()) {
            obs.draw(g2d);
        }

        // Draw UI elements
        drawUI(g2d);

        // Draw gameover screen
        if (engine.isGameOver()) {
            drawGameOver(g2d);
        }
    }

    // Draw lanes dividers
    private void drawLanes(Graphics2D g) {
        g.setColor(Color.GRAY);
        g.setStroke(new BasicStroke(2, BasicStroke.CAP_BUTT, 
                                    BasicStroke.JOIN_BEVEL, 0, 
                                    new float[]{10}, 0)); // QUESTION: what is Stroke?
        
        for (int i = 1; i < Config.NUM_LANES; i++) {
            int x = i * Config.LANE_WIDTH;
            g.drawLine(x, 0, x, Config.WINDOW_HEIGHT);
        }
    }

    // Draw UI elements (score, mode)
    private void drawUI(Graphics2D g) {
        g.setColor(Color.BLACK);
        g.setFont(scoreFont);

        // Draw score
        g.drawString("Score: " + engine.getScore(), 10, 30);

        // Draw mode
        String mode = aiMode ? "AI Mode" : "Player Mode";
        g.drawString(mode, Config.WINDOW_WIDTH - 120, 30);

        // Draw reward (for AI Mode)
        if (aiMode) {
            g.drawString(String.format("Reward: %.2f", engine.getLastReward()), 10, 60);
        }
    }

    // @TODO: recheck this function
    // Draw game over screen
    private void drawGameOver(Graphics2D g) {
        // Semi-transparent overlay
        g.setColor(new Color(0, 0, 0, 150));
        g.fillRect(0, 0, Config.WINDOW_WIDTH, Config.WINDOW_HEIGHT);
        
        // Game over text
        g.setColor(Color.WHITE);
        g.setFont(gameOverFont);
        String gameOverText = "GAME OVER";
        FontMetrics fm = g.getFontMetrics();
        int textWidth = fm.stringWidth(gameOverText);
        g.drawString(gameOverText, (Config.WINDOW_WIDTH - textWidth) / 2, 
                    Config.WINDOW_HEIGHT / 2);
        
        // Instructions
        g.setFont(scoreFont);
        String restartText = aiMode ? "AI will restart automatically" : "Press R to restart";
        textWidth = g.getFontMetrics().stringWidth(restartText);
        g.drawString(restartText, (Config.WINDOW_WIDTH - textWidth) / 2, 
                    Config.WINDOW_HEIGHT / 2 + 40);
        
        // Final score
        String scoreText = "Final Score: " + engine.getScore();
        textWidth = g.getFontMetrics().stringWidth(scoreText);
        g.drawString(scoreText, (Config.WINDOW_WIDTH - textWidth) / 2, 
                    Config.WINDOW_HEIGHT / 2 + 80);
    }

    // Stop the game timer
    public void stopGame() {
        if (gameTimer != null) {
            gameTimer.stop();
        }
    }
}
