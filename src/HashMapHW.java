import java.util.HashMap;
import java.util.Scanner;

// You are a car dealer. Create a hash map of vehicles.
// The model is the Key, the make is the Value.
// Ask the customer what car (model) they are looking for. Use the Hash Map to determine if you have that vehicle, and what make it is.
// (e.g. "Oh, you're looking for a Civic? Our Honda selection is right over here...")

public class HashMapHW {

  public static void main(String[] args) {
    HashMap<String, String> cars = new HashMap<>();

    cars.put("Camery", "Toyota");
    cars.put("Accord", "Honda");
    cars.put("CX-5", "Mazda");
    cars.put("Explorer", "Ford");
    cars.put("Rubicon", "Jeep");
    cars.put("F150", "Ford");
    cars.put("Cyber Truck", "Tesla");

    Scanner scan = new Scanner(System.in);
    System.out.println("what car model are you looking for?");
    String input = scan.nextLine();
    if (cars.containsKey(input)) {
      System.out.printf(
        "Oh, you're looking for a %s? Our %s selection is right over here...",
        input,
        cars.get(input)
      );
    } else {
      System.out.println("Sorry, we don't carry that make or model.");
    }
    scan.close();
  }
}
