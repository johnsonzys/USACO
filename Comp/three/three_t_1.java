import java.util.Scanner;

public class three_t_1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int t = scanner.nextInt();
    for (int i = 0; i < t; i++) {
      int n = scanner.nextInt();
      int m = scanner.nextInt();

      // Create a 2D array to store the inputs and outputs
      int[][] inputsOutputs = new int[m][n + 1];
      for (int j = 0; j < m; j++) {
        String input = scanner.next();
        for (int k = 0; k < n; k++) {
          inputsOutputs[j][k] = input.charAt(k) - '0';
        }
        inputsOutputs[j][n] = scanner.nextInt();
      }

      // Initialize a flag to track whether Elsie is lying or not
      boolean isLying = false;

      // Iterate through all combinations of if/else if statements
      for (int j = 0; j < (1 << n); j++) {
        boolean isValid = true;
        for (int k = 0; k < m; k++) {
          int output = 0;
          for (int l = 0; l < n; l++) {
            if ((j & (1 << l)) > 0 && inputsOutputs[k][l] == 1) {
              output = 1;
              break;
            }
          }
          if (output != inputsOutputs[k][n]) {
            isValid = false;
            break;
          }
        }
        if (isValid) {
          isLying = false;
          break;
        } else {
          isLying = true;
        }
      }

      // Print the result
      if (isLying) {
        System.out.println("LIE");
      } else {
        System.out.println("OK");
      }
    }

    scanner.close();
  }
}
