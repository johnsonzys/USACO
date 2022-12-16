import java.io.*;
import java.util.*;

public class l3 {
  
  public static void main(String[] args) throws IOException {
    //BufferedReader br = new BufferedReader(new FileReader("l3.in"));
    //PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("l3.out")));

    //fib
    // [0,1,1,2,3,5,8...]
    // input 5
    // out first nth fib array 
    // 0 1 1 2 3 5

    //1. writer a helper func to compute the  n-1, n-2 return nth 
    
    //2. recursion func: 
    //base: if n = 0 return n;
    //rescursive: if n>0 n = func(n-1, n-2);

    int num = 5;
    for(int i=0;i<num;i++){
      System.out.println(rec(i)+" ");
    }

    // int num = 5;
      
    // //pw.close();
    // helper(num);
   }

    public static int rec(int i){
        if (i==0){
        return i;
        }
        if (i==1){
        // System.out.println(i);
        return 1;
        }
        else{
        return rec(i-1)+rec(i-2);
        }
    }

  public static void helper(int num){
    int p1, p2;
    p1 = 0; p2= 1;

    for(int i=0;i<num;i++){
      System.out.print(p1+" ");
      int p3 = p1+p2;
      // 0 1 1 2 
      p1 = p2;
      p2 = p3;
    }
  }
  //
}
