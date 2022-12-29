import java.io.*;
import java.util.*;

public class CowGymnastics_t {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int iter = scanner.nextInt();
    int cows = scanner.nextInt();
    ArrayList<ArrayList<Integer>> n = new ArrayList<ArrayList<Integer>>();
    for (int i=0; i<iter; i++){
    ArrayList<Integer> o = new ArrayList<Integer>();
      for (int j=0; j<cows; j++){
         o.add(scanner.nextInt());
      }
      n.add(o);
    }

    int count = 0;
    
    for (int i=1; i<=cows-1; i++){
      for (int j=i+1; j<=cows; j++){
        // System.out.println(i+" "+j);
         for (int k=0; k<n.size(); k++){ // iterate in ArrayList<int[]>
            int recorder = 0;
            Integer firstTermIndex = n.get(k).indexOf(i);
            Integer secondTermIndex = n.get(k).indexOf(j);
            // System.out.println(firstTermIndex+", "+secondTermIndex);
            if (firstTermIndex>secondTermIndex){
              recorder++;
            }
            else{
              recorder--;
            }
            if(recorder == 3 || recorder == -3){
              // System.out.println("Yes");
              count++;
             }
         }
      }
    }
  
    System.out.println(count);
    scanner.close();
  }
  // static helper(int i, int j){
    
  //   return true;
  // }
}
