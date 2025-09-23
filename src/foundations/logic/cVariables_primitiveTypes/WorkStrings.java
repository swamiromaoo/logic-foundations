package foundations.logic.cVariables_primitiveTypes;

public class WorkStrings {
    public static void main(String[] args) {

        String name = "Peter";
        String lastName = " Jordan";

        int stringsize = name.length();
        boolean equal = name.equals(lastName);
        String fullName = name.concat(lastName);

        System.out.println("\nHello " + name.toUpperCase() + ", your name has " + stringsize +" characters" );
        System.out.println("The Names are the same: "+ equal);
        System.out.println("Full Name: " + fullName.toUpperCase());

    }

}
