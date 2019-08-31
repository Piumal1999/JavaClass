package Day9;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Player p1 = new Player();
        System.out.println("Welcome Player!! What's your name?");
        p1.name = input.nextLine();
        Player.increasePlayerCount();
        p1.displayName();
        p1.display();

        Gun ak47 = new Gun();
        ak47.img = "︻╦╤─ ";
        Gun m416 = new Gun();
        m416.img = "⌐╦╦═─";

        p1.weapon = m416;

        System.out.println(p1.weapon.img);

        p1.weapon.displayAmmo();

        System.out.println(" ");
        System.out.println("----------------------------------");

//        Player p2 = new Player();
//        System.out.println("Welcome Player!! What's your name?");
//        p2.name = input.nextLine();
//        Player.increasePlayerCount();
//        p2.displayName();
//        p2.display();
//
//        System.out.println(" ");
//        System.out.println("----------------------------------");
//
//        Player.displayCount();



    }


}
