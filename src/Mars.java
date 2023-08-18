public class Mars {

    public static void main(String[]args) throws InterruptedException {
        String colonyName = "Kool";
        int shipPopulation = 300;
        double meals = 4000.00;
        boolean landing = true;
        landing = landingCheck(10);

        meals = meals - ((.75*2)*shipPopulation);
        System.out.println("Meals left after landing: " + meals);
        meals = meals * 1.5;
        System.out.println("Meals after finding extra crate: " + meals);
        shipPopulation = shipPopulation + 5;
        System.out.println("Population after landing: " + shipPopulation);

        String landingLocation = "The Plain";

        if (landingLocation.equalsIgnoreCase("The Plain")) {
           System.out.println("Bbzzz Landing on the Plain");
        } else {
            System.out.println("ERROR!!! Flight plan already set. Landing on the Plain");
        }

        GuessingGame guessingGame = new GuessingGame();
        guessingGame.main(new String[]{});

        new MarsExpedition();

    }

    public static boolean landingCheck(int minutesLeft) throws InterruptedException {
        for (int minute = 0; minute <= minutesLeft; minute++) {
            if (minute % 2 == 0 && minute % 3 == 0) {
                System.out.println("Keep Center");
            } else if (minute % 3 == 0) {
                System.out.println("Left");
            } else if (minute % 2 == 0) {
                System.out.println("Right");
            } else {
                System.out.println("Calculating");
            }
            Thread.sleep(250);
        }
        System.out.println("Landed");
        return false;
    }
}
