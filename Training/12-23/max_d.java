import java.io.*;
import java.util.*;

class max_d{
  
  public static void main(String [] args){
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    int[] x = new int[N];
    int[] y = new int[N];

    for(int i = 0;i<N;i++){
      x[i]=in.nextInt();
    }
    for(int i = 0;i<N;i++){
      y[i]=in.nextInt();
    }

    int result = 0; // max euliean distance

    for (int i=0; i<N; i++){
        for (int j=0; j<N; j++){
            // int max = (int)(Math.pow(x[j]-x[i],2))+(int)Math.pow(y[j]-y[i],2);
            // if (max>result)
            //     result=max;

          int dx = x[i]-x[j];
          int dy = y[i]-y[j];

          result = Math.max(result, dx*dx+dy*dy);
        }
    }

    System.out.println(Math.sqrt(result));
    
  }
}