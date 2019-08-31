package Day16.Dogs;

public class Balla {
    Balla(){

    }

    Balla(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void display(){
        System.out.println("~;=;*`");
    }

    public void buranawa(){
        System.out.println("Boo!");
    }

    public byte noOfLegs = 4;
    public String name = "No name";
    public int age = 0;

    @Override
    public String toString(){
        return this.name;
    }
}
