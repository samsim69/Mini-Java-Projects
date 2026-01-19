
import java.util.Scanner;

public class banking_program {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double balance = 0;
        boolean isRunning = true;
        int choice;

        while (isRunning == true) {

            System.out.println("***************");
            System.out.println("BANKING PROGRAM");
            System.out.println("***************");
            System.out.println("1.Check Balance");
            System.out.println("2.  Withdraw   ");
            System.out.println("3.  Deposit    ");
            System.out.println("4.   Exit      ");

            System.out.print("Which option would you like to begin with(1-4)? ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 ->
                    showBalance(balance);
                case 2 ->
                    balance -= withdraw(balance);
                case 3 ->
                    balance += deposit();
                case 4 -> {
                    isRunning = false;
                    System.out.println("Program exited!!");
                    System.out.println("Thank you! Hope you don't have a good day AT ALL!!!!");
                }
                default ->
                    System.out.println("INVALID CHOICE");
            }

        }

    }

    static void showBalance(double balance) {
        System.out.printf("Your balance is $%,.2f\n", balance);
    }

    static double deposit() {
        double amount;
        System.out.print("Enter an amount to be deposited: ");
        amount = scanner.nextDouble();

        if (amount < 0) {
            System.out.println("Amount can't be negative you DUMB CUNT!!!");
            return 0;
        } else {
            return amount;
        }
    }

    static double withdraw(double balance) {
        double amount;
        System.out.print("Enter an amount to be withdrawn: ");
        amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.println("You have insufficient funds you BROKE PIECE OF SHIT!!!!");
            return 0;
        } else if (amount < 0) {
            System.out.println("Amount can't be negative you DUMB CUNT!!!");
            return 0;
        } else {
            return amount;
        }

    }
}
