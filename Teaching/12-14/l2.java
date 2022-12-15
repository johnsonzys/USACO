import java.io.*;
import java.util.*;

public class l2 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("l2.in"));
    PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("l2.out")));

    int n = Integer.parseInt(br.readLine()); // number of cows
    char[] cows = br.readLine().toCharArray(); // string
  
    int result = 0;
  
    for(int i = cows.length - 2;i>0;i-=2)
    {
      if (cows[i] != cows[i + 1] && (cows[i] == 'G') == (result % 2 == 0)) {
        result++;
      }
    }
    pw.println(result);
    pw.close();
   }
}
