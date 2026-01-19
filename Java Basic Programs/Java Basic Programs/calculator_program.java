
import java.util.Scanner;

public class calculator_program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result = 0;
        boolean validOperator = true;

        System.out.println("Enter the first value: ");
        num1 = scanner.nextDouble();
        System.out.println("Enter the operator: ");
        operator = scanner.next().charAt(0);
        System.out.println("Enter the second value: ");
        num2 = scanner.nextDouble();

        switch (operator) {
            case '+' ->
                result = num1 + num2;
            case '-' ->
                result = num1 - num2;
            case '*' ->
                result = num1 * num2;
            case '%' ->
                result = num1 % num2;
            case '^' ->
                result = Math.pow(num1, num2);
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Cannot divide by 0!");
                    validOperator = false;
                } else {
                    result = num1 / num2;
                }
            }
            default -> {
                System.out.println("Invalid Operation! ");
                validOperator = false;
            }
        }
        if (validOperator == true) {
            System.out.println("The result of the arithmetic operation is: " + result);
        } else {
            System.out.println("Could not execute!!Dumbfuck!!!");
        }

        scanner.close();
    }

}
