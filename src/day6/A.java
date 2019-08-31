package day6;

public class A {
    public static void main(String[] args) {
        int n = 10;
        n *= 2 + 5;
        System.out.println(n);

        n = 10;
        n = (n * 2) + 5;
        System.out.println(n);

        n = 10;
        n = n * (2 + 5);
        System.out.println(n);
    }
}
