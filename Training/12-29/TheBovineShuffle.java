// import java.io.*;
// import java.util.*;

// public class TheBovineShuffle{
//   public static void main(String[] args) {
//     Scanner scanner = new Scanner(System.in);
//     int N = scanner.nextInt();
//     TreeMap<Integer, String> k = new TreeMap<Integer, String>();
//     int[] p = new int[N];
//     for (int i=0; i<N; i++){
//         p[i]=scanner.nextInt();
//     }
//     scanner.nextLine();
//     String[] o = scanner.nextLine().split(" ");
//     for (int i=0; i<N; i++){
//         k.put(p[i],o[i]);
//     }
//     for (Map.Entry<Integer, String> entry: k.entrySet()){
//         System.out.println(entry.getValue());
//     }
  
//     scanner.close();
//   }
// }


import java.io.*;
import java.util.*;

public class TheBovineShuffle{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();

    //if the cow in position i after shuffling, then i will move
    int[] moveTo = new int[N+1];

    scanner.nextLine();

    StringTokenizer st = new StringTokenizer(scanner.nextLine());
    for(int i=1;i<=N;i++){
      //des location of a cow would be after a suffle
      //init position is at i
      int destination = Integer.parseInt(st.nextToken());
      moveTo[destination] = i;
    }

    int[] finalLocation = new int[N+1];
    st = new StringTokenizer(scanner.nextLine());
    for(int i=1;i<=N;i++){
      finalLocation[i] = Integer.parseInt(st.nextToken());
    }
    //allocate the cows to the moveTo
    int[] originalLocation = new int[N+1];
    for(int finalPos=1;finalPos<=N;finalPos++){
      int curr = finalPos;
      //reverse
      for(int j=0;j<3;j++){
        curr = moveTo[curr];
      }
    originalLocation[curr] = finalLocation[finalPos];
    }

    for(int i=1;i<=N;i++){
      System.out.println(originalLocation[i]);
    }
  
    scanner.close();
  }
}
