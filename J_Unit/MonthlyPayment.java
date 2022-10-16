package Day6Logical.J_Unit;

import java.util.Scanner;

public class MonthlyPayment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal Amount = ");
        double principal = sc.nextDouble();
        System.out.print("Enter Rate of Interest = ");
        double rate = sc.nextDouble();
        rate = (rate / 100) / 12;
        System.out.print("Enter Time period in years = ");
        double time = sc.nextDouble();
        time = time * 12;
        double p = (principal * rate) / (1 - Math.pow(1 + rate, -time));

        System.out.println("Monthly Payment= " + p);

    }
}