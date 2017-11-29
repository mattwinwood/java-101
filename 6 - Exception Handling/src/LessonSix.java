// 1. Import Libraries For Scanner
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class LessonSix {

    // 2. Create Variable
    static Scanner userInput = new Scanner(System.in);

    public static void main( String[] args) {

        // divideByZero(2);
        // checkAge();
        getFile("./somestuff.txt");


    }

    // Using "Throw" Throws the error back to the function that called it. (in this example, main();)
    public static void getFile(String fileName) throws IOException, FileNotFoundException  {

        try
        {
            FileInputStream file = new FileInputStream(fileName);
        }
        // 1. Always have most specific first
        catch (FileNotFoundException e)
        {
            System.out.println("Sorry can't find that file.");
        }
        // 2. Always have LEAST specific LAST
        catch (IOException e)
        {
            System.out.println("Unknown IO Error");
        }
        // 3.
        catch (Exception e)
        {
            System.out.println("Some kind of error occured.. IDK.");
        }
        // 4.
        catch (ClassNotFoundException e)
        {
            // Do nothing with this error...
        }
        // 5.
        finally
        {
            System.out.println("");

        }

    }

    public static void checkAge() {

        System.out.print("How old are you?");

        int age = checkValidAge();

        if(age != 0) {
            System.out.println("You are " + age + " years old.");
        }
    }

    public static int checkValidAge() {
        try
        {
            return userInput.nextInt();

        }
        catch (InputMismatchException e)
        {
            // Flush next user input (whatever they typed - disregard it - it was wrong...
            userInput.next();
            System.out.print("That isn't a whole number.");
            return 0;
        }

    }

    public static void divideByZero( int a ) {
        try
        {
            System.out.println(a/0);

        }
        catch (ArithmeticException e)
        {
            // Whole error
            System.out.println("You can't do that: " + e);

            // Just Message
            System.out.println("You can't do that 2: " + e.getMessage());

            // Print Stack Trace
            e.printStackTrace();
        }

    }

}
