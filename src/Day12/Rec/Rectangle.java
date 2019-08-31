package Day12.Rec;


public class Rectangle {

    //default
    public Rectangle() {
        display();
    }

    //width & height
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
        display();
    }

    //one side
    public Rectangle(int side) {
        width = side;
        height = side;
        display();
    }

    //variables
    int width = 1;
    int height = 1;

    //to get area
    public int getArea() {
        return width * height;
    }

    //to get perimeter
    public int getPerimeter() {
        return 2 * (width + height);
    }

    //to display the rectangle
    public void display() {

        for (int i = 1; i <= height; i++) {
            for (int r = 1; r <= width; r++) {
                System.out.print("❤️");
            }
            System.out.println(" ");
        }

    }


//    public void display2() {
//        System.out.print(" ");
//        for (int j=1; j<=width+1; j++){
//            System.out.print("_");
//        }
//        System.out.println(" ");
//        for (int i = 1; i <= height; i++) {
//            System.out.print("| ");
//            for (int s = 1; s<=width; s++){
//                System.out.print(" ");
//            }
//            System.out.print("|");
//            if (i!=height){
//                System.out.println(" ");
//            }
//
//        }
//        for (int j=1; j<=width; j++){
//            System.out.print("_");
//        }
//
//    }


}
