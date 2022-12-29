import java.io.*;
import java.util.*;

public class BovineGenomics {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
      int N = scanner.nextInt();
      int M = scanner.nextInt();
      scanner.nextLine();
      ArrayList<ArrayList<String>> n = new ArrayList<ArrayList<String>>();
      ArrayList<ArrayList<String>> m = new ArrayList<ArrayList<String>>();
      for (int i=0; i<N; i++){
         String s = scanner.nextLine();
         ArrayList<String> list = new ArrayList<String>(Arrays.asList(s.split("")));
         n.add(list);
         //System.out.println(list);
      }
      for (int i=0; i<N; i++){
         String s = scanner.nextLine();
         ArrayList<String> list = new ArrayList<String>(Arrays.asList(s.split("")));
         m.add(list);
         //System.out.println(list);

      }
      
      int count=0;
      
      for (int i=0; i<M; i++){
      boolean t = false;
         for (int j=0; j<N; j++){
            for (int k=0; k<N; k++){
               if (m.get(k).get(i).contains(n.get(j).get(i)))
                  t=true;
            }
         
         }
      if (t==false)
         count++;
      }
      
      
    System.out.println(count);
    scanner.close();
    
  }
}

