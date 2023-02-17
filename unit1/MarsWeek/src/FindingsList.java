package unit1.MarsWeek.src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class FindingsList {
  public FindingsList() throws InterruptedException {
    Thread.sleep(500);
    System.out.println("Welcome back!");

    ArrayList<String> rocks = new ArrayList<String>();
    rocks.add("rock");
    rocks.add("weird rock");
    rocks.add("smooth rock");
    rocks.add("not rock");

    System.out.print("Rocks downloaded: ");
    System.out.println(rocks);
    System.out.println("Oops. That last one's not a rock. Let me remove that for you.");

    rocks.remove("not rock");

    System.out.print("Here's the new list: ");
    System.out.println(rocks);

    System.out.println("Downloading fossil data...");
    Thread.sleep(1000);

    HashMap<String, String> fossils = new HashMap<>();
    fossils.put("bird fossil", "the fossil has wings, implying it was once capable of flight");
    fossils.put("fish fossil", "the fossil is vaguely fish-shaped, implying there was once water");
    fossils.put("tooth fossil", "the tooth from an unknown fossil");
    System.out.println("Fossil data downloaded.");

    Scanner scan = new Scanner(System.in);
    System.out.println("Which fossil do you want to learn more about? Enter bird, fish, or tooth.");
    String fossilChoice = scan.nextLine();

    if (fossilChoice.equalsIgnoreCase("bird") || fossilChoice.equalsIgnoreCase("fish")
        || fossilChoice.equalsIgnoreCase("tooth")) {
      System.out.println(
          "Here's some information about the " + fossilChoice + " fossil: "
              + fossils.get(fossilChoice.toLowerCase() + " fossil"));
    } else {
      System.out.println("Sorry, I don't know about that.");
    }
  }
}
