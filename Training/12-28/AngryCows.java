import java.io.*;
import java.util.*;

public class AngryCows {
public static ArrayList<Long> c= new ArrayList<Long>();
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int max = 0;
    for (int i=0; i<N; i++){
       c.add(scanner.nextInt());
    }
    Collections.sort(c);
    for (int i=1; i<N+1; i++){// set up a temp var to record the expnasion(radius of chanin react)
      //for(int j->N) j will be stride
       int count=1+findCountRight(c.get(i-1),i-1, 1, 0)+findCountLeft(c.get(i-1),i-1, 1, 0);
    }
  
    System.out.println();
    scanner.close();
  }
  
  
  public static int findCountLeft(long i, int j, int k, int f){
     int num=i;
     int pos=j;
     int dis=k;
     int count=f;
     if (pos>0&&c.get(j-1)>=i-dis){
         count++;
         for (int g=i-dis; g>=c.get(j-1); g++){
            if (c.contains(g))
               findCountLeft(g, c.indexOf(g), dis+1, count);
         }
     }
     else{
      return count;
     }
  }
  public static int findCountRight(int i, int j, int k, int f){
     int num=i;
     int pos=j;
     int dis=k;
     int count=f;
     if (pos<c.size()-1&&c.get(j+1)<=i+dis){
         count++;
         for (int g=i+dis; g>=c.get(j+1); g--){
            if (c.contains(g))
               findCountRight(g, c.indexOf(g), dis+1, count);
         }
     }
     else{
      return count;
     }
  
  }
}
