import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Main main = new Main();
		List<Integer> intList = main._inputValue(); // 입력 받기
		int middleScore = main._getMiddleScore(intList); // 중간값
		int avgScore = main._getAvgScore(intList); // 중간값
		main.output(middleScore, avgScore); // 출력 하기

	}

	public List<Integer> _inputValue() {
		Scanner sc = new Scanner(System.in);
		List<Integer> intList = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			int number = sc.nextInt();
			intList.add(number);
		}
		sc.close();

		return intList;
	}

	public int _getMiddleScore(List<Integer> intList) {
		Collections.sort(intList);
		return intList.get(intList.size() / 2);
	}

	public int _getAvgScore(List<Integer> intList) {
		int sum = 0;
		for (Integer nums : intList) {
			sum += nums;
		}
		return sum / intList.size();
	}

	public void output(int middleScore, int avgScore) {
		System.out.println(avgScore);
		System.out.println(middleScore);
	}

}