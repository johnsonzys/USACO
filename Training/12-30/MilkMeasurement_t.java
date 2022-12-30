import java.io.*;
import java.util.*;

public class MilkMeasurement_t {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    scanner.nextLine();

    // initialize file I/O
    
    // read in all of the notes
    int[] day = new int[n];
    String[] cow = new String[n];
    int[] change = new int[n];
    for(int i = 0; i < n; i++) {
        StringTokenizer st = new StringTokenizer(scanner.nextLine());
        day[i] = Integer.parseInt(st.nextToken());
        cow[i] = st.nextToken();
        change[i] = Integer.parseInt(st.nextToken());
    }
    
    // the milk variables track the amount of milk that each cows was last known to produce
    int bessieMilk = 7, elsieMilk = 7, mildredMilk = 7;
    // the on variables are true if that cow produced the highest amount of milk on the previous day
    boolean bessieOn = true, elsieOn = true, mildredOn = true;
    int dayAdjust = 0;
    
    for(int currDay = 1; currDay <= 100; currDay++) {
        // look through the notes to see if there were any changes on this day
        for(int i = 0; i < n; i++) {
            if(day[i] == currDay) {
                if(cow[i].equals("Bessie")) {
                    bessieMilk += change[i];
                }
                if(cow[i].equals("Elsie")) {
                    elsieMilk += change[i];
                }
                if(cow[i].equals("Mildred")) {
                    mildredMilk += change[i];
                }
            }
        }
        // compute the highest milk total and see which cows produced the most milk 
        int highestMilk = Math.max(bessieMilk, Math.max(elsieMilk, mildredMilk));
        boolean bessieOnNext = bessieMilk == highestMilk;
        boolean elsieOnNext = elsieMilk == highestMilk;
        boolean mildredOnNext = mildredMilk == highestMilk;
        if(bessieOn != bessieOnNext || elsieOn != elsieOnNext || mildredOn != mildredOnNext) {
            dayAdjust++;
        }
        bessieOn = bessieOnNext;
        elsieOn = elsieOnNext;
        mildredOn = mildredOnNext;
    }
    System.out.println(dayAdjust);
    scanner.close();
  }
}
