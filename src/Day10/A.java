package Day10;
import java.util.Scanner;

public class A {

    //-----------main method----------------
    public static void main(String[] args) {
        // run getMyName method
        System.out.println(" ");
        System.out.println(getMyName());
    }

    //----------To get your name------------
    public static String getMyName(){

        Scanner input = new Scanner(System.in);
        System.out.print("Input Your Name: ");
        return input.nextLine();
    }
}
