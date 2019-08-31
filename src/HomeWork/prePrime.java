package HomeWork;

import java.util.*;

public class prePrime {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);

        System.out.println("Previous Prime Number Finder");
        System.out.println("*----------------------------------------------*\n");
        System.out.print("Press Enter to Continue: ");
        enter.nextLine();

        System.out.print("\nInput a Number: ");
        int n = enter.nextInt();

        checkPrime(n);

        if(n==2 || n==1){
            System.out.println("No Prime Numbers Before "+n);
        }

        for (int i = n-1; i>=0 ; i--){
            int factors = 0;
            for (int r=1; r<=i; r++){
                if (i%r==0){
                    factors +=1;
                    if (factors==3){
                        break;
                    }
                }
            }
            if(factors==2){
                System.out.println(i+" is the last Prime Number before "+n);;
                break;
            }

        }

    }

    public static void checkPrime(int n) {
        int factors = 0;

        for (int i=1; i<=n; i++){
            if(n==1){
                System.out.println("Its not a Prime");
                break;
            }
            if (n%i==0){
                factors +=1;
                if (factors==3){
                    break;
                }
            }
        }
        if(factors==2){
            System.out.println(n + " is also a Prime");
        }
    }
}
