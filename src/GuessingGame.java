import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessingGame {

    public GuessingGame() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        int randomNum = getRandomNumber();
        int counter = 0;

        Thread.sleep(1000);
        System.out.println("Welcome to the Guessing Game!");
        Thread.sleep(500);
        System.out.println("To start, please tell me your name");
        String name = scanner.nextLine();
        System.out.println("Ok " + name + ", I'm thinking of a whole number between 0 and 100. Can you guess what number I'm thinking of?");
//        int playerGuess = scanner.nextInt();
//        counter++;

        while (true) {
            int guess;
            try {
                guess = scanner.nextInt();
            } catch (InputMismatchException e) {
                String bad_input = scanner.next(); // need to progress past bad input
                System.out.println("That's not an integer, try again");
                continue;
            }

            if (guess < 1 || guess > 100) {
                System.out.println(guess + " is not a valid number, try again");
                continue;
            }

            counter += 1;

            if (guess < randomNum) {
                System.out.println("Your guess is too low, try again.");
            } else if (guess > randomNum) {
                System.out.println("Your guess is too high, try again.");
            } else {
                System.out.println("Well done " + name);
                System.out.println("You found my number in " + counter + " tries!");
                break;
            }
        }
    }


    public static int getRandomNumber() {
        int randomNumber = (int) (Math.random() * 99);
        randomNumber += 1;
        return randomNumber;
    }
}
