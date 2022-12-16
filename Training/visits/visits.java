import java.io.*;
import java.util.*;

public class visits {
    public static void main (String[] args) throws IOException{
       
        BufferedReader f = new BufferedReader(new FileReader("visits.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("visits.out")));
        Map map = new HashMap<Integer, Integer>();
        int total=Integer.parseInt(f.readLine());
        String s=f.readLine();
        int firstIn = Integer.parseInt(s.substring(0, s.indexOf(" ")));
        int lastIn = (firstIn+total-1)%total;
        if (lastIn==0){
            lastIn+=total;
        }
        map.put(firstIn, Integer.parseInt(s.substring(s.indexOf(" ")+1)));
        for (int i=1; i<total; i++){
            s = f.readLine();
            map.put(Integer.parseInt(s.substring(0, s.indexOf(" "))), Integer.parseInt(s.substring(s.indexOf(" ")+1)));
        }
        int clockVis=0;
        for (int i=firstIn; i<firstIn+total-1; i++){
            int next=(i+1)%total;
            if (next==0){
                next+=total;
            }
            clockVis+=(int)map.get(next);
        }
        System.out.println(clockVis);
        int counterVis=0;
        int count=0;
        for (int i=lastIn; i>lastIn-total; i--){
            int k=i;
            if (i<=0){
                k+=total;
            }
            int next=(i-1)%total;
            if (next<=0){
                next+=total;
            }
            if (count%2==0){
                counterVis+=(int)map.get(next);
            }
            count++;
        }
        System.out.println(counterVis);
        if (counterVis>clockVis){
            out.println(counterVis);
        }
        else{
            out.println(clockVis);
        }
        out.close();
   }
}