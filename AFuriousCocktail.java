import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AFuriousCocktail {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// First input line
		int numOfPotions = sc.nextInt();
		int drinkTime = sc.nextInt();
		ArrayList<Integer> durations = new ArrayList<>();

		// Every next input line is a potion duration.
		for (int i = 0; i < numOfPotions; i++) {
			durations.add(sc.nextInt());
		}

		// Order from largest to smallest so comparison calculation in next for loop is easier.
		Collections.sort(durations);
		Collections.reverse(durations);

		// Check if each potion would still be in effect accounting for every potion's drinking time and individual duration.
		for (int i : durations) {
			
			// Print NO since one of the potion's effect ran out and System.exit to stop code
			if (i - (drinkTime * (durations.size() - (durations.indexOf(i) + 1))) <= 0) {
				System.out.println("NO");
				System.exit(0);
			}
		}
			
		// Print YES since all durations are greater than 0 still
		System.out.println("YES");

		sc.close();
	}

}