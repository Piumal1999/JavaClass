package Day16.Dogs;

public class Run {
    public static void main(String[] args) {
        WalBalla upali = new WalBalla();
        upali.buranawa();
        upali.display();
        System.out.println(upali.toString());
        System.out.println(upali);

        

        Pug randila = new Pug();
        randila.buranawa();
        randila.display();

        Bulldog wilba = new Bulldog();
        wilba.buranawa();
        wilba.display();

        Balla god = new Balla();
        god.buranawa();
        god.display();

        Balla myBalla = new Balla("my balla", 5);
        WalBalla myBalla2 = new WalBalla("my balla", 5);
    }
}
