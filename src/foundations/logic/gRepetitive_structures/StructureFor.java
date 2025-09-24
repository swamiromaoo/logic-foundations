package foundations.logic.gRepetitive_structures;

public class StructureFor {
    public static void main(String[] args) {
        for (int count = 0; count < 7; count++) {
            System.out.println("Counter For: " + count);

        }
        System.out.println("\n---------------------------------");

        int[] numbers = new int[5];

        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        System.out.println("\nFirst Number: "+numbers[0]);

        for (int i = 0; i < numbers.length ; i++) {
            System.out.println("Element at Index "+i+ ": "+ numbers[i]);

        }
    }
}
