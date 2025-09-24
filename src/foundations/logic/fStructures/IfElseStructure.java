package foundations.logic.fStructures;

public class IfElseStructure {
    public static void main(String[] args) {
//        int age = 38;
//
//        if (age >= 18) {
//            System.out.println("You are of legal age!");
//        }
//        else {
//            System.out.println("You are a minor!!");
//        }

//        boolean itsRaining = true;
//
//        if (!itsRaining){
//            System.out.println("Let's go out");
//        }
//        else {
//            System.out.println("Let's stay at home");
//        }

        boolean thereIsMoney = false;
        boolean itHasACard = true;

        if (thereIsMoney && itHasACard){
            System.out.println("Let's order food and beer!");
        } else if (thereIsMoney || itHasACard) {
            System.out.println("Let's just order food");
            
        }else {
            System.out.println("Let's not order food!");
        }

       String message = (thereIsMoney) ? "Let's just order food" : "Let's not order food";
        System.out.println(message);
        if (thereIsMoney){
            System.out.println("Let's just order food");
        }else {
            System.out.println("Let's not order food");
        }
    }


}