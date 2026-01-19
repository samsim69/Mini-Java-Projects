
import java.util.Random;
import java.util.Scanner;

public class number_guesser {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int randomNumber = random.nextInt(1, 101);

        System.out.println("-----------------------NUMBER GUESSING GAME----------------------");
        System.out.println("               Enter a number between 1 and 100:-                ");
        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;
            if (guess > randomNumber) {
                System.out.println("Your guess is TOO HIGH!!");
            } else if (guess < randomNumber) {
                System.out.println("Your guess is TOO LOW!!");
            } else {
                System.out.printf("You have guessed the correct number in %d attempts", attempts);
                System.out.println("HO GAYI NA PLACEMENT?!");
                System.out.println("NAHI HUI TOH KYU KHEL RAHE HO AAP YEH GAME?!");
            }

        } while (guess != randomNumber);

        scanner.close();

    }
}
