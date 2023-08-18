import java.util.Scanner;

public class MarsExpedition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Booting up...\nReady!");
        System.out.println("What's your name?");
        String name = scanner.nextLine();
        System.out.println("Hi " + name + " - Welcome to the Expedition prep program. Are you ready to head out into the new world? Type Y or N");
        String input = scanner.nextLine();

        while (!input.equalsIgnoreCase("y") && !input.equalsIgnoreCase("n")) {
            System.out.println("Invalid response, try again");
            System.out.println("Are you ready to head out into the new world? Type Y or N");
            input = scanner.nextLine();
        }

        if (input.equalsIgnoreCase("y")) {
            System.out.println("I knew you would say that. You are team leader for a reason.");
        } else if (input.equalsIgnoreCase("n")) {
            System.out.println("Too bad you are team leader. You have to go.");
        }

        System.out.println("How many people do you want on your team?");
        int team = scanner.nextInt();

        if (team > 2) {
            System.out.println("That’s way too many people. We can only send 2 more members.");
            team = 2;
        } else if ( team < 2){
            System.out.println("That's not enough people. We'll send 2 people to make a 3 person team.");
            team = 2;
        } else if (team == 2) {
            System.out.println("Perfect!");
        }

        System.out.println("You are allowed to bring one snack with you. What do you want to bring?");
        scanner.nextLine();
        String snack = scanner.nextLine();
        System.out.println("Nice choice, you will be bringing " + snack + " with you.");

        System.out.println("Now, you can choose a vehicle: \n1: Mars Rover \n2: Space Shuttle \n3: Flying Orange" +
                "\nWhich one would you like: 1, 2, or 3?");
        int vehicle = scanner.nextInt();
        String vehicleChoice;
        if (vehicle == 1) {
            vehicleChoice = "the Mars Rover";
        } else if (vehicle == 2) {
            vehicleChoice = "the Space Shuttle";
        } else if (vehicle == 3) {
            vehicleChoice = "the Flying Orange";
        } else {
            vehicleChoice = "nothing";
            System.out.println("I see you can't follow the rules. That's ok, I'll choose something for you ;)");
        }

        scanner.close();

        System.out.println("Way to go, " + name + "! Looks like you're ready for this expedition!" +
                "\nYou'll have " + team + " people on your team." +
                "\nYou will be driving " + vehicleChoice + "! And you will have " + snack + " for a snack." +
                "\nEnjoy! Departing in..." +
                "\n5...\n4...\n3...\n2...\n1...\nBlast off!");
    }
}
