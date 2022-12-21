import java.util.*;

public class three{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    // Read the number of test cases
    int T = in.nextInt();
    in.nextLine();

    // Process each test case
    for (int t = 0; t < T; t++) {
      // Read N and M
      int N = in.nextInt();
      int M = in.nextInt();
      in.nextLine();

      // Create a map to store the input-output pairs
      Map<String, Integer> pairs = new HashMap<>();

      // Read the input-output pairs
      for (int m = 0; m < M; m++) {
        String input = in.nextLine();
        int output = Character.getNumericValue(input.charAt(N));
        pairs.put(input.substring(0, N), output);
      }

      // Assume that Elsie is telling the truth
      boolean isLie = false;
      ArrayList<Character> digits = new ArrayList<Character>(); 

      // Check if there is any input-output pair that cannot be explained by the program
      for (Map.Entry<String, Integer> entry : pairs.entrySet()) {
        String input = entry.getKey();
        int output = entry.getValue();
        for(int i=0;i<input.length();i++){
            digits.add(input.charAt(i));
        }
      }
      // Print the result for this test case
      if (isLie) {
        System.out.println("LIE");
      } else {
        System.out.println("OK");
      }
    }
  }
}
