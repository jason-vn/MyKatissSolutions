import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Jason Nguyen Created: 8/11/2022
 *
 */
public class SumKindOfProblem {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sets = Integer.parseInt(br.readLine());
		String[] output = new String[sets];

		for (int i = 0; i < sets; i++) {
			String[] str = br.readLine().split(" ");
			int k = Integer.parseInt(str[0]);
			int n = Integer.parseInt(str[1]);

			// Get sum of first n positive integers.
			int sum = 0, oddSum = 0, evenSum = 0, sumIncr = 0, evenIncr = 0, oddIncr = 0;
			for (int j = 0; j <= n * 2; j++) {
				if (sumIncr <= n) {
					sum += j;
					sumIncr++;
				}
				if (j % 2 == 0) {
					if (evenIncr <= n) {
						evenSum += j;
						evenIncr++;
					}
				} else {
					if (oddIncr <= n) {
						oddSum += j;
						oddIncr++;
					}
				}
			}

			String s = "" + k + " " + sum + " " + oddSum + " " + evenSum;
			output[i] = s;
		}

		for (String s : output) {
			System.out.println(s);
		}

		br.close();
	}
}
