
import java.util.Random;

public class coin_toss {

    public static void main(String[] args) {

        Random random = new Random();

        boolean isHeads;
        isHeads = random.nextBoolean();

        if (isHeads == true) {
            System.out.println("HEADS");
        } else {
            System.out.println("TAILS");
        }

    }
}
