package HomeWork;

import java.util.Scanner;

public class seriesSumAddition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("***Let's Find the Sum of 'n' number of terms***");
        System.out.println("(1)+(1+2)+(1+2+3)+.......+(1+2+3+...+n)");
        System.out.println("-----------------------------------------------\n");

        System.out.print("Input n: ");
        int n = input.nextInt();
        System.out.println("  ");

        int sum=0;
        for (int i=1; i<=n; i++){
            int term =0;
            for(int r=1; r<=i; r++){
                term = term+r;
                if(r!=i){
                    System.out.print(r+"+");
                }else {
                    System.out.print(r+" = "+term+"\n");
                }
            }

            sum = sum + term;
        }

        System.out.println("\nSum of "+n+" terms in above series: "+sum);
    }
}

