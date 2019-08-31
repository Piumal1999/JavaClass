package Day17.Bank;

class User {

    private int balance;
    private String username;
    private String password;

    User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    User(String username, String password, int balance) {
        this.username = username;
        this.password = password;
        this.balance = balance;
    }

    //is login success
    boolean isLoginSuccess(String username, String password) {
        return (username.equals(this.username) && password.equals(this.password));
    }

    //get the username
    String getUsername() {
        return username;
    }

    //get the password
    String getPassword() {
        return password;
    }

    //get the balance
    int getBalance() {
        return balance;
    }

    //deposit money
    void deposit(int amount) {
        balance += amount;
    }

    //withdraw money
    void withdraw(int amount) {
        balance -= amount;
    }


}
