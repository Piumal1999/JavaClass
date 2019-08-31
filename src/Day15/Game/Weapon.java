package Day15.Game;

public class Weapon {
    int ammo;
    String sound;

    public void shoot(){
        ammo-=1;
        System.out.println(sound);
    }

}
