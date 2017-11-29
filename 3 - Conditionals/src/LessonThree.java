/**
 * Created by mwinwood on 6/6/16.
 */
public class LessonThree {

    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 50);

        if(randomNumber < 25) {
            System.out.println("The Random number is less than 25");
        }
        else if(randomNumber > 40) {
            System.out.println("The Random number is greater than 40");
        }
        else if(randomNumber == 18) {
            System.out.println("The Random number is equal to 18");
        }
        else if(randomNumber != 40) {
            System.out.println("The Random number is not equal to 40");
        }
        else {
            System.out.println("No condition was met");
        }

        System.out.println("The Random number is: " + randomNumber);

        int output = (randomNumber > 25) ? 1 : 2;

        System.out.println(output);


        char theGrade = 'B';

        switch (theGrade) {
            case 'B':
                System.out.println("The grade is B");
                break;
            case 'C':
                System.out.println("The grade is C");
                break;
            case 'D':
                System.out.println("The grade is D");
                break;
            default:
                System.out.println("None of the cases above");
                break;

        }

    }

}
