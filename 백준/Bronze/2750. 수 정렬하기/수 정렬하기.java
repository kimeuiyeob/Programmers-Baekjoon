import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int num1 = Integer.parseInt(st.nextToken());

		Set<Integer> set = new TreeSet<>();

		for (int i = 0; i < num1; i++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			int num2 = Integer.parseInt(st2.nextToken());
			set.add(num2);
		}

		for (Integer value : set) {
			System.out.println(value);
		}

	}
}
