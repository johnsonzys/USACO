//http://www.usaco.org/index.php?page=viewproblem2&cpid=1059
import java.io.*;
import java.util.*;

public class abc {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("abc.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("abc.out")));
        ArrayList a = new ArrayList();
        StringTokenizer st= new StringTokenizer(br.readLine());
        for (int i=0; i<7; i++){
            a.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(a);
        int A = (int)a.get(0);
        int B = (int)a.get(1);
        int sum = (int)a.get(6);
        int diff = sum-A-B;
        pw.print(a.get(0) + " " + a.get(1) + " " + diff);
        br.close();
        pw.close();
    }
}
