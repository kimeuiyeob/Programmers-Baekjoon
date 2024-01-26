import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	// 최대공약수 계산 메서드
	public static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return gcd(b, a % b);
		}
	}

	// 최소공배수 계산 메서드
	public static int lcm(int a, int b) {
		return (a * b) / gcd(a, b);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int totalCnt = Integer.parseInt(sc.nextLine());

		List<String> strArr = new ArrayList<>();

		for (int i = 0; i < totalCnt; i++) {
			strArr.add(sc.nextLine());
		}

		for (String stringArr : strArr) {

			String[] StrArr = stringArr.split(" ");
			int num1 = Integer.parseInt(StrArr[0]);
			int num2 = Integer.parseInt(StrArr[1]);

			int result = lcm(num1, num2);
			System.out.println(result);
		}

	}
}
