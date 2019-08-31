package HomeWork;
import java.util.*;

public class sumToN {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);

        System.out.println("Let's find the sum of natural numbers upto a number!!");
        System.out.println("*----------------------------------------------*\n");
        System.out.print("Press Enter to Continue: ");
        enter.nextLine();

        System.out.print("Input a Number: ");
        int n = enter.nextInt();

        int sum=0;

        System.out.println("\nNatural numbers upto " + n + " are: ");
        for (int i=1; i<=n; i++){
            if (i!=n){
                System.out.print(i+",");
            }else{
                System.out.println(i+"\n");
            }
            sum = sum + i;
        }
        System.out.println("The sum of natural numbers upto " + n + " is: "+sum);
    }
}
