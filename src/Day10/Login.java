package Day10;

import java.util.Scanner;

public class Login {
    static int attempts = 3;
    public static void main(String[] args) {
        getLoginDetails();
    }

    public static boolean isLoginSuccess(String username, String password) {
        if (username.equals("root") && password.equals("root123")) {
            return true;
        } else {
            return false;
        }
    }

    public static void getLoginDetails() {
        Scanner input = new Scanner(System.in);

        while(attempts>0){
            System.out.print("Input Username: ");
            String username = input.nextLine();

            System.out.print("Input Password: ");
            String password = input.nextLine();

            if (isLoginSuccess(username, password)) {
                System.out.println("Login Successful!!");
                break;
            } else {
                System.out.println("Login Failed. Try Again");
                Login.attempts -= 1;
                System.out.println("You have only "+Login.attempts+" attempts left!\n");
                getLoginDetails();

            }
        }


    }
}

