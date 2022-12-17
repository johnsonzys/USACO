import java.io.*;
import java.util.*;

public class liars_t {

    static ArrayList<Integer> L = new ArrayList<Integer>();
    static ArrayList<Integer> G = new ArrayList<Integer>();
    public static void main (String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("liars.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("liars.out")));

        int num = Integer.parseInt(br.readLine());
        for(int i=0;i<num;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            char c = st.nextToken().charAt(0);
            int v = Integer.parseInt(st.nextToken());
            // System.out.println(c);
            // System.out.println(v);
            if(c == 'L'){
                L.add(v);
            }
            else{
                G.add(v);
            }
        }
        // for (Integer i : L) {
        //     System.out.println(i);
        // }

        Collections.sort(L);
        Collections.sort(G);
        int max_G = G.get(G.size()-1);
        int min_L = L.get(0);

        int result = 0;

        for(Integer i:L){
            if(i<max_G){
                result++;
            }
        }
        for(Integer i:G){
            if(i>min_L){
                result++;
            }
        }

        if(num<=2){
            result--;
        }

        System.out.println(result);
        pw.println(result);

        br.close();
        pw.close();
    }

    // static void helper (){

    // }
    
}
