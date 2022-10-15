package Day6Logical;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms of the fibonacci series is- ");
        int num = sc.nextInt();
        int a = 0;
        int b = 1;
        int c;
        System.out.println(a);
        System.out.println(b);
        for (int i=3 ; i<=num ; i++)
        {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}
