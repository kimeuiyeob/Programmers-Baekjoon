import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.valueOf(br.readLine());

		List<String> strList = new ArrayList<>();
		for (int i = 0; i < cnt; i++) {
			strList.add(br.readLine());
		}

		Collections.sort(strList, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {

				int age1 = Integer.parseInt(o1.split(" ")[0]);
				int age2 = Integer.parseInt(o2.split(" ")[0]);

				return Integer.compare(age1, age2);
			}
		});

		for (String string : strList) {
			System.out.println(string);
		}

	}
}
