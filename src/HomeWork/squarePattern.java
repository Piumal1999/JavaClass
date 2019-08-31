package HomeWork;

import java.util.*;

public class squarePattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("***Square Pattern Maker***\n");

        System.out.print("Insert the length of a side: ");
        int side = input.nextInt();
        System.out.println(" ");

        if (side==0){
            System.out.println("You can't make a Square from 0 length!!");
            System.exit(0);
        }

        for (int i = 1; i <= side; i++) {
            makeRow(side);
        }
    }

    public static void makeRow(int length) {
        for (int r=1; r<=length; r++){
            if(r==length){
                System.out.println("#");
                break;
            }

            System.out.print("#");
        }

    }
}
