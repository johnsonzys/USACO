/* Use the slash-star style comments or the system won't see your
   identification information */
/*
ID: your_id_here
LANG: JAVA
TASK: ride
*/
import java.io.*;
import java.util.*;

class ride {
   public static void main (String[] args) throws IOException{
      Scanner in = new Scanner(new File("ride.in"));
      PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));
      // String s1,s2 = inputs.split('\n');

      // while(in.hasNextLine()){
      String s1 = in.nextLine();
      String s2 = in.nextLine();
      // }

      char c1 = ' ';
      char c2 = ' ';
      int prod_sum1 = 1; // use 1 to avoid 0x0
      int prod_sum2 = 1; // use 1 to avoid 0x0

      for(int i=0;i<s1.length();i++){
         c1 = s1.charAt(i);
         prod_sum1 *= (int)c1-64;
      }

      for(int i=0;i<s2.length();i++){
         c2 = s2.charAt(i);
         prod_sum2 *= (int)c2-64;
      }

      if(prod_sum1%47==prod_sum2%47){
         out.println("GO");
      }
      else{
         out.println("STAY");
      }

      
      out.close();                                  // close the output file
   }
}