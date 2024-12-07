package oops;

public class Account {
    int acc_number;
    double current_balance;
    String acc_holder_name;

    public Account() {
    }

    public Account(int acc_num, double amt, String name) {
        acc_number = acc_num;
        current_balance = amt;
        acc_holder_name = name;
    }

    public static void main(String[] args) {
        Account account_1001 = new Account(1001, 15000, "Rohan Patil");
        account_1001.printAccDetails();
        account_1001.deposit(10000);
        account_1001.displayBalance();
        account_1001.withdraw(50000);
        account_1001.displayBalance();

    }

    private void withdraw(double amount) {
        System.out.println("Please withdraw : " + amount);
        if (current_balance >= amount) {
            current_balance = current_balance - amount;
            System.out.println(amount + " withdrawn");
        } else {
            System.out.println("Insufficient Balance");
        }

        sendMsg(amount);
    }

    private void sendMsg(double amount) {
        System.out.println("you have tried to withdraw " + amount + " from your bank account. if it's not you please contact us");
    }

    private void displayBalance() {
        System.out.println("Current balance : " + current_balance);
    }

    private void printAccDetails() {
        System.out.println("------initial details----------");
        System.out.println("Account Number  : " + this.acc_number);
        System.out.println("Current balance : " + this.current_balance);
        System.out.println("Acc Holder name : " + this.acc_holder_name);
        System.out.println("-------------------------------");
    }

    public void deposit(double amount) {
        current_balance = current_balance + amount;
        System.out.println(amount + " deposited");
    }

}


// deposit amount
// display balance
// withdraw amount
// send text message