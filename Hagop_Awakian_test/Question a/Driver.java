import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {

    static boolean overlaps(Pair<Integer, Integer> pair_one, Pair<Integer, Integer> pair_two){
        return (pair_two.getFirst() == pair_one.getFirst()+1) && (pair_two.getSecond() == pair_one.getSecond()+1);
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int inputNum = 1;
        ArrayList<Integer> numList = new ArrayList<>(4);
        Pair<Integer, Integer> first_pair = new Pair();
        Pair<Integer, Integer> second_pair = new Pair();

        for(int i = 0; i < 4; i++){
            if(i < 2){
                System.out.print("Enter input number " + inputNum++ + " for the first line: ");
                try{
                    numList.add(keyboard.nextInt());
                    if(inputNum == 2){
                        inputNum = 1;
                    }
                }
                catch(InputMismatchException e){
                    System.out.println("Error: this program only takes numbers as an input. Program will now exit.");
                    System.exit(0);
                }

            }
            else{
                System.out.print("Enter input number " + inputNum++ + " for the second line: ");
                try{
                    numList.add(keyboard.nextInt());
                }
                catch(InputMismatchException e){
                    System.out.println("Error: this program only takes numbers as an input. Program will now exit.");
                    System.exit(0);
                }
            }
        }
        keyboard.close();

        first_pair.setFirst(numList.get(0));
        first_pair.setSecond(numList.get(1));
        second_pair.setFirst(numList.get(2));
        second_pair.setSecond(numList.get(3));

        System.out.println("Do lines overlap? Response: " + overlaps(first_pair, second_pair));

    }
}
