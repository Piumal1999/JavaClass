package Day16.Dogs;

public class WalBalla extends Balla {
    public WalBalla() {
    }

    WalBalla(String name, int age){
        super(name, age);
    }

    @Override
    public void buranawa() {
        System.out.println("Foo!!");
    }


}
