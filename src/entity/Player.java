package entity;

import Main.java.GamePanel;
import Main.java.KeyHandler;

public class Player extends Entity { // Player class extends the Entity class to inherit its properties

    GamePanel gp; // Reference to the GamePanel object
    KeyHandler KeyH; // Reference to the KeyHandler object

    public Player(GamePanel gp, KeyHandler KeyH) { // Constructor for the player class
        this.gp = gp; // Initialize the GamePanel reference
        this.KeyH = KeyH; // Initialize the KeyHandler reference
    }
}
