package foundations.logic.eData_inputOutput;

public class Casting {
    public static void main(String[] args) {
        int numberOne = 10;
        double numberDouble = numberOne;

        double double2 = 10.5;
        int numberInt = (int) double2;

        Integer numberInteger = 10;
        String numberString = numberInteger.toString();

        String nStringTwo = "1234";
        Integer convertedNumber = Integer.parseInt(nStringTwo);
        Double convertedNumberDouble = Double.parseDouble(nStringTwo);
        Long convertedLong = Long.parseLong(nStringTwo);

        Long numberLong = 15L;
        String nStringLong = numberLong.toString();

        System.out.println(numberDouble);
        System.out.println(numberInt);
        System.out.println(numberInteger + " " + numberString);
        System.out.println(nStringTwo + " " + convertedNumber +" "+ convertedNumberDouble + " " + convertedLong);

    }
}
