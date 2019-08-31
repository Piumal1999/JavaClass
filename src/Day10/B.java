package Day10;

public class B {
    public static void main(String[] args) {
        System.out.println(m());
    }

    public static int m() {
        if (true){
            System.out.println("A");
            return 10;
        }
        System.out.println("B");
        return 20;
    }
}
