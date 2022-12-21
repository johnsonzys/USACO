import java.util.Arrays;
import java.util.Scanner;

public class one {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Read in the number of cows
    int n = scanner.nextInt();

    // Read in the maximum tuitions that each cow is willing to pay
    long[] tuitions = new long[n];
    for (int i = 0; i < n; i++) {
      tuitions[i] = scanner.nextInt();
    }

    // Sort the tuitions in ascending order
    Arrays.sort(tuitions);

    // Initialize the maximum amount of money that can be made and the optimal tuition to charge
    long maxMoney = 0;
    long optimalTuition = 0;

    // Iterate through the tuitions and calculate the maximum amount of money that can be made
    // and the optimal tuition to charge
    for (int i = 0; i < n; i++) {
      long tuition = tuitions[i] * (n - i);
      if (tuition > maxMoney) {
        maxMoney = tuition;
        optimalTuition = tuitions[i];
      }
    }

    // Print the results
    System.out.println(maxMoney + " " + optimalTuition);
  }
}
