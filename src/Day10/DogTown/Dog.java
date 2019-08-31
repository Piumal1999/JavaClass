package Day10.DogTown;

public class Dog {
    static byte noOfLegs = 4;
    static byte life = 10;
    static byte oldAge = 6;
    String name;
    byte age;

    public boolean isOld(){
        if (age>oldAge) {
            return true;
        }else {
            return false;
        }
    }

    public void bark(){
        if (isOld()){
            System.out.println("wooooo");
        }else{
            System.out.println("booooo");
        }
    }

    public int getRemainingYears(){
        return life-age;
    }
}
