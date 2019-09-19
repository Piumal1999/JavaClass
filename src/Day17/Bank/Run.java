package Day17.Bank;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Run {

    //current user
    private static User currentUser = null;

    public static void main(String[] args) {

        ArrayList<User> users = new ArrayList<User>();
        //read the file and fill the arraylist
        readFile(users);

        //users choice
        int option = 0;

        while (option != 3) {

            Scanner input = new Scanner(System.in);

            //main menu
            System.out.println("Welcome to Peoples Bank!");
            System.out.println("------------------------");

            System.out.println("1) Login");
            System.out.println("2) Create a new Account");
            System.out.println("3) Exit");

            System.out.print("Choose you option 1-3 : ");
            option = input.nextInt();
            System.out.println("------------------------");

            //choices
            if (option == 1) {
                //login
                System.out.println(" ");
                login(users);
            } else if (option == 2) {
                //add new user
                System.out.println(" ");
                addNewUser(users);
            } else if (option == 3) {
                //exit
                System.out.println(" ");
                System.out.println("Thank you! Have a nice Day!");
            } else {
                //invalid input
                System.out.println(" ");
                System.out.println("Invalid Input. Press Enter to try again");
                input.nextLine();
                System.out.println(" ");
            }
        }

    }


    //create account method-------------------------------------------
    public static void addNewUser(ArrayList<User> users) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Username: ");
        String username = input.nextLine();

        //check if username already exists
        while (isDuplicateUsername(users, username)) {
            System.out.println("Username already exists. Try another Username");
            System.out.print("Enter Username: ");
            username = input.nextLine();
        }

        System.out.print("Enter Password: ");
        String password = input.nextLine();

        //create user and add to arraylist
        users.add(new User(username, password));

        //append the user to file
        addToFile(username, password, 0);

        System.out.println("Account created");
        System.out.println(" ");


        System.out.println("1) Continue with this account");
        System.out.println("2) Back to Main Menu");
        System.out.print("Choose you option 1-2 : ");

        int option = input.nextInt();
        System.out.println("------------------------");

        if (option == 1) {
            //continue with current account
            currentUser = users.get(users.size() - 1); //last added user
            userMenu(users); //load user's menu
        } else if (option == 2) {
            //back to main menu
        } else {
            //back to main menu
        }
    }

    //login method----------------------------------------------
    public static void login(ArrayList<User> users) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Username: ");
        String username = input.nextLine();
        System.out.print("Enter Password: ");
        String password = input.nextLine();

        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).isLoginSuccess(username, password)) {
                System.out.println("------------------------");
                System.out.println("Login Successful");
                currentUser = users.get(i);
                userMenu(users); //back to user menu
                break;
            } else if (i == users.size() - 1) {
                System.out.println("Login Failed");
            }
        }
    }

    //user menu---------------------
    public static void userMenu(ArrayList<User> users) {
        Scanner input = new Scanner(System.in);
        int option = 0;

        while (option != 4) {
            System.out.println("Welcome, " + currentUser.getUsername() + "!");  //display name
            System.out.println("------------------------");
            System.out.println("1) Check Balance");
            System.out.println("2) Cash Deposit");
            System.out.println("3) Cash Withdrawal");
            System.out.println("4) Exit");

            System.out.print("Choose you option 1-4 : ");

            option = input.nextInt();
            System.out.println("------------------------");


            if (option == 1) {
                //check balance of current user
                checkBalance(currentUser);
            } else if (option == 2) {
                //deposit
                System.out.print("Enter Amount: ");
                int amount = input.nextInt();
                deposit(users, currentUser, amount);
            } else if (option == 3) {
                //withdraw
                System.out.print("Enter Amount: ");
                int amount = input.nextInt();
                withdraw(users, currentUser, amount);
            } else if (option == 4) {
                //exit
                Run.currentUser = null;             //remove the current user session
            } else {
                System.out.println("Invalid Input. Press Enter to try again");
                input.nextLine();
                System.out.println(" ");
            }
        }


    }


    //deposit--------------------
    public static void deposit(ArrayList<User> users, User currentUser, int amount) {
        currentUser.deposit(amount);
        System.out.println("Deposit Successful!");
        replaceToFile(users);   //add all details to file again
        checkBalance(currentUser);
    }

    //withdraw-----------------------
    public static void withdraw(ArrayList<User> users, User currentUser, int amount) {
        currentUser.withdraw(amount);
        System.out.println("Withdrawal Successful!");
        replaceToFile(users);   //add all details to file again
        checkBalance(currentUser);
    }

    //check Balance----------------------
    public static void checkBalance(User currentUser) {
        System.out.println("Your current balance: Rs." + currentUser.getBalance());

        Scanner input = new Scanner(System.in);
        System.out.println("Press Enter to Continue");
        input.nextLine();
        System.out.println(" ");
    }

    //check duplicate username
    public static boolean isDuplicateUsername(ArrayList<User> users, String username) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUsername().equals(username)) {
                return true;
            } else if (i == users.size() - 1) {
                return false;
            }
        }
        return false;
    }

    //add to file
    public static void addToFile(String username, String password, int balance) {
        try {
            FileWriter writerFile = new FileWriter("SaveFile.txt", true);
            BufferedWriter writer = new BufferedWriter(writerFile);
            writer.write(username + "\t" + password + "\t" + balance + "\n");
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    //replace file / clear the file and fill again
    public static void replaceToFile(ArrayList<User> users) {
        try {
            FileWriter writerFile = new FileWriter("SaveFile.txt", false);  //false-->overwrite true-->append
            BufferedWriter writer = new BufferedWriter(writerFile);

            for (int i = 0; i < users.size(); i++) {
                writer.write(users.get(i).getUsername() + "\t" + users.get(i).getPassword() + "\t" + users.get(i).getBalance() + "\n");
            }

            writer.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    //read file
    public static void readFile(ArrayList<User> users) {

        try {
            File saveFile = new File("SaveFile.txt");
            FileReader fileReader = new FileReader(saveFile);

            BufferedReader reader = new BufferedReader(fileReader);
            String line;
            String username;
            String password;
            int balance = 0;
            while ((line = reader.readLine()) != null) {
                String[] splittedLine = line.split("\t");
                username = splittedLine[0];
                password = splittedLine[1];
                balance = Integer.parseInt(splittedLine[2]);

                users.add(new User(username, password, balance));

            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
