package rl_arcade.games.car_obstacle;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import rl_arcade.config.Config;

// Represents the player's car in the game
public class Car {

    private int lane;  // Current lane (0-4)
    private int x, y;  // Position in pixels
    private Rectangle bounds;  // Collision detection

    // Initialize car at the center bottom of the screen
    public Car() {
        this.lane = 2;  // Start in middle lane
        updatePosition();
        this.y = Config.WINDOW_HEIGHT - Config.CAR_HEGHT - 50;
        updateBounds();
    }

    // Move car to the left lane if possible
    public void moveLeft() {
        if (lane > 0) {
            lane--;
            updatePosition();
            updateBounds();
        }
    }

    // Move car to the right lane if possible
    public void moveRight() {
        if (lane < Config.NUM_LANES - 1) {
            lane++;
            updatePosition();
            updateBounds();
        }
    }

    // Update car's x position based on current lane
    private void updatePosition() {
        this.x = lane * Config.LANE_WIDTH + (Config.LANE_WIDTH - Config.CAR_WIDTH) / 2;
    }

    // Update collision bounds
    private void updateBounds() {
        this.bounds = new Rectangle(x, y, Config.CAR_WIDTH, Config.CAR_HEGHT);
    }

    // Draw the car on the screen
    public void draw(Graphics2D g) {
        // Draw car as a simple rectangle (black and white theme)
        g.setColor(Color.BLACK);
        g.fillRect(x, y, Config.CAR_WIDTH, Config.CAR_HEGHT);

        // Add simple details
        g.setColor(Color.WHITE);
        g.fillRect(x + 10, y + 10, Config.CAR_WIDTH - 20, 20);  // Windshield
    }

    // Getters
    public int getLane() {
        return lane;
    }

    public Rectangle getBounds() {
        return bounds;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
