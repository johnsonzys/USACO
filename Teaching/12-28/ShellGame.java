import java.io.*;
import java.util.*;

public class ShellGame {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int N = scanner.nextInt();
    int[] shell = new int[3];
    int[] counter = new int[3];

    //shell setup
    for(int i=0;i<3;i++){
      shell[i] = i;
    }

    for(int i=0;i<N;i++){
      //read in a b g
      int a = scanner.nextInt()-1;
      int b = scanner.nextInt()-1;
      int g = scanner.nextInt()-1;

      //swap
      int temp = shell[b];
      shell[b] = shell[a];
      shell[a] = temp;

      counter[shell[g]]++;
    }

    System.out.println(Math.max(counter[0], Math.max(counter[1], counter[2])));
  
    scanner.close();
  }
}
