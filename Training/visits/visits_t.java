import java.util.*;

public class visits_t {
    static class DSU {
        int[] e;
        void init(int N) { e = new int[N]; Arrays.fill(e, -1); }
        int get(int x) { 
            if (e[x]<0)
            {
                return x;
            }
            else
            {
                return e[x] = get(e[x]);
            }
        }
        boolean unite(int x, int y) {
            x = get(x); y = get(y);
            if (x == y) return false;
            if (e[x] > e[y]) { int t = x; x = y; y = t; }
            e[x] += e[y];
            e[y] = x;
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<int[]> edges = new ArrayList<>();
        for (int i = 1; i <= N; ++i) {
            int a = sc.nextInt();
            int v = sc.nextInt();
            edges.add(new int[]{v, i, a});
        }
        edges.sort((a, b) -> b[0] - a[0]);
        DSU D = new DSU();
        D.init(N + 1);
        long ans = 0;
        for (int[] edge : edges) {
            int v = edge[0], x = edge[1], y = edge[2];
            if (D.unite(x, y)) ans += v;
        }
        System.out.println(ans);
    }
}
