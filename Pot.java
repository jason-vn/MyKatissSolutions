import java.util.Scanner;

public class Pot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int addends = sc.nextInt();
		String[] strArr = null;
		int base = 0;
		int power = 0;
		int total = 0;
		int count = 0;

		while (count != addends) {
			// Separate number into array of digits
			String s = sc.next();
			strArr = s.split("");
			// New array with length of # of digits
			int[] arr = new int[strArr.length];
			// Load string array of digits into int array
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(strArr[i]);
			}

			// Exclude last character of input to get base number
			String baseStr = s.substring(0, s.length() - 1);
			base = Integer.parseInt(baseStr);

			// Last num of array is power raised to
			power = arr[arr.length - 1];

			// Append base^power to running total
			int output = (int) Math.pow(base, power);
			total += output;

			// Increment counter for tracking input lines to break out of loop
			count++;
		}

		System.out.println(total);
		sc.close();
	}
}
