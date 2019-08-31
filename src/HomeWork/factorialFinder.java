package HomeWork;
import java.util.*;

public class factorialFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("**Factorial Finder**");
        System.out.println("---------------------");

        System.out.print("Which number's factorial you need? : ");
        int n = input.nextInt();
        int factorial = 1;

        for (int i=1; i<=n; i++){
            factorial *= i;
        }
        System.out.println(n+"! = "+ factorial);
    }
}
