package Day9;

import java.util.Scanner;

public class Player {
    static byte playerCount;
    byte health = 100;
    String name = "Unknown Player";
    Gun weapon;

    public static void increasePlayerCount() {
        Player.playerCount++;

    }

    public static void displayCount() {
        System.out.printf("Players : %d", playerCount);
    }

    public void displayName() {
        System.out.println(name);
    }


    public void display() {
        System.out.println("  (* *)   ");
        System.out.println("  \\ @ /   ");
        System.out.println("   | |    ");
        System.out.print("  >-");
        weapon.displayImg();
        System.out.print("  ");
        System.out.println("   | |^   ");
        System.out.println("  // \\\\   ");
        System.out.println(" //   \\\\  ");

    }



}