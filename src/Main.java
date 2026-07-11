import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int number = random.nextInt(1,10) + 1;
        System.out.print("Enter a number between 1 to 10: ");
        int guessNumber = scanner.nextInt();
    }
}