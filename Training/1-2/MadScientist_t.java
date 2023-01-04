import java.io.*;
import java.util.*;

public class MadScientist_t {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    scanner.nextLine();
    char[] a = scanner.nextLine().toCharArray();
    char[] b = scanner.nextLine().toCharArray();

    int result = 0;
		while (!new String(a).equals(new String(b))) {
			result++;
			int lhs = 0;
			while (a[lhs] == b[lhs]) lhs++;
			int rhs = N-1;
			while (a[rhs] == b[rhs]) rhs--;
			for (int i = lhs; i <= rhs; i++) {
				if (a[i] == 'G') a[i] = 'H';
				else a[i] = 'G';
			}
		}
  
    System.out.println(result);
    scanner.close();
  }
}
