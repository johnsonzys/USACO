import java.io.*;
import java.util.*;

public class MilkMeasurement{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    scanner.nextLine();
    ArrayList<Cows> cow = new ArrayList<Cows>();
    TreeMap<Integer, String[]> m = new TreeMap<Integer, String[]>();
    for (int i=0; i<n; i++){
      String[] k = scanner.nextLine().split(" ");
      String[] o = {k[1], k[2]};
      m.put(Integer.parseInt(k[0]), o);
      cow.add(new Cows(k[1]));
    }
    //System.out.println(m);
    int change=0;
    int prevHigh=7;
    int prevCount=4;
    for (Map.Entry<Integer, String[]> e: m.entrySet()){
    int max=0;
    int count=0;
         for (Cows p : cow){
               if (p.name.equals(e.getValue()[0]))
                  p.changeNum(e.getValue()[1]);
               int value=p.num;
               if (value>max){
                  count=0;
                  max=value;
                  count++;
               }
               else if (value==max)
                  count++;
               prevHigh=value;
               prevCount=count;
             }
          if (max!=prevHigh && count!= prevCount)
               change+=1;
             
             
    }
    
  }
  static class Cows{
  public static int num=7;
  public static String name="";
      public Cows(String i){
         name=i;
      
      }
      public static void changeNum(String i){
         if (i.substring(0,1).equals("+"))
            num+=Integer.parseInt(i.substring(1));
         else
            num-=Integer.parseInt(i.substring(1));
      }

  }
}