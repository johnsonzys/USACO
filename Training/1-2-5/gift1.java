/*
ID: your_id_here
LANG: JAVA
TASK: gift1
*/
import java.io.*;
import java.util.*;

public class gift1 {
   public static void main (String[] args) throws IOException{
       
       BufferedReader f = new BufferedReader(new FileReader("gift1.in"));
       PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("gift1.out")));
       int i=0;
       int k=Integer.parseInt(f.readLine());
       Person[] e= new Person[k];
       ArrayList m = new ArrayList();
       while (i<k){
           String o = f.readLine();
           m.add(o);
           e[i] = new Person(o);
           i++;
       }
        i=0;
        while (i<k){
            String p = f.readLine();
            int index = m.indexOf(p);
                    String amount = f.readLine();
                    int money = Integer.parseInt(amount.substring(0,amount.indexOf(" ")));
                    int person = Integer.parseInt(amount.substring(amount.indexOf(" ")+1));
                    e[index].income-=money;
                    if (person==0)
                        e[index].income+=0;
                    else
                        e[index].income+=money%person;


                    for (int q=0; q<person; q++){
                        String eachGain= f.readLine();
                        index=m.indexOf(eachGain);
                        e[index].income+=money/person;
                        
                    }

            i++;
        }
       for (int q=0; q<k; q++){
           out.println(e[q].name+" "+e[q].income);
           System.out.println(e[q].name + " " + e[q].income);
       }
       out.close();
   }


    static class Person{
        int income = 0;
        String name="";
        public Person(String k){
            name=k;
        }

        
    }
}
