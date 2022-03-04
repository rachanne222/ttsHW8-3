import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CodeAlong {

  public static void main(String[] args) {
    // ArrayList<String> listStr = new ArrayList<>(5);
    // System.out.println(listStr);
    // listStr.add("John");
    // listStr.add("Heather");
    // listStr.add("Joe");
    // listStr.add(1, "Rachel");
    // listStr.add(3, "Jeff");
    // System.out.println(listStr);
    // listStr.remove("Joe");
    // System.out.println(listStr);
    // System.out.println("Size of list " + listStr.size());
    // listStr.clear();
    // System.out.println("Size of list " + listStr.size());

    ArrayList<String> fruitList = new ArrayList<>();
    fruitList.add("apple");
    fruitList.add("grapes");
    fruitList.add("banannas");
    System.out.println(fruitList);

    for (String fruit : fruitList) {
      System.out.println(fruit);
    }
    HashMap<String, Integer> people = new HashMap<>();
    people.put("Joan", 22);
    people.put("Daniel", 35);
    people.put("Candy", 67);
    for (Map.Entry<String, Integer> person : people.entrySet()) {
      String key = person.getKey();
      int value = person.getValue();
      System.out.println(key + " : " + value);
    }
  }
}
