package Day6Logical;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println("Enter the Number to check perfect number");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int i = 1;
        int sum = 0;
        for (i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == num) {
            System.out.print(num + " is a perfect number");
        } else {
            System.out.println("not a perfect number");
        }
    }
}
