/**
 * Created by mwinwood on 7/18/16.
 */
public class Monster {
    // Constant
    public final String TOMBSTONE = "Here Lies a Dead Monster";

    // Private Class Variables OR Fields
    private int  health = 500;
    private int attack = 20;
    private int movement = 2;
    private int xPosition = 0;
    private int yPosition = 0;
    private boolean alive = true;


    public String name = "Big Monster";


    // Accessor Methods - have access to protected class variables
    public int getAttack()
    {
        return attack;

    }

    public int getMovement()
    {
        return movement;
    }

    public int getHealth()
    {
        return health;
    }

    public void setHealth(int decreaseHealth)
    {
        health = health = decreaseHealth;

        if(health < 0) {
            alive = false;
        }
    }

    // Overloaded method
    public void setHealth(double decrease)
    {
        int intDecreaseHealth = (int) decrease;
        health = health - intDecreaseHealth;
        if(health < 0) {
            alive = false;
        }
    }

    // Constructor must have same name as class
    // Constructor cannot have a return value of any type
    public Monster(int newHealth, int newAttack, int newMovement)
    {
        health = newHealth;
        attack = newAttack;
        movement = newMovement;
    }

    // Overloaded Constructor
    // Default Constructor - if above provides no inputs
    public Monster()
    {

    }



}
