import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SimonSays2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(br.readLine());
		ArrayList<String> list = new ArrayList<>();

		// Loop for as many cases given
		for (int i = 0; i < cases; i++) {
			// Read line of input
			String line = br.readLine();
			// If "simon says" is in input and there is more text after add to list
			if (line.contains("simon says")) {
				if (line.length() != 10) {
					list.add(line.substring(11));
				} else {
					// Add null object to list so blank line will print for output
					list.add(null);
				}
			} else {
				// If input does not have "simon says"
				// Add null object to list so blank line will print for output
				list.add(null);
			}
		}

		// Print list
		for (String s : list) {
			if (s != null) {
				System.out.println(s);
			} else {
				System.out.println();
			}
		}

		br.close();
	}

}