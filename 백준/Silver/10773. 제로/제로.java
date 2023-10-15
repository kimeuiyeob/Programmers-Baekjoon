import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numberRange = sc.nextInt();
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < numberRange; i++) {

			int number = sc.nextInt();
			if (number == 0 && !stack.isEmpty()) {
				stack.pop();
			} else {
				stack.push(number);
			}
		}

		Iterator<Integer> iter = stack.iterator();
		int result = 0;
		while (iter.hasNext()) {
			result += iter.next();
		}

		System.out.println(result);

	}

}