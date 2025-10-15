import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        boolean playAgain = true;

        System.out.println("🎯 Welcome to the Advanced Number Guessing Game!");

        while (playAgain) {
            System.out.println("\nChoose Difficulty Level:");
            System.out.println("1. Easy (1–50, 10 attempts)");
            System.out.println("2. Medium (1–100, 7 attempts)");
            System.out.println("3. Hard (1–200, 5 attempts)");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            int maxRange = 0;
            int maxAttempts = 0;

            switch (choice) {
                case 1:
                    maxRange = 50;
                    maxAttempts = 10;
                    break;
                case 2:
                    maxRange = 100;
                    maxAttempts = 7;
                    break;
                case 3:
                    maxRange = 200;
                    maxAttempts = 5;
                    break;
                default:
                    System.out.println("Invalid choice! Defaulting to Medium.");
                    maxRange = 100;
                    maxAttempts = 7;
            }

            int numberToGuess = rand.nextInt(maxRange) + 1;
            int attempts = 0;
            boolean guessed = false;

            System.out.println("\nGuess the number between 1 and " + maxRange + ":");

            while (attempts < maxAttempts) {
                System.out.print("Attempt " + (attempts + 1) + " of " + maxAttempts + ": ");
                int userGuess = sc.nextInt();
                attempts++;

                if (userGuess == numberToGuess) {
                    System.out.println("🎉 Correct! You guessed it in " + attempts + " attempts!");
                    guessed = true;
                    break;
                } else if (userGuess < numberToGuess) {
                    System.out.println("📉 Too low!");
                } else {
                    System.out.println("📈 Too high!");
                }
            }

            if (!guessed) {
                System.out.println("😢 Out of attempts! The correct number was: " + numberToGuess);
            }

            System.out.print("\nDo you want to play again? (yes/no): ");
            String again = sc.next().toLowerCase();
            playAgain = again.equals("yes");
        }

        System.out.println("\n👋 Thanks for playing! Goodbye!");
        sc.close();
    }
}
