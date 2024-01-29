import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		List<String> numbers = new ArrayList<>();

		for (int i = 0; i < 3; i++) {
			numbers.add(br.readLine());
		}

		Map<Integer, Integer> map1 = new HashMap<>();
		Map<Integer, Integer> map2 = new HashMap<>();

		for (String str : numbers) {

			String[] nums = str.split(" ");
			int num1 = Integer.valueOf(nums[0]);
			int num2 = Integer.valueOf(nums[1]);

			map1.put(num1, map1.getOrDefault(num1, 0) + 1);
			map2.put(num2, map2.getOrDefault(num2, 0) + 1);
		}

		int answer1 = 0;
		int answer2 = 0;

		for (Map.Entry<Integer, Integer> val : map1.entrySet()) {
			if (val.getValue() == 1) {
				answer1 = val.getKey();
			}
		}
		for (Map.Entry<Integer, Integer> val : map2.entrySet()) {
			if (val.getValue() == 1) {
				answer2 = val.getKey();
			}
		}

		System.out.println(answer1 + " " + answer2);
	}
}