import java.io.*;
import java.util.*;

class cowvid{
 static ArrayList<Integer> a = new ArrayList<Integer>();
    static int max;
  
  public static void main(String [] args)throws IOException{
    BufferedReader br = new BufferedReader(new FileReader("test1.in"));
    int count = Integer.parseInt(br.readLine());
    max = 2*(count-1);
    for (int i=0; i<count-1; i++){
        StringTokenizer st = new StringTokenizer(br.readLine());
        a.add(Integer.parseInt(st.nextToken()));
        //System.out.println(a.get(i));
    }
    Collections.sort(a);
      int o=a.get(a.size()-1)+1;
    for (int i=1; i<o; i++){
        //System.out.println(a.get(a.size()-1));
        helper(i);
        
    }
    System.out.println(max);
      
    
  }

  public static void helper(int i){
      int count=1;
      while (a.indexOf(i)>-1){
          count++;
          a.remove(a.indexOf(i));
      }
        int k=(int)Math.ceil(Math.log((double)count) / Math.log(2));
        //System.out.println(k+" "+count);
        max-=(count-k-1);

  }
}