package rl_arcade.games.car_obstacle;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import rl_arcade.config.Config;

// Represent an obstacle falling from the top
public class Obstacle {

    private int lane;
    private double x, y;
    private Rectangle bounds;
    private boolean active;

    // Create a new obstacle in a specific lane
    public Obstacle(int lane) {
        this.lane = lane;
        this.x = lane * Config.LANE_WIDTH + (Config.LANE_WIDTH - Config.OBSTACLE_WIDTH) / 2;
        this.y = -Config.OBSTACLE_HEIGHT;
        this.active = true;

        updateBounds();
    }

    private void updateBounds() {
        this.bounds = new Rectangle((int) x, (int) y, Config.OBSTACLE_WIDTH, Config.OBSTACLE_HEIGHT);
    }

    public void update() {
        if (active) {
            // Update obstacle position since it is moving
            y += Config.OBSTACLE_SPEED;
            updateBounds();

            // Deactivate obstacle if it move off the screen
            if (y > Config.WINDOW_HEIGHT) {
                active = false;
            }
        }
    }

    // Draw the obstacle
    public void draw(Graphics2D g) {
        if (active) {
            g.setColor(Color.BLACK);
            g.fillRect((int) x, (int) y, Config.OBSTACLE_WIDTH, Config.OBSTACLE_HEIGHT);

            // Add pattern for visibility
            g.setColor(Color.WHITE);
            g.drawLine((int) x, (int) y, (int) x + Config.OBSTACLE_WIDTH, (int) y + Config.OBSTACLE_HEIGHT);
            g.drawLine((int) x + Config.OBSTACLE_WIDTH, (int) y, (int) x, (int) y + Config.OBSTACLE_HEIGHT);
        }
    }

    // Getters
    public boolean isActive() {
        return active;
    }

    public Rectangle getBounds() {
        return bounds;
    }

    public int getLane() {
        return lane;
    }

    public double getY() {
        return y;
    }

    public double getNormalizedY() {
        return y / Config.WINDOW_HEIGHT;
    }
}
