package HomeWork;

import java.util.*;

class CurrencyConverter {
    public static void main(String[] args) {
        System.out.println("***Currency Converter***\n");
        converter();

    }

    public static void converter() {
        Scanner input = new Scanner(System.in);
        System.out.print("Press Enter to Continue : ");
        Double cur1, cur2;
        String i = input.nextLine();

        System.out.println("1) USD to LKR");
        System.out.println("2) LKR to USD");
        System.out.println("3)  SR to LKR");
        System.out.println("4) LKR to  SR");
        System.out.println("5) Exit\n");
        System.out.print("Choose you option 1-5 : ");
        byte option = input.nextByte();

        switch (option) {
            case 1:
                System.out.print("USD : ");
                cur1 = input.nextDouble();
                cur2 = (cur1 * 176.63);
                System.out.println(cur1 + "USD  =  " + cur2 + "LKR");
                converter();

            case 2:
                System.out.print("LKR  :");
                cur1 = input.nextDouble();
                cur2 = (cur1 * 0.0057);
                System.out.println(cur1 + "LKR  =  " + cur2 + "USD");
                converter();

            case 3:
                System.out.print("SR : ");
                cur1 = input.nextDouble();
                cur2 = (cur1 * 47.11);
                System.out.println(cur1 + "SR  =  " + cur2 + "LKR");
                converter();

            case 4:
                System.out.print("LKR : ");
                cur1 = input.nextDouble();
                cur2 = (cur1 * 0.021);
                System.out.println(cur1 + "LKR  =  " + cur2 + "SR");
                converter();

            case 5:
                System.out.println("Bye");

            default:
                System.out.println("Error");
        }

    }
}