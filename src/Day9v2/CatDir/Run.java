package Day9v2.CatDir;

public class Run {
    public static void main(String[] args) {
        Cat tom = new Cat();
        Cat jerry = new Cat();
        tom.color = "Red";
        jerry.color = "Green";

        tom.printColor();
        jerry.printColor();
    }
}
