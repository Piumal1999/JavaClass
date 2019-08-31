package Day11.Game;

import java.util.Scanner;

public class Game {
    static int count = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Soldier s1 = new Soldier();
        s1.name = "kumuditha";
        s1.shoot();

        Soldier s2 = new Soldier();
        s2.name = "sumedha";
        s2.shoot();

        Soldier s3 = new Soldier();
        s3.name = "heshan";
        s3.shoot();

        System.out.println(count);


        while (true) {
            System.out.println("Press 1 to shoot!\n\n");
            int i = input.nextInt();
            if (i == 1) {
                s1.shoot();
            }else if (i==2) {
                System.out.println("Tuk!");
                if(s1.mags==0){
                    System.out.println("No ammo!!");
                }
                s1.reload();
            } else if (i==0) {
                System.out.println("Bye");
                break;
            } else {
                System.out.println("Target missed! Press 1 to shoot again!");
            }
        }
    }
}
