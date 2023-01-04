import java.io.*;
import java.util.*;

public class coins {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int count=0;
    count+=N/5; // step num 5 with 1 iter
    count+=(N%5)/2; // step num 2 with 1 iter
    count+=((N%5)%2/1); //step num 1 with 1 iter
    
    System.out.println(count);
    scanner.close();
  }
}
