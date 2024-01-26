import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int num1 = Integer.parseInt(st.nextToken());

		Deque<Integer> stack = new ArrayDeque<>();

		for (int i = 1; i <= num1; i++) {
			stack.add(i);
		}

		for (int i = 1; i < num1; i++) {
			stack.removeFirst();
			stack.addLast(stack.pop());
		}

		System.out.println(stack.peek());

	}
}
