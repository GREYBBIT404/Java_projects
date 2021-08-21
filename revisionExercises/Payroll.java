import java.util.Scanner;

public class Payroll {
    public static void main(String[] arguments) {

        Scanner inout = new Scanner(System.in);
        System.out.println("Name: ");
        String name = inout.nextLine();
        System.out.println("Number of Hours Worked: ");
        int hours = inout.nextInt();
        System.out.println("Hourly Rate: ");
        double rate = inout.nextDouble();
        System.out.println("Federal Tax: ");
        double fTax = inout.nextDouble();
        System.out.println("State Tax: ");
        double sTax = inout.nextDouble();

        double grossPay = hours * rate;
        fTax = grossPay * (fTax/100);
        sTax = grossPay * (sTax/100);
        double deductions = (fTax+sTax);
        double netPay = (grossPay - deductions);

        System.out.printf("Name: %s\n", name);
        System.out.printf("Gross Pay: %f\n", grossPay);
        System.out.printf("Deductions:\n Federal Tax: %f\n State Tax: %f\n Total Deductions: %f\n", fTax, sTax, deductions);
        System.out.printf("Net Pay: %f", netPay);
    }
}
