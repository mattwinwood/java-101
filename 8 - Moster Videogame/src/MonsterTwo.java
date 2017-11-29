import java.lang.reflect.Array;
import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.SystemUtils;

/**
 * Created by mwinwood on 7/18/16.
 */
public class MonsterTwo {
    static char[][] battleBoard = new char[10][10];

    // Constant
    public final String TOMBSTONE = "Here Lies a Dead Monster";
    public char nameChar1 = 'B';
    public static int numOfMonsters = 0;

    // Private Class Variables OR Fields
    private int  health = 500;
    private int attack = 20;
    private boolean alive = true;
    private int movement = 2;
    private int xPosition = 0;
    private int yPosition = 0;


    public String name = "Big Monster";

    // Constructor must have same name as class
    // Constructor cannot have a return value of any type
    public MonsterTwo(int health, int attack, int movement, String name)
    {
        this.health = health;
        this.attack = attack;
        this.movement = movement;
        this.name = name;

        int maxXBoardSpace = battleBoard.length - 1;
        int maxYBoardSpace = battleBoard[0].length - 1;

        int randNumX, randNumY;

        do {
            randNumX = (int) (Math.random() * maxXBoardSpace);
            randNumY = (int) (Math.random() * maxYBoardSpace);
        } while(battleBoard[randNumX][randNumY] != '*');

        this.xPosition = randNumX;
        this.yPosition = randNumY;

        this.nameChar1 = name.charAt(0);

        battleBoard[this.xPosition][this.yPosition] = this.nameChar1;

        numOfMonsters++;

    }

    public static void buildBattleBoard() {
        for(char[] row : battleBoard) {
            Arrays.fill(row, '*');
        }

    }

    public static void redrawBoard() {
         int k = 1;

        while(k <= 30){ System.out.print('-'); k++; }
        System.out.println();

        for(int i = 0; i < battleBoard.length; i++) {
            for(int j = 0; j < battleBoard[i].length; j++) {
                System.out.print("|" + battleBoard[i][j] + "|");
            }
            System.out.println();
        }

        k = 1;

        while(k <= 30){ System.out.print('-'); k++; }
        System.out.println();
    }


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

    public boolean getAlive()
    {
        return alive;
    }

    public void setHealth(int decreaseHealth)
    {
        health = health - decreaseHealth;

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



    // Overloaded Constructor
    // Default Constructor - if above provides no inputs
    public MonsterTwo()
    {
        numOfMonsters++;

    }



    public static void main(String[] args) {

    }


}
