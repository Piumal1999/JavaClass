package Day8;

public class C {
    int i;
    int j = 10;

    public static void main(String[] args) {
        C a1 = new C();
        System.out.println(a1.i);
        System.out.println(a1.j);

        C a2 = new C();
        a2.i = 20;
        System.out.println(a2.i);
        System.out.println((a2.j));
    }
}
