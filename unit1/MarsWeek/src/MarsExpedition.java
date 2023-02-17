package unit1.MarsWeek.src;

import java.util.Scanner;

public class MarsExpedition {
  // public MarsExpedition() {
    public static void main(String[] args) {
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

    scan.close();
  }
}
