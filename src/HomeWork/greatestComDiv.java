package HomeWork;

import java.util.*;

public class greatestComDiv {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("***Greatest Common Divider Finder***");
        System.out.println("------------------------------------\n");

        System.out.print("Enter first Number: ");
        int n1 = input.nextInt();
        System.out.print("Enter second Number: ");
        int n2 = input.nextInt();

        int GCD = 1;

        for (int i = 1; i <= 100; i++) {
            if (n1 > n2) {
                if (n1 % n2 == 0) {
                    GCD = n2;
                    break;
                }
                int rem = n1 % n2;
                n1 = n2;
                n2 = rem;
            } else if (n2 > n1) {
                if (n2 % n1 == 0) {
                    GCD = n1;
                    break;
                }
                int rem = n2 % n1;
                n2 = n1;
                n1 = rem;
            }
        }
        System.out.println("The Greatest Common Divider of " + n1 + " and " + n2 + " is: " + GCD);
    }

    public static void GCD() {

        Scanner input = new Scanner(System.in);

        System.out.println("***Greatest Common Divider Finder***");
        System.out.println("-----------------------------------\n");

        System.out.print("Enter first Number: ");
        int n1 = input.nextInt();
        System.out.print("Enter second Number: ");
        int n2 = input.nextInt();

        int GCD = 0;

        if(n1>n2){
            for (int i=1; i<=n2; i++){
                if(n1%i==0 && n2%i==0){
                    GCD = i;
                }
            }
        }else{
            for (int i=1; i<=n1; i++){
                if(n1%i==0 && n2%i==0){
                    GCD = i;
                }
            }
        }

    }




//    public static void nextPrime(){
//        int n=10;
//        for (int i = n; i<=1000 ; i++){
//            int factors = 0;
//            for (int r=1; r<=i; r++){
//                if (i%r==0){
//                    factors +=1;
//                    if (factors==3){
//                        break;
//                    }
//                }
//            }
//            if(factors==2){
//                System.out.println(i);
//                n = i;
//                break;
//            }
//
//        }
//        System.out.println(n);
//    }
}
