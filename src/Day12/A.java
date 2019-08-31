package Day12;

public class A {

    public A() {
        System.out.println("Nothing");
    }

    public A(int x) {
        System.out.println("int");
    }

    public A(double d) {
        System.out.println("double");
    }

    public A(boolean b) {
        System.out.println("boolean");
    }

    public static void main(String[] args) {
        A a = new A(5);
        A d = new A(5.6);
        A b = new A(true);
        A n = new A();
    }
}
