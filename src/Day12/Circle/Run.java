package Day12.Circle;

public class Run {
    public static void main(String[] args) {

        //create a circle
        Circle c1 = new Circle(1);
        System.out.println("Diameter - "+c1.getDiameter());
        System.out.println("Area - "+c1.getArea());
        System.out.println("Perimeter - "+c1.getPerimeter());
        System.out.println(" ");

        //create a circle
        Circle c2 = new Circle(5.3);
        System.out.println("Diameter - "+c2.getDiameter());
        System.out.println("Area - "+c2.getArea());
        System.out.println("Perimeter - "+c2.getPerimeter());
        System.out.println(" ");

        //create a circle
        Circle c3 = new Circle(6);
        System.out.println("Diameter - "+c3.getDiameter());
        System.out.println("Area - "+c3.getArea());
        System.out.println("Perimeter - "+c3.getPerimeter());
        System.out.println(" ");


    }
}
