// import java.io.*;
// import java.util.*;



// public class AngryCows {
// public static ArrayList<Long> c= new ArrayList<Long>();
//   public static void main(String[] args) {
//     Scanner scanner = new Scanner(System.in);
//     int N = scanner.nextInt();
//     int max = 0;
//     for (int i=0; i<N; i++){
//        c.add(scanner.nextLong());
//     }
//     Collections.sort(c);
//     for (int i=0; i<N; i++){
//     int count=1;
//     int k=1;
//         for (int j=i+1; j<N; j++){
//             if (c.get(j)-c.get(j-1)<=k){
//                 count++;
//                 k++;
//             }
//             else
//                 break;
//         }
//     k=1;
//         for (int j=i; j>0; j++){
//             if (c.get(j)-c.get(j-1)<=k){
//                 count++;
//                 k++;
//             }
//             else
//                 break;
//         }
    
       
//     if (count>max)
//         max=count;

//     }
  
//     System.out.println(max);
//     scanner.close();
//   }
    
//   }


import java.io.*;
import java.util.*;

public class AngryCows {
public static ArrayList<Long> c= new ArrayList<Long>();
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int max = 0;
    for (int i=0; i<N; i++){
       c.add(scanner.nextLong());
    }
    Collections.sort(c);
    for (int i=0; i<N; i++){
    int count=1;
    int recordIndex=0;
    int j=i;
    int o=0;
       while(j<N){
         for (long k=c.get(j)+o+1; k>c.get(j); k--){
            if (c.indexOf(k)!=-1){
               recordIndex=c.indexOf(k);
               count++;
               break;
            }
         break;
         }
       j=recordIndex;
       o++;
       }
       o=0;
       while(j>0){
         for (long k=c.get(j)-o-1; k<c.get(j); k++){
            if (c.indexOf(k)!=-1){
               recordIndex=c.indexOf(k);
               count++;
               break;
            }
         break;
         }
       j=recordIndex;
       o++;
       }

    }
  
    System.out.println();
    scanner.close();
  }
    
}



import java.io.*;
import java.util.*;

public class AngryCows {

  static int N;
  static int[] bales;
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    N = scanner.nextInt();
    //create an array of bales
    bales = new int[N];
    for(int i=0;i<N;i++){
      bales[i] = scanner.nextInt();
    }

    Arrays.sort(bales);
    int max = 0;

    for(int i=0;i<N;i++){
      max = 
        Math.max(max, helper(i, -1)+helper(i, 1)+1);
    }
    System.out.println(max);
    scanner.close();
  }

  static int helper(int start, int dir/*1 or -1*/){
    int radius = 1;
    int prev = start;
    while(true){
      int next = prev;
      //getting the furtherest explosion
      while(
        next+dir>=0 && //dont go over left
        next+dir<N && //dont go over right
        Math.abs(bales[next+dir]-bales[prev]) <= radius
      )
      {
        next+=dir;  
      }

      if(next==prev){
        break;
      }
      prev=next;
      radius++;
    }
    return Math.abs(prev-start);
  }
}