package Main.java;

import entity.Player;

import javax.swing.JPanel; // Import the Swing library for GUI components
import java.awt.*; // Import the AWT library for graphics and layout management

public class GamePanel extends JPanel implements Runnable { // GamePanel class extends JPanel to create a custom panel for the game

    //screen settings
    final int originalTileSize = 16; // Original tile size in pixels
    final int scale = 3; // how much the character needs to be scale bc 16 by 16 is too small

    public int tileSize = originalTileSize * scale; // Final tile size after scaling
    final int maxScreenCol = 16; // Maximum number of columns on the screen
    final int maxScreenRow = 12; // Maximum number of rows on the screen
    final int screenWidth = tileSize * maxScreenCol; // Width of the screen in pixels
    final int screenHeight = tileSize * maxScreenRow; // Height of the screen in pixels

    //FPS
    int FPS = 60; // Frames per second for the game loop

    KeyHandler KeyH = new KeyHandler(); // Create an instance of the KeyHandler class to handle keyboard input
    Thread gameThread; // Thread for running the game loop
    Player player = new Player(this, KeyH); // Create an instance of the Player class to represent the player character

    //set player's position
    int playerX = 100; // Player's initial X position
    int playerY = 100; // Player's initial Y position
    int playerSpeed = 4; // Player's speed in pixels


    public GamePanel() { // Constructor for the GamePanel class
        this.setPreferredSize(new Dimension(screenWidth, screenHeight)); // Set the preferred size of the panel
        this.setBackground(Color.black); // Set the background color of the panel to black
        this.setDoubleBuffered(true); // Enable double buffering for smoother rendering
        this.addKeyListener(KeyH); // Add the KeyHandler as a key listener to the panel
        this.setFocusable(true); // Make the panel focusable to receive key events
    }

    public void startGameThread() { // Method to start the game thread
        gameThread = new Thread(this); // Create a new thread for the game
        gameThread.start(); // Start the game thread


    }

    @Override
    public void run(){

        double drawInterval = 1000000000/FPS; // Calculate the draw interval in nanoseconds
        double delta = 0; // Variable to store the time difference
        long lastTime = System.nanoTime(); // Get the current time in nanoseconds
        long currentTime; // Variable to store the current time
        long timer = 0;
        int drawCount = 0; // Variable to count the number of frames drawn

        while (gameThread != null){ // While the game thread is not null

            currentTime = System.nanoTime(); // Get the current time in nanoseconds

            delta += (currentTime - lastTime) / drawInterval; // Calculate the time difference
            timer += (currentTime - lastTime); // Update the timer
            lastTime = currentTime; // Update the last time

            if (delta >= 1) { // If the time difference is greater than or equal to 1
                update();
                repaint(); // Call the update and repaint methods
                delta--; // Decrease the delta value
                drawCount++; // Increment the draw count
            }
            if (timer >= 1000000000) { // If the timer is greater than or equal to 1 second
                System.out.println("FPS: " + drawCount); // Print the frames per second
                drawCount = 0; // Reset the draw count
                timer = 0; // Reset the timer
            }
        }
    }
    public void update() {// Method to update the game state

        player.update();

    }

    public void paintComponent(Graphics g) { // Method to paint the components of the panel

        super.paintComponent(g); // Call the superclass's paintComponent method to ensure proper rendering

        Graphics2D g2 = (Graphics2D)g; // Cast the Graphics object to Graphics2D for advanced rendering

        player.draw(g2); // Call the draw method of the player to render the player character

        g2.dispose();

    }

}