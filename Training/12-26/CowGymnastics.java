import java.io.*;
import java.util.*;

public class CowGymnastics {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int iter = scanner.nextInt();
    int cows = scanner.nextInt();
    ArrayList<int[]> n = new ArrayList<int[]>();
    for (int i=0; i<iter; i++){
    int[] o = new int[cows];
      for (int j=0; j<cows; j++){
         o[j]=scanner.nextInt();
      
      }
      n.add(o);
    }

    int[] temp = n.get(0);
    int count=0;

    
    for (int i=0; i<cows-1; i++){
      for (int j=i+1; j<cows; j++){
          count+=1;
        // helper(i, j)
         for (int k=1; k<iter; k++){ // iterate in ArrayList<int[]>
            int firstTermIndex = Arrays.asList(n.get(k)).indexOf(temp[i]);
            int secondTermIndex= Arrays.asList(n.get(k)).indexOf(temp[j]);
            if (firstTermIndex>secondTermIndex){
               //count--;
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