import java.util.Scanner;

public class Finance {
    public static void main(String[] arguments) {

        Scanner inout = new Scanner(System.in);
        System.out.println("Enter Savings Amount: ");
        int savings = inout.nextInt();
        double intrest = 1.00417;
        int month = 1;
        double NewAmount = 0;
        NewAmount = (savings) * intrest;

        while(month<=5){
            NewAmount = (savings + NewAmount) * intrest;
            month++;
        }
        System.out.println("Amount after 6 months: "+ NewAmount);

    }
}
