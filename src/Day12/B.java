package Day12;

public class B {
    B(){
        System.out.println("B()");
    }

    B(int x){
        System.out.println("B(int)");
    }

    B(int x, double y){
        System.out.println("A(int,double)");
    }

    B(double x, int y){
        System.out.println("A(double,int)");
    }

    public static void main(String[] args) {
        B b = new B();
    }
}
