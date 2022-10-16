package Day6Logical.J_Unit;

import java.util.Scanner;

public class TempConversion {
    static double celsius(double f) {
        return (f - 32) * 5 / 9;
    }
    public static void main(String[] args) {
        double num1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Temperature in Fahrenheit to Convert= ");
        num1 = sc.nextDouble();
        System.out.println("After Converting= " + celsius(num1));


    }
}
