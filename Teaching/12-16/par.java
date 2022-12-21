//())()() not match
//))))(((( match

import java.io.*;
import java.util.*;

public class par {
 
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new FileReader("par.in"));
      PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("par.out")));

      String str = (br.readLine());
      Stack st = new Stack();
      for(int i=0;i<str.length();i++){
        if (str.charAt(i)=='('){
            st.push("(");
        }
        else{
            st.pop();
        }
        
      }
      if (st.empty())
          pw.println("false");
      else{
          pw.println("true");
      }
      
      // 1 2 4 5 -> pop -> 1 2 4
      // 1 2 4 5 -> push(1) -> 1 2 4 5 1
      // 1 2 4 5 -> peek() -> 5
      // st.empty() -> true/false

      pw.close();
      br.close();
    }
}