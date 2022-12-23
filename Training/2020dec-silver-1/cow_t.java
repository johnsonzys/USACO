import java.io.*;
import java.util.*;

public class cow_t {
	@SuppressWarnings("unchecked")  // don't worry, i totally know what i'm doing
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int farmNum  = Integer.parseInt(read.readLine());
		List<Integer>[] neighbors = new ArrayList[farmNum];
		for (int f = 0; f < farmNum; f++) {
			neighbors[f] = new ArrayList<>();
		}
		for (int i = 0; i < farmNum - 1; i++) {
			StringTokenizer path = new StringTokenizer(read.readLine());
			int farm1 = Integer.parseInt(path.nextToken()) - 1;
			int farm2 = Integer.parseInt(path.nextToken()) - 1;
			neighbors[farm1].add(farm2);
			neighbors[farm2].add(farm1);
		}

		int minDays = 0;
		boolean[] visited = new boolean[farmNum];
		Queue<Integer> frontier = new ArrayDeque<>(Collections.singletonList(0));
		visited[0] = true;
		while (!frontier.isEmpty()) {
			int current = frontier.poll();
			// this stores all the farms that this farm should spread to for optimal spreading
			int spreadTo = 0;
			for (int n : neighbors[current]) {
				if (!visited[n]) {
					spreadTo++;
					visited[n] = true;
					frontier.add(n);
				}
			}
			// the log base 2 is so enough superspreader events go around so that there are enough cows, and then we need to add the length of spreadTo so the cows can actually go to the other farms
			minDays += ceilLog2(spreadTo + 1) + spreadTo;
		}

		System.out.println(minDays);
	}

	// returns the smallest x such that 2^x >= n
	private static int ceilLog2(int n) {
		int count = 0;
		int so_far = 1;
		while (so_far < n) {
			so_far *= 2;
			count++;
		}
		return count;
	}
}