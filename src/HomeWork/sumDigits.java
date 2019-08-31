package HomeWork;

import java.util.*;

public class sumDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Let's find the sum of the Digits in a Number!!");
        System.out.println("*----------------------------------------------*\n");
        System.out.print("Press Enter to Continue: ");
        input.nextLine();

        System.out.print("Input a Number: ");
        int number = input.nextInt();
        int numberBackUp = number;
        int sum = 0;

        for(int i=1; i<=11; i++){
            int x = number%10;
            number = number/10;
            sum = sum + x;
        }
        System.out.println("\nThe Sum of the Digits in "+numberBackUp+": "+sum);
    }
}
