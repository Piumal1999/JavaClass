package Day5;

import java.util.*;
public class A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Any Number : ");
        int x = input.nextInt();
        if (x%2==0) {
            System.out.println(x + " is an even number");
        }else {
            System.out.println(x + " is an odd number");
        }
    }
}
