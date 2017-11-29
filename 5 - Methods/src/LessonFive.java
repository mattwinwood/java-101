/**
 * Created by mwinwood on 6/30/16.
 */

import java.util.Scanner;

public class LessonFive {

    static double myPI = 3.14; // Class Variable

    public static void main(String[] args) {

        // Create method that is not part of a class requires accessModifier
        // accessModifier static returnType methodName(params)

        // Static version
        addThem(1, 2);

        // Non-Stat
        // System.out.println();
        System.out.println("CLASS: Global: " + myPI);
    }

    // Only nested classes can be static.
    // Non-static nested class or Inner class requires Outer class reference.
    public static int addThem(int a, int b) {

        // Local Variable - only accessible within this addThem() method
        double smallPi = 3.140;

        // This declaration overwrites the class variable. Dominant.
        double myPI = 3.0;
        System.out.println("METHOD: Global: " + myPI);

        return 1;

    }

}
