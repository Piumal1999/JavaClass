package day6;
import java.util.Scanner;
import java.lang.String;

public class formatting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            int x=sc.nextInt();
            sc.nextLine();
            String s1=sc.next();
            System.out.printf("%03d", s1);
            System.out.printf("'%15s' %n", x);
        }
        System.out.println("================================");

    }
}
