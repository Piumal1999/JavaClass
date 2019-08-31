package HomeWork;
import java.util.*;

public class seriesSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("***Let's Find the Sum of 'n' number of terms***");
        System.out.println("(1*1)+(2*2)+(3*3)+.......+(n*n)");
        System.out.println("-----------------------------------------------\n");

        System.out.print("Input n: ");
        int n = input.nextInt();
        System.out.println(" ");
        int sum=0;
        for (int i=1; i<=n; i++){
            int multiple = i*i;
            System.out.println(i+"x"+i+"="+multiple);
            sum += multiple;
        }
        System.out.println("\nSum of "+n+" terms of above series: "+sum);
    }
}

