/*
ID: skylery
LANG: JAVA
TASK: Cow College
*/
import java.io.*;
import java.util.*;

public class one {
    public static void main(String [] args) throws IOException{
        Scanner in = new Scanner(System.in);

        int cows = Integer.parseInt(in.nextLine());
        ArrayList n = new ArrayList();
        ArrayList distinct = new ArrayList();
        StringTokenizer st = new StringTokenizer(in.nextLine());
        for (int i=0; i<cows; i++){
            int s = Integer.parseInt(st.nextToken());
            n.add(s);
            if (distinct.indexOf(s)==-1)
                distinct.add(s);
        }
        System.out.println(n);
        
        Collections.sort(n);
        Collections.sort(distinct);
        int sum=0;
        int tuition=0;
        for (int i=0; i<distinct.size(); i++){
            int index = (int)(n.indexOf(distinct.get(i)));
            int total = (int)(distinct.get(i))*(n.size()-index);
            if (total>sum){
                sum=total;
                tuition=(int)(distinct.get(i));
            }
        }
        
        
        System.out.println(sum + " " + tuition); 

    }
}
