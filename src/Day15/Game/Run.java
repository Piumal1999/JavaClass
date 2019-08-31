package Day15.Game;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Soldier s1 = new Soldier();
        Soldier s2 = new Soldier();
        Soldier s3 = new Soldier();

        Scanner input = new Scanner(System.in);

        while ((s1.health != 0 && s2.health != 0) || (s2.health != 0 && s3.health != 0) || (s3.health != 0 && s1.health != 0)) {
            int damage;
            int i;

            System.out.println("Player 1's Turn");
            System.out.println("Shoot to which player?");
            i = input.nextInt();
            damage = (int) (Math.random() * 20);
            if (i == 2) {
                s1.w1.shoot();
                s2.health -= damage;
                System.out.println("player 2 lost " + damage + " health");
            }
            if (i == 3) {
                s1.w1.shoot();
                s3.health -= damage;
                System.out.println("player 3 lost " + damage + " health");
            }

            System.out.println("Player 2's Turn");
            System.out.println("Shoot to which player?");
            i = input.nextInt();
            damage = (int) (Math.random() * 20);
            if (i == 1) {
                s2.w1.shoot();
                s1.health -= damage;
                System.out.println("player 1 lost " + damage + " health");
            }
            if (i == 3) {
                s2.w1.shoot();
                s3.health -= damage;
                System.out.println("player 3 lost " + damage + " health");
            }

            System.out.println("Player 3's Turn");
            System.out.println("Shoot to which player?");
            i = input.nextInt();
            damage = (int) (Math.random() * 20);
            if (i == 1) {
                s3.w1.shoot();
                s1.health -= damage;
                System.out.println("player 1 lost " + damage + " health");
            }
            if (i == 2) {
                s3.w1.shoot();
                s2.health -= damage;
                System.out.println("player 2 lost " + damage + " health");
            }

            System.out.println(s1.health+" "+s2.health+" "+s3.health);
        }


    }
}
