package foundations.logic.gRepetitive_structures;

public class While {
    public static void main(String[] args) {
        int counter = 0;

        while (counter <= 15) {
            System.out.println("Counter: " + counter);
           counter++;
        }
        System.out.println("-----------------------------------\n");

        int counterTwo = 0;

        do {
            System.out.println("Counter do-while: " + counterTwo);
            counterTwo++;
        }while (counterTwo <= 20);
    }
}
