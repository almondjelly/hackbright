package unit1.MarsWeek.src;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
  public GuessingGame() {
    System.out.println("Howdy, what's your name?");
    System.out.println("(type in your name) ");
    Scanner scan = new Scanner(System.in);
    String name = scan.nextLine();

    Random rand = new Random();
    final int UPPER_BOUND = 100;
    int number = rand.nextInt(UPPER_BOUND);

    System.out.println(name + ", I'm thinking of a number between 1 and " + UPPER_BOUND);
    System.out.println("Try to guess my number.");
    System.out.println("Your guess? ");
    int tries = 0;

    while (true) {
      String guess = scan.nextLine();
      tries += 1;
      int guessInt;

      try {
        guessInt = Integer.parseInt(guess);
      } catch (NumberFormatException e) {
        System.out.println("That's not an integer. Game over.");
        scan.next();
        continue;
      }

      if (guessInt == number) {
        System.out.println("Well done, " + name + "! You found my number in " + tries + " tries!");
        break;
      } else if (guessInt < number) {
        System.out.println("Your guess is too low, try again.");
      } else {
        System.out.println("Your guess is too high, try again.");
      }
    }

    scan.close();
  }
}
