import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	// 최대공약수 계산 메서드
	public static long gcd(long a, long b) {
		if (b == 0) {
			return a;
		} else {
			return gcd(b, a % b);
		}
	}

	// 최소공배수 계산 메서드
	public static long lcm(long a, long b) {
		return (a * b) / gcd(a, b);
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		long num1 = Integer.parseInt(st.nextToken()); // 정수 A
		long num2 = Integer.parseInt(st.nextToken()); // 정수 B

		long result = lcm(num1, num2);
		System.out.println(result);

	}
}