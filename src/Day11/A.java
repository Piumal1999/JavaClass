package Day11;

public class A {
    public A(){
        System.out.println("Inside constructor");
    }
    public A(int x){
        System.out.println("Inside constructor");
        System.out.println(x);
    }

    public static void main(String[] args) {
        System.out.println("inside main");
        A a1 = new A();
        A a2 = new A();
        A a3 = new A(10);
    }
}
