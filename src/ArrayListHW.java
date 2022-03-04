import java.util.ArrayList;
import java.util.Scanner;

// Write a program that does the following:
// Asks the user for 5 numbers
// Stores them in an array list
// Finds the sum, product, largest, and smallest of those numbers

public class ArrayListHW {

  public static ArrayList<Integer> getCalc(ArrayList<Integer> nums) {
    ArrayList<Integer> calcs = new ArrayList<>();
    int total = 0;
    int product = 1;
    int smallest = nums.get(0);
    int largest = nums.get(0);
    for (int num : nums) {
      total += num;
      product *= num;
      if (num < smallest) {
        smallest = num;
      }
      if (num > largest) {
        largest = num;
      }
    }
    calcs.add(total);
    calcs.add(product);
    calcs.add(largest);
    calcs.add(smallest);

    return calcs;
  }

  public static void main(String[] args) throws Exception {
    System.out.println("Hello, World!");
    int i = 0;
    Scanner input = new Scanner(System.in);

    ArrayList<Integer> list = new ArrayList<>(5);

    while (i < 5) {
      System.out.println("Enter a number");
      int num = input.nextInt();
      list.add(num);
      i++;
    }
    ArrayList<Integer> answers = getCalc(list);
    System.out.println("sum: " + answers.get(0));
    System.out.println("product: " + answers.get(1));
    System.out.println("largest " + answers.get(2));
    System.out.println("smallest: " + answers.get(3));
    input.close();
  }

}
