import java.util.Scanner;

public class Autori {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Hyphen-delimit input string
		String[] s = sc.next().split("-");
		// Print every first character
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i].charAt(0));
		}
		
		sc.close();

	}

}
