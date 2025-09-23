package foundations.logic.eData_inputOutput;

import java.util.Scanner;

public class DataInputOutput {
    public static void main(String[] args) {

//        System.out.println("I do the print and skip the line");
//        System.out.print("I do the print on the same line");
//        System.out.printf("I do the formatted print");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Enter how much you receive: ");
        double salary = scanner.nextDouble();

        System.out.println("Enter if you are working yes(true) or no(false)");
        boolean job = scanner.nextBoolean();


        System.out.println("\nName: " + name.toUpperCase() + "\nAge: " + age + "\nSalary: " + salary +  "\nWorking: " + job);

    }
}
