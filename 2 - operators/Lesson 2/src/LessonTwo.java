
/**
 * Created by mwinwood on 6/6/16.
 */
import java.util.Scanner;

public class LessonTwo {

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Your favorite number: ");

        if(userInput.hasNextInt()) {

            int numberEntered = userInput.nextInt();

            System.out.println("You entered: " + numberEntered);

            int numEnteredTimes2 = numberEntered * 2;
            System.out.println("numberEntered * 2 = " + numEnteredTimes2);

            int numEnteredMinus2 = numberEntered - 2;
            System.out.println("numberEntered - 2 = " + numEnteredMinus2);

            int numEnteredDividedBy2 = numberEntered / 2;
            System.out.println("numberEntered / 2 = " + numEnteredDividedBy2);

            int numEnteredMod2 = numberEntered % 2;
            System.out.println("numberEntered % 2 = " + numEnteredMod2);


            // Shorthand
            int numEnteredPlus2 = numberEntered;
            numEnteredPlus2 += 2;

            // Find aboslute value for a number
            int numberAbs = Math.abs(numberEntered);
            System.out.println("number Absolute Value = " + numEnteredMod2);

            int whichIsBigger = Math.max(5, 7); // 7

            int whichIsSmaller = Math.min(5, 7); // 5

            double numSqrt = Math.sqrt(5.23); // Returns a double

            int numCeiling = (int) Math.ceil(5.23); // 6

            int numFloor = (int) Math.floor(5.23); // 5

            int numRound = (int) Math.floor(5.23); // 5.2

            int intRand = (int) (Math.random() * 10);

            System.out.println("Random Number: " + intRand);

        } else {
            System.out.println("I said Int, Dumbass...");
        }

    }

}
