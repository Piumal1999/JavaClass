package Day10;
import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        System.out.println( getRandomNumber(20));
        System.out.println(getRandomNumber2());


    }

    // to get a random number
    public static int getRandomNumber(int toNum) {
        int x = (int)(Math.random() *toNum +1);
        return x;
    }

    public static int getRandomNumber2() {
        Random rand = new Random();
        int value = rand.nextInt();
        return value;
    }
}
