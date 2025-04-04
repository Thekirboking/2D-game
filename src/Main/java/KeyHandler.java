package Main.java; // Package declaration for the KeyHandler class

import java.awt.event.KeyEvent; // Import the AWT library for handling key events
import java.awt.event.KeyListener; // Import the AWT library for key listener interface


public class KeyHandler implements KeyListener{ // KeyHandler class implements KeyListener to handle keyboard input

    public boolean upPressed, downPressed, leftPressed, rightPressed; // Boolean flags for key states

    @Override // This method is called when a key is typed
    public void keyTyped(KeyEvent e) {
    }

    @Override // This method is called when a key is pressed
    public void keyPressed(KeyEvent e) {

        int code = e.getKeyCode(); // Get the key code of the pressed key

        if (code == KeyEvent.VK_W) {
            upPressed = true; // Set the upPressed flag to true
        }
        if (code == KeyEvent.VK_S) {
            downPressed = true; // Set the downPressed flag to true
        }
        if (code == KeyEvent.VK_A) {
            rightPressed = true; // Set the leftPressed flag to true
        }
        if (code == KeyEvent.VK_D) {
            leftPressed = true; // Set the rightPressed flag to true
        }
    }

    @Override // This method is called when a key is released
    public void keyReleased(KeyEvent e) {

        int code = e.getKeyCode(); // Get the key code of the released key

        if (code == KeyEvent.VK_W) {
            upPressed = false; // Set the upPressed flag to false
        }

        if (code == KeyEvent.VK_S) {
            downPressed = false; // Set the downPressed flag to false
        }

        if (code == KeyEvent.VK_A) {
            rightPressed = false; // Set the leftPressed flag to false
        }

        if (code == KeyEvent.VK_D) {
            leftPressed = false; // Set the rightPressed flag to false
        }
    }

}
