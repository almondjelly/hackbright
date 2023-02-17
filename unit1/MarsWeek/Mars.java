package unit1.MarsWeek;

public class Mars {
  public static void main(String[] args) throws InterruptedException {
    String colonyName = "Roger's Palace";
    int shipPopulation = 300;
    double meals = 4000.00;
    boolean landing = landingCheck(10);

    double mealConsumptionRate = 0.75;
    int days = 2;
    meals = meals - (mealConsumptionRate * days * shipPopulation);
    System.out.println("Meals remaining: " + meals);
    meals *= 1.5;
    shipPopulation += 5;

    String landingLocation = "The Ocean";
    if (landingLocation.equalsIgnoreCase("The Plain")) {
      System.out.println("Bbzzz Landing on the Plain");
    } else {
      System.out.println("ERROR!!! Flight plan already set. Landing on the Plain");
    }
  }

  private static boolean landingCheck(int minutesLeft) throws InterruptedException {
    for (int minute = 0; minute <= minutesLeft; minute++) {
      if (minute % 2 == 0 && minute % 3 == 0) {
        System.out.println("Keep Center");
      } else if (minute % 2 == 0) {
        System.out.println("Right");
      } else if (minute % 3 == 0) {
        System.out.println("Left");
      } else {
        System.out.println("Calculating");
      }
      Thread.sleep(250);
    }
    System.out.println("Landed");
    return false;
  }
}
