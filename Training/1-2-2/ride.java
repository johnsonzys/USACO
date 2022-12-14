/* Use the slash-star style comments or the system won't see your
   identification information */
/*
ID: johnson40
LANG: JAVA
TASK: ride
*/
import java.io.*;
import java.util.*;

class ride {
   public static void main (String[] args) throws IOException{
      BufferedReader f = new BufferedReader(new FileReader("ride.in"));
      PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));

      String comet = f.readLine();
      String ppl = f.readLine();

      int sum_c = 1;
      int sum_p = 1;

      for(int i=0;i<comet.length();i++){ //iterate every element in String comet
         char c = comet.charAt(i);
         sum_c *= (int)c - 64; //C -> 3
      }

      for(int i=0;i<ppl.length();i++){ //iterate every element in String comet
         char c = ppl.charAt(i);
         sum_p *= (int)c - 64; //C -> 3
      }

      int diff = sum_c - sum_p;
      if(diff%47==0){pw.println("GO");}
      else{pw.println("STAY");}
      pw.close();
   }
}