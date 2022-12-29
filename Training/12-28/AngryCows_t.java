import java.io.*;
import java.util.*;

public class AngryCows_t {
public static ArrayList<Long> c= new ArrayList<Long>();
static int N;
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    N = scanner.nextInt();
    int max = 0;
    for (int i=0; i<N; i++){
       c.add(scanner.nextLong());
    }
    Collections.sort(c);
    for (int i=0; i<N; i++){
        int res = 1;
        int step = 1;
        res+=left(i, step)+right(i, step);
        max = Math.max(res, max);
    }
  
    System.out.println(max);
    scanner.close();
  }

  static int left(int num, int step){
    if(num==0){
        return 1;
    }
    if((c.get(num)-step)>c.get(num-1)){
        return 1;
    }
    else{
        return left(num-1,step++)+1;
    }
  }

  static int right(int num, int step){
    if(num==N-1){
        return 1;
    }
    if((c.get(num)+step)<c.get(num+1)){
        return 1;
    }
    else{
        return right(num+1,step++)+1;
    }
  }
  
}
