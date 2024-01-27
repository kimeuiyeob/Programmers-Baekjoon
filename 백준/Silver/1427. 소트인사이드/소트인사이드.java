import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String value = br.readLine();

		List<Integer> intList = new ArrayList<>();

		for (char num : value.toCharArray()) {
			intList.add(Integer.valueOf(num + ""));
		}

		Collections.sort(intList, Collections.reverseOrder());

		StringBuilder sb = new StringBuilder();

		for (Integer num : intList) {
			sb.append(num);
		}

		System.out.println(sb);

	}
}
