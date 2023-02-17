package unit1.MarsWeek.src;

import java.util.ArrayList;

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
  }
}
