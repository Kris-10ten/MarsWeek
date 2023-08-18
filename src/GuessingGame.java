import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int randomNum = getRandomNumber();
        int counter = 0;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("To start, please tell me your name");
        String name = scanner.nextLine();
        System.out.println("Ok " + name + ", I'm thinking of a whole number between 0 and 101. Can you guess what number I'm thinking of?");
        int playerGuess = scanner.nextInt();
        counter++;

        while (playerGuess != randomNum) {
//            try {
//                playerGuess = scanner.nextInt();
//            } catch (InputMismatchException e) {
//                String bad_input = scanner.next(); // need to progress past bad input
//                System.out.println("That's not an integer, try again");
//                continue;
//            }
//            if (playerGuess < 1 || playerGuess > 100) {
//                System.out.println(playerGuess + " is not a valid number, try again");
//                continue;
//            }
//            counter++;
            if (playerGuess > randomNum) {
                System.out.println("Your guess is too high, try again");
                counter++;
                playerGuess = scanner.nextInt();
            } else if (playerGuess < randomNum) {
                System.out.println("Your guess it too low, try again");
                counter++;
                playerGuess = scanner.nextInt();
            }
        }
                System.out.println("Well done, " + name + "! You found my number in " + counter + " tries!");

        scanner.close();



    }
    public static int getRandomNumber() {
        int randomNumber = (int) (Math.random()*99);
         return randomNumber++;
    }
}
