package Day11.Game;

public class Soldier {

    byte life = 100;
    String name = " ";
    short ammo = 25;
    byte mags = 5;
    byte ammoPerMag = 30;

    Soldier(){
        Game.count++;
        System.out.println("Soldier created!");
    }

    public void shoot() {
        if (ammo == 0) {
            System.out.println("click!");
            System.out.println("no ammo");
            System.out.println("Press 2 to Reload!");
        } else {
            ammo--;
            System.out.println("doom!!");
            System.out.println(name + " has " + ammo + " ammo remaining!");
        }
    }

    public void reload(){
        mags--;
        ammo = ammoPerMag;
    }

}
