import java.io.*;
import java.util.*;

public class MadScientist {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    scanner.nextLine();
    char[] a = scanner.nextLine().toCharArray();
    char[] b = scanner.nextLine().toCharArray();

    int result = 0;
    String beginning = "";
    String change = "";
    int i=0;
    while (i<a.length){
    //System.out.println(i);
         if (a[i]!=b[i]){
            beginning = a[i]+b[i]+"";
           //debug println
            //System.out.println("1");
            result+=1;
            i+=1;
            while ((a[i+1]+b[i+1]+"").equals(beginning) && i<a.length){
                i++;
                //System.out.println("2");
                
            }
            if (a[i+1]!=b[i+1]){
                result+=1;
                i++;
                //System.out.println("3");
            }
        }
       
        else
            i++;
    }
  
    System.out.println(result);
    scanner.close();
  }
}
