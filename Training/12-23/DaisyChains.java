import java.io.*;
import java.util.*;


public class DaisyChains {
    public static ArrayList<Integer> whole = new ArrayList<Integer>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = N;
        for (int i=0; i<N; i++){
            whole.add(scanner.nextInt());
        }
        for (int i=0; i<N-1; i++){
            for (int j=i+1; j<N; j++){
            int sum=0;
            int terms=0;
            ArrayList<Integer> partial = new ArrayList<Integer>();
            for (int k=i; k<j+1; k++){
                  sum+=whole.get(k);
                  terms++;
                  partial.add(whole.get(k));
            }
            if (sum%terms==0&&partial.indexOf((int)sum/terms)!=-1){
              count++; 
            }
          }
        }
        
  
    System.out.println(count);
    scanner.close();
    }
    
}