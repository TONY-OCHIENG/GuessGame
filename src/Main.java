import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int number = random.nextInt(1,10) + 1;
        int guessNumber = 0;
        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter a number between 1 to 10: ");
            guessNumber = scanner.nextInt();
            if (guessNumber == number) {
                System.out.println("You have won");
                break;
            } else if (guessNumber > number) {
                System.out.println("Value is too big");
                continue;
            } else if (guessNumber < number) {
                System.out.println("Value too small");
                continue;
            }
        }
        if (guessNumber != number) {
            System.out.println("Sorry you have lost");
        }


    }
}