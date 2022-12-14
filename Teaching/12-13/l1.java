import java.io.*;
import java.util.*;

public class l1 {
    public static void main(String [] args) throws IOException{
        BufferedReader f = new BufferedReader(new FileReader("l1.in"));
        String s = f.readLine();
        String s1 = f.readLine();

        Scanner in = new Scanner(new File("l1.in"));
        String n = in.nextLine();

        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("l1.out")));

        out.println(s1+s+n);
        out.close();
    }
}
