package HomeWork;
import java.util.*;

public class sumTo10 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);

        System.out.println("Let's find the sum of first 10 natural numbers!!");
        System.out.println("*----------------------------------------------*\n");
        System.out.print("Press Enter to Continue: ");
        enter.nextLine();


        int sum=0;
        System.out.println("\nFirst 10 natural numbers are: ");
        for (int i=1; i<=10; i++){
            if (i!=10){
                System.out.print(i+",");
            }else{
                System.out.println(i+"\n");
            }
            sum = sum + i;
        }
        System.out.println("The sum of first 10 natural numbers: "+sum);
    }
}
