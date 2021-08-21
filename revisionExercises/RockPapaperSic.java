import java.util.Scanner;
import java.util.Random;

public class RockPapaperSic {
    public static void main(String[] arguments) {

        Scanner inout = new Scanner(System.in);
        System.out.println("Choose Rock (0) Paper (1) or Scissors (2): ");
        int pChoice = inout.nextInt();
        Random rand = new Random();
        int cChoice = rand.nextInt(3);
        String[] choices = new String[]{"Rock","Paper","Scissors"};
        String printC = String.format("You chose: %s\nComputer chose: %s\n", choices[pChoice], choices[cChoice]);

        if(pChoice==0 && cChoice==2){
           System.out.println(printC);
           System.out.println("Rock Beats Scissors You Win!");
        }
        else if(pChoice==1 && cChoice==0){
            System.out.println(printC);
            System.out.println("Paper Beats Rock You Win!");
        }
        else if(pChoice==2 && cChoice==1){
            System.out.println(printC);
            System.out.println("Scissors Beats Paper Ypu Win!");
        }
        else if(pChoice==cChoice){
            System.out.println(printC);
            System.out.println("DRAW!");
        }
        else{
            System.out.println(printC);
            System.out.println("You Lose");
        }

    }
}
