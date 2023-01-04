import java.io.*;
import java.util.*;

public class TamingtheHerd {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    ArrayList<Integer> original = new ArrayList<Integer>();
    Boolean[] k = new Boolean[N];
    int min=0;
    int notPossible=0;
    int track=-1;
    for (int i=0; i<N; i++){
      int a = scanner.nextInt();
      original.add(a);
    }
    
    for (int i=N-1; i>=0; i--){
      if (original.get(i)>i)
         System.out.println(""-1);
      if (original.get(i)==0){
         min+=1;
      }
      if (original.get(i)==-1 && track==0)
         min+=1;
      if (original.get(i)>0){
         track=original.get(i);
         notPossible++;
      }
      if (track>-1)
         track-=1;
      if (i==0)
         min+=1;
      
    
    }
  
    System.out.println(min + " " + (N-notPossible));
    scanner.close();
  }
}


// public class TamingtheHerd {
//   public static void main(String[] args) {
//     Scanner scanner = new Scanner(System.in);
//     int N = scanner.nextInt();
//     scanner.nextLine();
//     int[] A = new int[N];
//     for (int i=0; i<N; i++){
//       A[i] = scanner.nextInt();
//     }

//     //todo
//     //A[0]>0
//     //return -1

//     A[0]=0;
//     int t = -1;
//     int req = 0; // for sure breakout
//     int pos = 0;

//     for(int i=N-1;i>=0;i--){
//       if(t != -1 && A[i] !=-1 && A[i]!=t)
//       {
//         //output -1
//       }
//       if(t==-1){ //update the t to A[i]
//         t = A[i];
//       }
//       if(A[i]==-1){
//         A[i] = t; //breakout map to A[i]
//       }
//       if(A[i]==0){
//         //increase req by 1
//       }
//       //when A[i] is -1
//       //increase pos by 1
//       //when t>-1
//       //t--;
//     }
  
//     System.out.println(req+" "+(req+pos));
//     scanner.close();
//   }
// }
