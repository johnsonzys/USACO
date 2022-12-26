import java.io.*;
import java.util.*;

public class CowGymnastics_t {
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

    
    for (int i=0; i<cows-1; i++){
      for (int j=i+1; j<cows; j++){
         for (int k=1; k<n.size(); k++){ // iterate in ArrayList<int[]>
            int firstTermIndex = Arrays.asList(n.get(k)).indexOf(temp[i]);
            int secondTermIndex= Arrays.asList(n.get(k)).indexOf(temp[j]);
            if (firstTermIndex>secondTermIndex){

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
