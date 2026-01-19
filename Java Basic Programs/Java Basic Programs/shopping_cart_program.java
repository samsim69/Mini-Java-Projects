
import java.util.Scanner;

public class shopping_cart_program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String item;
        Double price;
        int quantity;
        double total;
        char currency = '$';

        System.out.println("What would you like to buy? ");
        item = scanner.nextLine();
        System.out.println("What is the price of the commodity that you want to buy? ");
        price = scanner.nextDouble();
        System.out.println("How many items would you like to buy? ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.printf("You have bought %d %ss.\n", quantity, item);//using printf to alter output(%d is used for integer variable and %s is used for string variable)
        System.out.println("Your total is " + currency + total);

        scanner.close();

    }
}
