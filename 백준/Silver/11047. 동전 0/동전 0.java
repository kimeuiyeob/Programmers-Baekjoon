import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] numbers = sc.nextLine().split(" ");
		int price = Integer.valueOf(numbers[1]);
		int[] cnt = new int[Integer.valueOf(numbers[0])];

		for (int i = 0; i < Integer.valueOf(numbers[0]); i++) {
			cnt[i] = sc.nextInt();
		}

		int answer = 0;

		for (int i = cnt.length - 1; i >= 0; i--) {
			if (price / cnt[i] >= 1) {
				int count = price / cnt[i];
				answer += count;
				price = price % cnt[i];
			}
		}

		System.out.println(answer);
	}
}