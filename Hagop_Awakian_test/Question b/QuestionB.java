import java.util.Scanner;

public class QuestionB {

    static boolean isNumber(String aString){

        try{
            Double.parseDouble(aString);
            return true;
        }
        catch (NumberFormatException e){
            return false;
        }
    }

    static void greaterThan(String a, String b){

        if(!isNumber(a) || !isNumber(b)){
            System.out.println("Error: one of the values entered is not a number.");
            return;
        }
        System.out.print("Is " + a + " greater than " + b + "? Result: ");
        System.out.println(Double.compare(Double.parseDouble(a), Double.parseDouble(b)) > 0 ? "yes":"no");
    }

    public static void main(String[] args) {

        System.out.println("-----------Test Cases-----------\n");

        greaterThan("1.2", "1.3");
        greaterThan("1.3", "1.2");
        greaterThan("1", "2");
        greaterThan("2", "1");
        greaterThan("a", "b");
    }
}
