import java.util.Arrays;
import java.util.Scanner;

public class ABC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];

		// User Input
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		// Sort user input
		Arrays.sort(arr);

		String s = sc.next();
		char[] chArr = new char[s.length()];
		// Putting string into array of letters
		for (int i = 0; i < s.length(); i++) {
			chArr[i] = s.charAt(i);
		}

		// Output to match specified order
		for (int i = 0; i < chArr.length; i++) {
			if (chArr[i] == 'A') {
				System.out.print(arr[0] + " ");
			} else if (chArr[i] == 'B') {
				System.out.print(arr[1] + " ");
			} else if (chArr[i] == 'C') {
				System.out.print(arr[2] + " ");
			}
			sc.close();
		}
	}
}