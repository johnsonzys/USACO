import java.io.*;
import java.util.*;

class DiamondCollector{
  public static void main(String [] args){
       Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int diff = in.nextInt();
      int max = 0;
      int[] a = new int[num];
      for (int i=0; i<num; i++){
        a[i]=in.nextInt();
        
      }
      Arrays.sort(a);
      for (int i=0; i<num; i++){
          int b = a[i]+diff;
          for (int j=i+1; j<num; j++){
              if (a[j]>b){
                  max = Math.max(max, j-i);
                  break;
              }
          }
      }
      System.out.println(max);
    
  }
}