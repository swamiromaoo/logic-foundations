package foundations.logic.fStructures;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int weekDays = scanner.nextInt();

        if (weekDays <= 7) {
            switch (weekDays) {
                case 0:
                    System.out.println("You can only between 1 and 7, do it again" +
                            " \n-----------Thank You!-----------");
                    break;
                case 1:
                    System.out.println("Sunday");
                    break;
                case 2:
                    System.out.println("Monday");
                    break;
                case 3:
                    System.out.println("Tuesday");
                    break;
                case 4:
                    System.out.println("Wednesday");
                    break;
                case 5:
                    System.out.println("Thursday");
                    break;
                case 6:
                    System.out.println("Friday");
                    break;
                case 7:
                    System.out.println("Saturday");
                    break;
            }
        } else {
            System.out.println("You can only between 1 and 7, do it again " +
                    "\n-----------Thank You!-----------");
        }
    }
}

