/*
ID: your_id_here
LANG: JAVA
TASK: gift1
*/
import java.io.*;
import java.util.*;

public class gift1_t {
   public static void main (String[] args) throws IOException{
     BufferedReader br=new BufferedReader(new FileReader("gift1.in"));
     Map map = new HashMap<String, Integer>();
     // HashMap<String, Integer> map = new HashMap<String, Integer>();
     int count = Integer.parseInt(br.readLine());
     String[] names = new String[count];
     for(int i=0;i<count;i++){
       names[i]=br.readLine();
       map.put(names[i], 0);
     }
     for(int i=0;i<count;i++){ // 0->count with all ppl
       String giver = br.readLine();
       StringTokenizer st = new StringTokenizer(br.readLine());
       int amount = Integer.parseInt(st.nextToken()); //200 2
       int count_r = Integer.parseInt(st.nextToken());
       // update map using amount and count_r

       if(count_r>0){
        amount /= count_r*count_r;
        map.put(giver, (int)(map.get(giver))-amount); //update of giver
        amount = amount/count_r;
        for(int ii=0;ii<count_r;ii++){
         String r = br.readLine();
         map.put(r, (int)(map.get(r))+amount); // update of reciever
        }
       }
     }
     PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("gift1.out")));
     for(int i=0;i<count;i++){
       pw.print(names[i]+" "+map.get(names[i])+"\n");
     }
     pw.close();
   }
}
