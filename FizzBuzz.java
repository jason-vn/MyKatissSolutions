import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FizzBuzz {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// Read input x, y, n values as String array.
		String[] s = br.readLine().split(" ");
		int[] input = new int[s.length];

		// Parse input into integers.
		for (int i = 0; i < s.length; i++) {
			input[i] = Integer.parseInt(s[i]);
		}

		// Set 1st, 2nd, and 3rd input values as x, y, n, respectively.
		int x = input[0];
		int y = input[1];
		int n = input[2];

		// Loop through for length of n
		for (int i = 0; i < n; i++) {

      // Instead of starting at i = 1, we add 1 to each index to avoid error
			if ((i + 1) % x == 0 && (i + 1) % y == 0) {   // If current number is divisible by x AND y -> Print FizzBuzz
				System.out.println("FizzBuzz");
			} else if ((i + 1) % x == 0) {                // If current number is only divisible by x -> Print Fizz
				System.out.println("Fizz");
			} else if ((i + 1) % y == 0) {                // If current number is only divisible by y -> Print Buzz
				System.out.println("Buzz");
			} else {                                      // If current number is not divisible by x or y -> Print current number
				System.out.println(i + 1);
			}

		}

		br.close();
	}

}
