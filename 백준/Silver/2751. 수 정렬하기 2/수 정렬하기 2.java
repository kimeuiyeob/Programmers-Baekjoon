import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int inputSize = Integer.parseInt(br.readLine());
		int[] input = new int[inputSize];

		for (int i = 0; i < inputSize; i++) {
			input[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(input);

		StringBuilder sb = new StringBuilder();
		for (int number : input) {
			sb.append(number).append("\n");
		}
		System.out.print(sb);
	}
}