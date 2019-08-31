package HomeWork;

import java.util.*;

public class primeChecker {
    public static void main(String[] args) {
        System.out.println("***Prime Number Checker***\n");
        checker();
    }
    public static void checker(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int number = input.nextInt();
        int factors = 0;

        for (int i=1; i<=number; i++){
            if(number==1){
                System.out.println("Its not a Prime");
                break;
            }
            if (number%i==0){
                factors +=1;
                if (factors==3){
                    System.out.println("Its not a Prime");
                    System.out.println("--------------------------");
                    break;
                }
            }
        }
        if(factors==2){
            System.out.println("Congratz!! Its a Prime");
            System.out.println("--------------------------");
        }

        System.out.println("\n1) Try Another Number");
        System.out.println("2) Exit");
        System.out.print("Enter your option: ");
        int option = input.nextInt();
        if(option==1){
            System.out.println(" ");
            checker();
        }else{
            System.out.println("Thank you!");
        }
    }
}
