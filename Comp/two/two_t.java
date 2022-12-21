import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class two_t {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            char[] cows = br.readLine().toCharArray();

            int patches = 0;
            char[] patchPositions = new char[N];
            for (int i = 0; i < N; i++) {
                if (i - K - 1 >= 0 && patchPositions[i - K - 1] == cows[i]) {
                    continue;
                }
                if (i + K + 1 < N && patchPositions[i + K + 1] == cows[i]) {
                    continue;
                }
                patchPositions[i] = cows[i];
                patches++;
            }

            System.out.println(patches);
            System.out.println(patchPositions);
        }
    }
}
