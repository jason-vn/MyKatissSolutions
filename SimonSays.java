import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SimonSays {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(br.readLine());
		int count = 0;
		ArrayList<String> list = new ArrayList<>();

		// Loop for as many cases given
		while (count != cases) {
			// Tokenize line by spaces to separate words into String array.
			String[] arr = br.readLine().split(" ");
			// Check if first and second word are Simon and says, respectively.
			if (arr[0].equalsIgnoreCase("Simon") && arr[1].equalsIgnoreCase("says")) {
				// Add all proceeding words to one String
				StringBuilder sb = new StringBuilder();
				for (int i = 2; i < arr.length; i++) {
					sb.append(arr[i] + " ");
				}
				// Add built String to list for output
				list.add(sb.toString());
			}

			// Increment until break out of loop
			count++;
		}

		// Output list Strings
		for (String s : list) {
			System.out.println(s);
		}

		br.close();
	}

}