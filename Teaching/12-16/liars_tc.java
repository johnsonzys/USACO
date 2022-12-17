import java.io.*;
import java.util.*;

public class liars_tc {

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

        Collections.sort(L);
        Collections.sort(G);
        int max_G = G.get(G.size()-1);
        int min_L = L.get(0);
        int length = max_G-min_L;
        int result = 1000000;

        System.out.println(length);


        for(int i=1;i<=length;i++){
            int least = 0;
            for(Integer l:L){
                if(i>l){least++;}
            }
            for(Integer g:G){
                if(i<g){least++;}
            }
            if(least<result){result = least;}
        }

        System.out.println(result);
        pw.println(result);

        br.close();
        pw.close();
    }

    // static void helper (){

    // }
    
}
