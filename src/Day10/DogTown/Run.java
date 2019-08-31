package Day10.DogTown;

public class Run {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.name = "Tommy";
        d1.age = 5;
        if(d1.isOld()){
            System.out.println(d1.name+" is Old");
        }else {
            System.out.println(d1.name+" is not Old");
        }
        System.out.println(d1.name+" has "+d1.getRemainingYears()+" years Remaining");
        d1.bark();

        System.out.println("\n\n");

        Dog d2 = new Dog();
        d2.name = "Jimmy";
        d2.age = 10;

        if(d2.isOld()){
            System.out.println(d2.name+" is Old");
        }else {
            System.out.println(d2.name+" is not Old");
        }
        System.out.println(d2.name+" has "+d2.getRemainingYears()+" years Remaining");
        d2.bark();

    }
}
