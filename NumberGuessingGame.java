import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int numberOfAttempts = 5; 

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a random number between " + lowerBound + " and " + upperBound);

        int roundsWon = 0;

        do 
        {
            int targetNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            int attempts = 0;

            System.out.println("\nRound " + (roundsWon + 1) + ": Guess the number!");

            while (attempts < numberOfAttempts) 
            {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();

                if (userGuess == targetNumber) 
                {
                    System.out.println("Congratulations! You guessed the correct number.");
                    roundsWon++;
                    break;
                }
                 else if (userGuess < targetNumber) 
                {
                    System.out.println("Too low! Try again.");
                } 
                else 
                {
                    System.out.println("Too high! Try again.");
                }

                attempts++;
            }

            if (attempts == numberOfAttempts) 
            {
                System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was: " + targetNumber);
            }

            System.out.print("Do you want to play again? (yes/no): ");
        } 
        while (scanner.next().equalsIgnoreCase("yes"));

        System.out.println("Game over! Your total rounds won: " + roundsWon);
    }
}
