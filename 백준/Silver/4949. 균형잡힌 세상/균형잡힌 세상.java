import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<String> answerList = new ArrayList<>();

		while (true) {
			String line = br.readLine();

			if (line.equals(".")) {
				break;
			}

			Stack<Character> stack = new Stack<>();

			for (char c : line.toCharArray()) {

				if (stack.size() == 1) {
					if (stack.peek() == ')' || stack.peek() == ']') {
						answerList.add("no");
						stack.clear();
						break;
					}
				}

				if (c == '(') {
					stack.add('(');
				}
				if (c == '[') {
					stack.add('[');
				}

				if (c == ')') {
					if (stack.isEmpty()) {
						stack.add(')');
						break;
					}
					if (stack.peek() == '(') {
						stack.pop();
					} else {
						stack.add(')');
					}
				}
				if (c == ']') {
					if (stack.isEmpty()) {
						stack.add(']');
						break;
					}
					if (stack.peek() == '[') {
						stack.pop();
					} else {
						stack.add(']');
					}
				}
			}

			if (stack.isEmpty()) {
				answerList.add("yes");
			} else {
				answerList.add("no");
			}
		}

		for (String string : answerList) {
			System.out.println(string);
		}

	}
}
