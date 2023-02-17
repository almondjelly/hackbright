package unit1.MarsWeek.src;

import java.util.Scanner;

public class MarsExpedition {
  public MarsExpedition() {
    Scanner scan = new Scanner(System.in);
    System.out.println("Booting up...");
    System.out.println("What's your name?");
    String name = scan.nextLine();
    System.out.println("Hi, " + name + "! Welcome to the expedition prep program. Are you ready to head out into the new world? Type Y or N.");
    String userReady = scan.nextLine();

    if (userReady.equalsIgnoreCase("y")) {
      System.out.println("I knew you'd say that. You're a team leader for a reason.");
    } else {
      System.out.println("Too bad. You're a team leader. You have to go.");
    }

    System.out.println("How many people do you want on your team?");
    int teammates = scan.nextInt();

    if (teammates > 2) {
      System.out.println("That's way too many people. We can only send 2 more members.");
      teammates = 2;
    } else if (teammates < 2) {
      System.out.println("That's not enough people. We'll send you 2 more members.");
    } else {
      System.out.println("Great!");
    }

    System.out.println("You're allowed to bring a snack with you. What do you want to bring?");
    String snack = scan.nextLine();
    System.out.println("You got it. We'll pack " + snack + " just for you.");

    System.out.println("What vehicle do you want to use? You have three choices:"
        + "\nA - skateboard"
        + "\nB - unicycle"
        + "\nC - pterodactyl");
    String vehicleChoice = scan.nextLine();
    String vehicle = "roller skates";
    if (vehicleChoice.equalsIgnoreCase("a")) {
      vehicle = "skateboard";
    } else if (vehicleChoice.equalsIgnoreCase("b")) {
      vehicle = "unicycle";
    } else if (vehicleChoice.equalsIgnoreCase("c")) {
      vehicle = "pterodactyl";
    }

    System.out.println("You're now ready to explore Mars, " + name + "!");
    System.out.println(
        "You'll have " + teammates + " members on your team, and you'll all be munching on " + snack + " together.");
    System.out
        .println("If you get tired of walking, we've equipped you with a state of the art " + vehicle + ". Good luck!");
    System.out.println("Your mission starts in...");
    for (int t = 5; t > 0; t--) {
      System.out.println(t);
    }
    System.out.println("BLASTOFF!!!!!!!!");

    scan.close();
  }
}
