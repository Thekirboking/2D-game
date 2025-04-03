package Main.java;

import javax.swing.JPanel; // Import the Swing library for GUI components
import java.awt.*; // Import the AWT library for graphics and layout management

public class GamePanel extends JPanel { // GamePanel class extends JPanel to create a custom panel for the game

    //screen settings
    final int originalTileSize = 16; // Original tile size in pixels
    final int scale = 3; // how much the character needs to be scale bc 16 by 16 is too small

    final int tileSize = originalTileSize * scale; // Final tile size after scaling
    final int maxScreenCol = 16; // Maximum number of columns on the screen
    final int maxScreenRow = 12; // Maximum number of rows on the screen
    final int screenWidth = tileSize * maxScreenCol; // Width of the screen in pixels
    final int screenHeight = tileSize * maxScreenRow; // Height of the screen in pixels

    Thread gameThread; // Thread for running the game loop


    public GamePanel() {
        this.setPreferredSize(new Dimension(screenWidth, screenHeight)); // Set the preferred size of the panel
        this.setBackground(Color.black); // Set the background color of the panel to black
        this.setDoubleBuffered(true); // Enable double buffering for smoother rendering
    }

    public void startGameThread() {
        gameThread = new Thread(this::startGameThread); // Create a new thread for the game


    }

    public void run(){ // Run method for the game loop

        while (gameThread != null){ // While the game thread is not null


            System.out.println("Game is running");// Print a message to indicate that the game is running
        }
    }

}