import java.io.*;
import java.util.*;

public class liars {
    public static void main (String[] args) throws IOException{
       
        BufferedReader f = new BufferedReader(new FileReader("liars.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("liars.out")));
        ArrayList<Integer> L = new ArrayList<Integer>();
        ArrayList<Integer> G = new ArrayList<Integer>();
        int times=Integer.parseInt(f.readLine());
        for (int i=0; i<times; i++){
            String s= f.readLine();
            if (s.substring(0,1).equals("G"))
                G.add(Integer.parseInt(s.substring(2)));
            else
                L.add(Integer.parseInt(s.substring(2)));
        }
        Collections.sort(L);
        Collections.sort(G);
        int min1=0;

      // min_G max_L
      int min_G = G.get(0);
      int max_L = L.get(L.size()-1);

      // longer length
        for (int i=0; i<L.size(); i++){
            for (int g=G.size()-1; g>-1; g--){
                if (L.get(i)<G.get(g))
                    min1++;
                else{
                    break;
                }
            }
        }
        int min2=0;
        for (int g=G.size()-1; g>-1; g--){
            for (int i=0; i<L.size(); i++){
                if (L.get(i)<G.get(g))
                    min2++;
                else{
                    break;
                }
            }
        }
        if (min2>min1)
            System.out.println(min1);
        else
            System.out.println(min2);
    }
}