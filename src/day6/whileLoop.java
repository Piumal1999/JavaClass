package day6;
import java.util.*;

public class whileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Number: ");
        int n = input.nextInt();
        int i = 0;
        while (i<=n){
            System.out.println(i);
            i++;
        }
    }
}
