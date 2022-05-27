import java.util.Scanner;

public class Greetings {
	// Input: heeeey
	// Output: heeeeeeeey (double amount of e's)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		StringBuilder out = new StringBuilder();

		// Building string by iterating through string characters
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'e') {	 // Insert character twice if 'e'
				out.append(s.charAt(i));
				out.append(s.charAt(i));
			} else {
				out.append(s.charAt(i));
			}
		}

		System.out.println(out);
		sc.close();

	}
}
