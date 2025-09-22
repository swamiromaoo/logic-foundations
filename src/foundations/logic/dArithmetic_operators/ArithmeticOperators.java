package foundations.logic.dArithmetic_operators;

public class ArithmeticOperators {
    public static void main(String[] args) {

        double bread = 3.00;
        double eggs = 2.50;
        double coffee = 7.50;
        double butter = 3.75;
        double discounted = 2.50;
        double weeks = 7;

        double totalValue = bread + eggs + coffee + butter;
        double discountedValue = totalValue - discounted;
        double dividedValue = discountedValue / 2;
        double valueWeek = totalValue * weeks;

        System.out.println("\nTotal purchase amount: $" + totalValue);
        System.out.println("Discounted value: $" + discountedValue);
        System.out.println("Divided value: $" + dividedValue);
        System.out.println("Value of the week: $" + valueWeek);


    }
}
