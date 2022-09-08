import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Jason Nguyen Created: 9/8/2022
 *
 */
public class FiftyShadesOfPink {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(br.readLine());
		int counter = 0;

		// Take input of specified number of Strings.
		for (int i = 0; i < cases; i++) {
			// Convert String to lowercase to deal with variable casing.
			String s = br.readLine().toLowerCase();

			// Add to running count if String contains "pink" or "rose."
			if (s.contains("pink") || s.contains("rose")) {
				counter++;
			}
		}

		// Print counter or excuse if counter = 0.
		if (counter > 0) {
			System.out.println(counter);
		} else {
			System.out.println("I must watch Star Wars with my daughter");
		}

		br.close();
	}

}
