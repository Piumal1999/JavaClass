package HomeWork;

import java.util.*;

public class primesInRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("***Prime Numbers in a Range***");
        System.out.println("--------------------------\n");

        System.out.print("Enter a Number to Start Range: ");
        int startNumber = input.nextInt();
        System.out.print("Enter a Number to End the Range: ");
        int endNumber = input.nextInt();

        System.out.println("\nPrime numbers between " + startNumber + " and " + endNumber + " are: ");

        int count = 0;
        for (int n = startNumber; n <= endNumber; n++) {

            int factors = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    factors += 1;
                    if (factors == 3) {
                        break;
                    }
                }
            }
            if (factors == 2) {
                System.out.print(n + " ");
                count += 1;
            }
        }

        System.out.println("\n\nTotal prime numbers between " + startNumber + " and " + endNumber + ": " + count);


    }
}
