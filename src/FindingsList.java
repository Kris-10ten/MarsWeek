import java.util.ArrayList;
import java.util.List;

public class FindingsList {

    public static void main(String[] args) {

        System.out.println("Welcome back!");

        List<String> rocks = new ArrayList<>();
        rocks.add("rock");
        rocks.add("weird rock");
        rocks.add("smooth rock");
        rocks.add("not rock");

        System.out.println("Great, everything downloaded!");
        System.out.println(rocks);
        System.out.println("Uh oh, there's something that shouldn't be in that list.");
        rocks.remove("not rock");
        System.out.println(rocks);
        System.out.println("Now it's perfect!");


    }
}
