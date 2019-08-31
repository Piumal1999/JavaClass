package Day12.Circle;

public class Circle {
    final static double pi = Math.PI;

    //default constructor
    Circle(){

    }

    //double
    Circle(double radius){
        this.radius = radius;
    }

    //variables
    double radius = 5;

    //to get the diameter
    public double getDiameter(){
        return radius*2;
    }

    //to get the area
    public double getArea(){
        double area = pi*radius*radius;
        return area;
    }

    //to get the perimeter
    public double getPerimeter(){
        double peri = 2*pi*radius;
        return peri;
    }
}
