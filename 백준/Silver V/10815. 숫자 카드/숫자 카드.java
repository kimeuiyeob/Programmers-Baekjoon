import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int cnt1 = Integer.parseInt(br.readLine());
		int[] cntList = new int[cnt1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < cnt1; i++) {
			cntList[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(cntList);

		int cnt2 = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < cnt2; i++) {
			int num = Integer.parseInt(st.nextToken());
			if (Arrays.binarySearch(cntList, num) >= 0) {
				sb.append("1 ");
			} else {
				sb.append("0 ");
			}
		}

		System.out.println(sb.toString().trim());
	}
}