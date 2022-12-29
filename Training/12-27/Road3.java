import java.io.*;
import java.util.*;

public class Road3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Map<Integer, Integer> m = new HashMap<>();
    int n = scanner.nextInt();
    ArrayList<Integer> r= new ArrayList();
    //ArrayList<Integer> p = new ArrayList();
    for(int i=0; i<n; i++){
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        r.add(a);
        m.put(a,b);
    }
      
    Collections.sort(r);
    int sum=r.get(0);
    for (int i=0; i<n; i++){
        sum+=m.get(r.get(i));
        //System.out.println(sum);
        if (i<n-1&&sum-r.get(i+1)<0){
            sum-=sum-r.get(i+1);
        }
        //System.out.println(sum);
    }
    System.out.println(sum);
    scanner.close();
  }
    
  
}
