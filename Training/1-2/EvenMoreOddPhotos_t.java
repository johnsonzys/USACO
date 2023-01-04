import java.util.*;
import java.io.*;

public class EvenMoreOddPhotos_t {
	public static void main(String[] args) throws IOException {
	  Scanner in = new Scanner(System.in);
		int odd = 0;
		int even = 0;
		int n = Integer.parseInt(in.nextLine());
	
		StringTokenizer cowST = new StringTokenizer(in.nextLine());
		for (int i = 0; i < n; i++) {
			int cow = Integer.parseInt(cowST.nextToken());
			if (cow % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}

		// Pair up odd cows so that there aren't too many of them.
		while (odd > even) { 
			odd = odd - 2;
			// Two odd cows together are effectively an even cow.
			even++; 
		}
		// Group even cows so that there aren't too many evens either.
		if (even > odd + 1) {
			even = odd + 1;
		}
	  	
		System.out.println(even + odd);
  	}
}
