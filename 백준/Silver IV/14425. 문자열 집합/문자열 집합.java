import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < num1; i++) {
			map.put(br.readLine(), 0);
		}
		
		int count = 0;
		for (int i = 0; i < num2; i++) {
			if (map.containsKey(br.readLine()))
				count++;
		}
		
		System.out.print(count);
	}
}