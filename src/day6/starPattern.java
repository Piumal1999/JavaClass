package day6;

public class starPattern {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            for (int r=5; r>=i; r--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
