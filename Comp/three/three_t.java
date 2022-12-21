import java.util.HashMap;
import java.util.Scanner;

public class three_t {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int t = scanner.nextInt();
    for (int i = 0; i < t; i++) {
      int n = scanner.nextInt();
      int m = scanner.nextInt();
      HashMap<String, Integer> outputs = new HashMap<>();
      for (int j = 0; j < m; j++) {
        String input = scanner.next();
        int output = scanner.nextInt();
        outputs.put(input, output);
      }

      boolean isConsistent = true;
      for (int j = 0; j < (1 << n); j++) {
        String input = Integer.toBinaryString(j);
        while (input.length() < n) {
          input = "0" + input;
        }

        int expectedOutput = outputs.getOrDefault(input, -1);
        if (expectedOutput == -1) {
          continue;
        }

        int actualOutput = 0;
        for (int k = 0; k < n; k++) {
          actualOutput = (input.charAt(k) == '1') ? 1 : 0;
          if (expectedOutput != actualOutput) {
            break;
          }
        }

        if (expectedOutput != actualOutput) {
          isConsistent = false;
          break;
        }
      }

      System.out.println(isConsistent ? "OK" : "LIE");
    }
  }
}