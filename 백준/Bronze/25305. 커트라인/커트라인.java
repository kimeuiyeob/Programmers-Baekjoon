import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Main main = new Main();

		List<Integer> numberList = main._inputValue();
		int answer = main._getAnswer(numberList);
		main.printOut(answer);

	}

	public List<Integer> _inputValue() {

		Scanner sc = new Scanner(System.in);
		String numbers = sc.nextLine();

		String[] strArr = numbers.split(" ");
		int loops = Integer.valueOf(strArr[0]);
		int pick = Integer.valueOf(strArr[1]);

		List<Integer> intList = new ArrayList<>();

		for (int i = 0; i < loops; i++) {
			intList.add(sc.nextInt());
		}
		sc.close();
		intList.add(pick);

		return intList;
	}

	public int _getAnswer(List<Integer> numberList) {

		int lastIndex = numberList.size() - 1;
		int pick = numberList.remove(lastIndex);

		for (int i = 0; i < numberList.size(); i++) {
			int num1 = numberList.get(i);
			for (int j = i + 1; j < numberList.size(); j++) {
				int num2 = numberList.get(j);
				if (num2 > num1) {
					numberList.set(i, num2);
					numberList.set(j, num1);
					num1 = num2;
				}
			}
		}

		return numberList.get(pick - 1);
	}

	public void printOut(int answer) {
		System.out.println(answer);
	}
}