package entity;

import Main.java.GamePanel;
import Main.java.KeyHandler;

import java.awt.*;

public class Player extends Entity { // Player class extends the Entity class to inherit its properties

    GamePanel gp; // Reference to the GamePanel object
    KeyHandler KeyH; // Reference to the KeyHandler object

    setDefaultValues(); // Method to set default values for the player

    public Player(GamePanel gp, KeyHandler KeyH) { // Constructor for the player class
        this.gp = gp; // Initialize the GamePanel reference
        this.KeyH = KeyH; // Initialize the KeyHandler reference
    }
    public void setDefaultValues() {

        x = 100; // Set the default X position of the player
        y = 100; // Set the default Y position of the player
        speed = 4; // Set the default speed of the player
    }
    public void update() {
        if (KeyH.upPressed) { // If the up key is pressed
            y -= speed; // Move the player up by the specified speed
        }
        else if (KeyH.downPressed) { // If the down key is pressed)
            y += speed; // Move the player down by the specified speed
        }
        else if (KeyH.leftPressed) { // If the left key is pressed
            x += speed; // Move the player left by the specified speed
        }
        else if (KeyH.rightPressed) { // If the right key is pressed
            x -= speed; // Move the player right by the specified speed
        }
    }
    public void draw(Graphics2D g2) { // Method to draw the player on the screen
        g2.setColor(Color.white); // Set the color to white

        g2.fillRect(x, y, gp.tileSize, gp.tileSize); // Draw a rectangle at the specified position with the specified size
    }
}
