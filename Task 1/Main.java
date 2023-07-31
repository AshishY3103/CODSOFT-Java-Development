package Game;

import java.util.Scanner;
import java.util.Random;

class GuessingGame {
    private int startRange;
    private int endRange;
    private int maxAttempts;
    private int totalAttempts;
    private int rounds;
    private Random random;

    public GuessingGame(int startRange, int endRange, int maxAttempts) {
        this.startRange = startRange;
        this.endRange = endRange;
        this.maxAttempts = maxAttempts;
        this.totalAttempts = 0;
        this.rounds = 0;
        this.random = new Random();
    }

    public int generateRandomNumber() {
        return random.nextInt(endRange - startRange + 1) + startRange;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Guessing Game!");

        do {
            int randomNumber = generateRandomNumber();
            rounds++;
            System.out.println("\nRound " + rounds);

            int attempts = 0;
            boolean isCorrect = false;

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess (between " + startRange + " and " + endRange + "): ");
                int userGuess = scanner.nextInt();
                attempts++;
                totalAttempts++;

                if (userGuess == randomNumber) {
                    isCorrect = true;
                    break;
                } else if (userGuess < randomNumber) {
                    System.out.println("Too low. Attempts left: " + (maxAttempts - attempts));
                } else {
                    System.out.println("Too high. Attempts left: " + (maxAttempts - attempts));
                }
            }

            if (isCorrect) {
                System.out.println("Congratulations! You guessed the number " + randomNumber + " in " + attempts + " attempts.");
            } else {
                System.out.println("Sorry, you have exceeded the maximum number of attempts. The number was " + randomNumber + ".");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next();

            if (!playAgain.equalsIgnoreCase("yes")) {
                break;
            }

        } while (true);

        scanner.close();
    }

    public double getAverageAttemptsPerRound() {
        return (double) totalAttempts / rounds;
    }
}

public class Main {
    public static void main(String[] args) {
        int startRange = 1;
        int endRange = 100;
        int maxAttempts = 10;

        GuessingGame game = new GuessingGame(startRange, endRange, maxAttempts);
        game.play();

        double averageAttemptsPerRound = game.getAverageAttemptsPerRound();
        System.out.println("\nGame Over. Your final score is: " + String.format("%.2f", averageAttemptsPerRound) + " attempts per round.");
    }
}

