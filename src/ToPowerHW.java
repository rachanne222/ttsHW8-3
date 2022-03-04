import java.lang.Math;
import java.util.Arrays;

public class ToPowerHW {

  // Write a public static method called "toPower" that takes in as parameters two integers called size and power. The method should return an array of size "size" with each array index raised to the value of "power." So, for example, if we passed in "size = 4" and "power = 2" to the "toPower," the method should return the following result: [0,1,4,9].
  public static double getSum(double[] numbers) {
    double total = 0;

    for (double num : numbers) {
      total += num;
    }
    return total;
  }

  public static int[] toPower(int sized, int power) {
    int[] list = new int[sized];
    for (int i = 0; i < sized; i++) {
      double d = i;
      double p = power;
      list[i] = (int) Math.pow(d, p);
    }

    return list;
  }

  public static void main(String[] args) {
    double[] list = { 2, 4.5, 10, 4.5, 21 };
    double sum = getSum(list);
    System.out.println(sum);

    int[] powerlist = toPower(5, 4);
    System.out.println(Arrays.toString(powerlist));
  }
}
