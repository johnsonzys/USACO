import java.io.*;
import java.util.*;

public class BlockGame {

    // public static ArrayList<String> c = new ArrayList<String>();
    // public static ArrayList<String> one = new ArrayList<String>();
    // public static ArrayList<String> two = new ArrayList<String>();


    public static String[][] c;
    public static String[][] ans;

  /*
  fox dog car
  fox dog bus
  fox cat car
  fox cat bus
  box dog car
  box dog bus
  box cat car
  box cat bus
  */

    0-25
    
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    scanner.nextLine();
    for (int i=0; i<N; i++){
        String[] s = scanner.nextLine().split(" ");
        c[i][0] = s[0];
        c[i][1] = s[1];
      /*
      fox box
      dog cat
      car bus
      */
    }

    // for(int i =0;i<N;i++){
      
    
      for (int j=2; j<N*2; j+=2){
        one.add(c.get(0));
        two.add(c.get(1));
        one.add(c.get(j));
        one.add(c.get(j+1));
        two.add(c.get(j));
        two.add(c.get(j+1));
      }
      // one: fox dog car fox dog bus fox cat car fox cat bus
    // }

      for(int i=0:i<one.length();i+=3){
        // one: fox dog car fox dog bus fox cat car fox cat bus
      }

      //for loop by N
  
    System.out.println();
    scanner.close();
  }

    public static recur(N){

        
    }
}
