import java.util.Arrays;
/**
 * Created by mwinwood on 7/20/16.
 */

public class LessonNine {

    public static void main(String[] args)
    {
        int[] randomArray;

        int[] numberArray = new int[10];

        randomArray = new int[20];

        randomArray[1] = 2;

        String[] stringArray = {"Just", "Random", "Words"};

        // Populating an array through a loop
        for(int i = 0; i < numberArray.length; i++) {
            numberArray[i] = i;
        }

        int k = 1;
        while(k <= 41) {
            System.out.print('-');
            k++;
        }

        System.out.println();
        for(int j = 0; j < numberArray.length; j++) {
            System.out.print("| " + j + " |");
        }
        System.out.println();
        System.out.println();

        String[][] multiArray = new String[10][10];

        k = 1;
        while(k <= 41) {
            System.out.print('-');
            k++;
        }
        System.out.println();
        System.out.println();

        for(int j = 0; j < multiArray.length; j++) {
            for(int i = 0; i < multiArray[j].length; i++) {
                multiArray[j][i] = i + " " + j;
                System.out.print("| " + multiArray[j][i] + " |");
            }
        }

        System.out.println();
        System.out.println();

        for(String[] rows : multiArray) {
            for(String column: rows) {
                System.out.print("| " + column +  " |");
            }

        }

    }

}
