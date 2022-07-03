import java.io.IOException;
import java.util.Scanner;

// Needed to use BufferedReader for s.split to move into String array?

// https://open.kattis.com/problems/qaly

/* Sample Input 1 	Sample Output 1
    5               41.470
    1.0 12.0
    0.7 5.2
    0.9 10.7
    0.5 20.4
    0.2 30.0
*/

public class QualityAdjustedLifeYear {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		// Specify number of periods of constant quality of life during the person’s
		// lifetime (lines of input)
		int lines = Integer.parseInt(sc.next());
		float total = 0;

		for (int i = 0; i < lines; i++) {
			// Quality of life in period
			float num1 = Float.parseFloat(sc.next());
			// Number of years in period
			float num2 = Float.parseFloat(sc.next());
			// Multiply values and add to running total
			total += num1 * num2;
		}

		// Output QALY accumulated
		System.out.println(total);
		sc.close();
	}
}
