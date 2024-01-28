import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int totalCount = Integer.parseInt(br.readLine());

        String numbers = br.readLine();
        String[] number = numbers.split(" ");

        int[] divisors = new int[totalCount];
        for (int i = 0; i < totalCount; i++) {
            divisors[i] = Integer.parseInt(number[i]);
        }

        Arrays.sort(divisors); 

        long N = (long) divisors[0] * divisors[totalCount - 1];

        System.out.println(N);
    }
}