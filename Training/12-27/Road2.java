import java.io.*;
import java.util.*;

public class Road2 {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String s = scanner.nextLine();
      ArrayList<String> list = new ArrayList<String>(Arrays.asList(s.split(""))); // orignal string
      int count=0;
      
      for (int i=65; i<90; i++){ 
         for (int j=i+1; j<91; j++){
            boolean test = list.indexOf((char)i+"") > list.indexOf((char)j+""); // charAt(), indexOf((char))
            ArrayList<String> removableTest = new ArrayList<String>(Arrays.asList(s.split(""))); // String temp = new String(s);
            if (test==false){
               removableTest.remove(removableTest.indexOf((char)i+""));
               int index = removableTest.indexOf((char)j+"");
               if (index<removableTest.indexOf((char)i+"")){
               removableTest.remove(removableTest.indexOf((char)j+"")); // new String with substrings
               if (removableTest.indexOf((char)i+"") < removableTest.indexOf((char)j+"")){
                  //System.out.println(i+" "+j);
                  count++;}
            }
            }
            else{
               removableTest.remove(removableTest.indexOf((char)j+""));
               int index = removableTest.indexOf((char)i+"");
            
            if (index<removableTest.indexOf((char)j+"")){
               removableTest.remove(removableTest.indexOf((char)i+""));
               if (removableTest.indexOf((char)i+"") > removableTest.indexOf((char)j+"")){
                  //System.out.println(i+" "+j);
                  count++;}
            }
            }
            
         }
      
      
      }
      
   
      System.out.println(count);
      scanner.close();
  }
}
