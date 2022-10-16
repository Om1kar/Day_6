package Day6Logical.J_Unit;

import java.util.Scanner;

public class DicimalToBinary {
    static void checkBinary(int num) {
        int binary[] = new int[10];
        int i = 0;
        while (num > 0) {
            int k = num % 2;
            binary[i++] = k;
            num = num / 2;
        }
        System.out.print("Binary Number is = ");
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binary[j] + "");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number- ");
        int num = sc.nextInt();
        checkBinary(num);
    }
}
