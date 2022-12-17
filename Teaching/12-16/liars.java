import java.io.*;
import java.util.*;
 
public class liars {
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("liars.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("liars.out")));
        int n = Integer.parseInt(br.readLine());
        Information[] infos = new Information[n];
        for (int j = 0; j < n; j++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char c = st.nextToken().charAt(0);
            int v = Integer.parseInt(st.nextToken());
            infos[j] = new Information(c, v);
        }
        int answer = n;
        for (Information tight : infos) {
            int x = tight.reference;
            int liars = 0;
            for (Information info : infos) {
                if (info.direction == 'G' ? x < info.reference : x > info.reference) {
                    liars++;
                }
            }
            answer = Math.min(answer, liars);
        }
        System.out.println(answer);

        br.close();
        pw.close();
    }
 
    public static class Information {
        public final char direction;
        public final int reference;
 
        public Information(char direction, int reference) {
            this.direction = direction;
            this.reference = reference;
        }
    }
}