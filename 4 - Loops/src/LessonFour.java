import java.util.Scanner;

/**
 * Created by mwinwood on 6/24/16.
 */
public class LessonFour {

    static Scanner userinput = new Scanner(System.in);

    public static void main(String[] args) {
        LessonFour lesson = new LessonFour();
        // lesson.one();
        lesson.two();
        one();

    }

    public static cvoid one() {
        String contYorN = "Y";

        int h = 1;

        while(contYorN.equalsIgnoreCase("y"))

        {
                System.out.println(h);

                System.out.print("Continue y or n?");

                contYorN = userinput.nextLine();

                h++;
        }
        return;
    }


    public void two() {
        for(int l = 10; l >= 1; l--) {
            System.out.println(l);
        }
        return;
    }

}
