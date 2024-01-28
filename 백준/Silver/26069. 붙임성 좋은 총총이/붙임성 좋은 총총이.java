import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {

		Main main = new Main();
		List<String> peoples = main.inputValue();
		Set<String> dancingPeople = main.getDancingPeople(peoples);
		main.printOut(dancingPeople);

	}

	public List<String> inputValue() throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.valueOf(br.readLine());
		List<String> strList = new ArrayList<>();

		for (int i = 0; i < cnt; i++) {
			strList.add(br.readLine());
		}

		return strList;
	}

	public Set<String> getDancingPeople(List<String> peoples) {

		Set<String> set = new HashSet<>();
		boolean flag = false;

		for (String people : peoples) {

			String[] persons = people.split(" ");
			String per1 = persons[0];
			String per2 = persons[1];

			if (per1.equals("ChongChong")) {
				set.add(per2);
				flag = true;
			} else if (per2.equals("ChongChong")) {
				set.add(per1);
				flag = true;
			}

			if (flag) {
				try {
					for (String dancing : set) {
						if (dancing.equals(per1)) {
							set.add(per2);
						}
					}
					for (String dancing : set) {
						if (dancing.equals(per2)) {
							set.add(per1);
						}
					}
				} catch (Exception e) {
				}
			}
		}

		return set;
	}

	public void printOut(Set<String> dancingPeople) {
		System.out.println(dancingPeople.size());
	}

}