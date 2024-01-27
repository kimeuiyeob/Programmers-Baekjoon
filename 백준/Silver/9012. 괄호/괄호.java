import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {

		Main main = new Main();
		List<String> value = main.inputValue();
		List<String> answer = main.getAnswer(value);
		main.printAnswer(answer);
	}

	public List<String> inputValue() throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.valueOf(br.readLine());
		List<String> strList = new ArrayList<>();

		for (int i = 0; i < cnt; i++) {
			strList.add(br.readLine());
		}

		return strList;
	}

	public List<String> getAnswer(List<String> inputValue) {

		List<String> answerList = new ArrayList<>();

		for (String str : inputValue) {
			Stack<Character> stack = new Stack<>();

			boolean isValid = true;
			for (char ch : str.toCharArray()) {
				if (ch == '(') {
					stack.push(ch);
				} else if (ch == ')') {
					if (stack.isEmpty() || stack.pop() != '(') {
						isValid = false;
						break;
					}
				}
			}

			if (isValid && stack.isEmpty()) {
				answerList.add("YES");
			} else {
				answerList.add("NO");
			}
		}
		return answerList;
	}

	public void printAnswer(List<String> answerList) {

		for (String answer : answerList) {
			System.out.println(answer);
		}
	}
}