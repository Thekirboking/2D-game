package Main.java; // Package declaration for the Main class

import javax.swing.*; // Import the Swing library for GUI components

public class Main { // Main class to run the program
    public static void main(String[] args) {  // Main method to run the program
        JFrame window = new JFrame(); // Create a new JFrame object
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the application when the window is closed
        window.setResizable(false); // Prevent the window from being resized
        window.setTitle("Random 2D game"); // Set the title of the window

        GamePanel gamePanel = new GamePanel(); // Create a new instance of the GamePanel class
        window.add(gamePanel); // Add the game panel to the window

        window.pack(); // Pack the window to fit the preferred size of its components

        window.setLocationRelativeTo(null); // Center the window on the screen
        window.setVisible(true); // Make the window visible

        gamePanel.startGameThread(); // Start the game thread
    }
}