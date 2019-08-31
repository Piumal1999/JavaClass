package HomeWork;

import java.util.*;

public class multiTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("***Make your own Multiplication Table***\n");

        System.out.print("Upto which number you want?: ");
        int n = input.nextInt();
        System.out.println(" ");

        if (n == 0) {
            System.out.println("0x0 = 0  :D");
            System.exit(0);
        }

        multiplicationRow(n);


    }

    public static void multiplicationRow(int n) {
        for (int i = 1; i <= 10; i++) {
            for (int r = 1; r <= n; r++) {
                if (r == n) {
                    System.out.println(i + " x " + r + " = " + i * r);
                    break;
                }
                System.out.print(i + " x " + r + " = " + i * r + "\t\t");
            }
        }
    }
}
