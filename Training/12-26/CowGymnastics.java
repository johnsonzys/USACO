import java.io.*;
import java.util.*;

public class CowGymnastics {
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

    
    ArrayList<Integer> temp = n.get(0);
    int count=0;

    
    for (int i=0; i<cows-1; i++){
      for (int j=i+1; j<cows; j++){
          count+=1;
        // helper(i, j)
         for (int k=1; k<iter; k++){ // iterate in ArrayList<int[]>
            int firstTermIndex = n.get(k).indexOf(temp.get(i));
            //System.out.print(firstTermIndex);
            int secondTermIndex = n.get(k).indexOf(temp.get(j));
            //System.out.print(secondTermIndex);
            //System.out.println();
            if (firstTermIndex>secondTermIndex){
               count--;
               break;
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
