import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class FindingsList {

    public FindingsList() throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        Thread.sleep(500);

        System.out.println("Welcome back!");

        ArrayList<String> rocks = new ArrayList<>();
        rocks.add("rock");
        rocks.add("weird rock");
        rocks.add("smooth rock");
        rocks.add("not rock");

        Thread.sleep(500);
        System.out.println("Great, rocks downloaded!");
        Thread.sleep(500);
        System.out.println(rocks);
        Thread.sleep(500);
        System.out.println("Uh oh, there's something that shouldn't be in that list.");
        rocks.remove("not rock");
        Thread.sleep(500);
        System.out.println(rocks);
        Thread.sleep(500);
        System.out.println("Now it's perfect!");

        Thread.sleep(1000);

        HashMap<String, String> fossils = new HashMap<>();
        fossils.put("Bird Fossil", "The fossil has wings implying it was capable of flight.");
        fossils.put("Fish Fossil", "The fossil is vaguely fish shaped implying there was once water.");
        fossils.put("Tooth Fossil", "The tooth from unknown fossil.");

        Thread.sleep(500);
        System.out.println("Fossil data downloaded");
        Thread.sleep(500);
        System.out.println("Which of the fossils would you like to learn more about?" +
                "\nChoose one: Bird Fossil, Fish Fossil, or Tooth Fossil");
        String fossilChoice = scanner.nextLine();

        if (fossilChoice.equalsIgnoreCase("bird fossil")) {
            System.out.println("Bird Fossil: " + fossils.get("Bird Fossil"));
        } else if (fossilChoice.equalsIgnoreCase("fish fossil")) {
            System.out.println("Fish Fossil: " + fossils.get("Fish Fossil"));
        } else if (fossilChoice.equalsIgnoreCase("tooth fossil")) {
            System.out.println("Tooth Fossil: " + fossils.get("Tooth Fossil"));
        }


        HashSet<String> supplies = new HashSet<>();
        supplies.add("a fly swatter");
        supplies.add("a hula hoop");
        supplies.add("a ladder");
        supplies.add("a nail file");
        supplies.add("a shoelace");

        Thread.sleep(1000);
        System.out.println("Supplies Before Expedition: ");
        for(String s : supplies) {
            Thread.sleep(500);
            System.out.println(s);}
        Thread.sleep(1000);

        System.out.println("Supplies After Expedition: ");
        supplies.remove("a nail file");
        for(String s : supplies) {
            Thread.sleep(500);
            System.out.println(s);}


        scanner.close();
    }
}
