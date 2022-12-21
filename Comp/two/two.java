import java.io.*;
import java.util.*;

public class two {
    public static void main(String [] args) throws IOException{
        Scanner in = new Scanner(new File("test.in"));
        int T = in.nextInt();
        // in.nextLine();
        
        // Process each test case
        for (int t = 0; t < T; t++) {
            // Read N and K
            // in.nextLine();
            int N = in.nextInt(); 
            int K = in.nextInt(); 

            // System.out.println("N: "+N);
            // System.out.println("K: "+K);
            // System.out.println("Task: "+t);

            HashMap<Integer, ArrayList<Character>> map = new HashMap<Integer, ArrayList<Character>>();

            String cow_t = in.next();
            // System.out.println("cows: "+cow_t);

            if(K==0){
                System.out.println(N);
                System.out.println(cow_t);
                continue;
            }
            for(int i=0;i<cow_t.length();i++){
                map.put(i, new ArrayList<Character>());
            }

            for(int i=0;i<cow_t.length();i++){
                char cow = cow_t.charAt(i);
                for(int j=0;j<K;j++){
                    if(i-j<0 || i+j>cow_t.length()-1){
                        continue;
                    }
                    map.get(i).add(cow);
                    map.get(i+j).add(cow);
                    map.get(i-j).add(cow);
                }
            }

            int least = 0;
            int max_size = 0;
            ArrayList<Integer> pos = new ArrayList<Integer>();
            char last_char = 'A';
            String result = "";

            for(int i=0;i<map.size();i++){
                if(max_size<map.get(i).size()){
                    max_size = map.get(i).size();
                }
            }

            for(int i=0;i<map.size();i++){
                if(map.get(i).size()==max_size){
                    least++;
                    pos.add(i);
                    last_char = helper(i, map, last_char).charAt(0);
                    result+=last_char;
                }
                else{
                    result+=".";
                }
            }
            System.out.println(least);
            System.out.println(result);
        }
    }

    static String helper(int id, HashMap<Integer, ArrayList<Character>> map, char last_char){
        ArrayList<Character> al = map.get(id);
        if(al.contains('G')&&al.contains('H')){
            if(last_char=='G'){
                return "H";
            }
            else{
                return "G";
            }
        }
        else{
            return ""+al.get(0);
        }
    }
}
