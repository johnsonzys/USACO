import java.io.*;
import java.util.*;

public class lonely {
    public static int count = 0;
    public static int l;
    public static String k;
    public static void main (String[] args) throws IOException{
       
        BufferedReader f = new BufferedReader(new FileReader("lonely.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("lonely.out")));

        l = Integer.parseInt(f.readLine());
        k = f.readLine();
        rec(3);
        System.out.println(count);
        out.println(count);
        f.close();
        out.close();
    }

    static int rec (int i){
        for (int index=0; index<l-i+1; index++ ){
            String o = k.substring(index, index+i);
            if (o.indexOf("G")!=-1 && o.indexOf("H")!=-1){
                int g = o.indexOf("G");
                int h = o.indexOf("H");
                String reduced1 = o.substring(0,g) + o.substring(g+1);
                String reduced2 = o.substring(0,h) + o.substring(h+1);
                if (reduced1.indexOf("G")==-1 || reduced2.indexOf("H")==-1){
                    count+=1;
                }
            }
        }
        if (i==l)
            return 0;
    return rec(i+1);
    }
}