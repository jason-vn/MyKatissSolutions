import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Jason Nguyen Created: 8/23/2022
 *
 */
public class HonourThyApaxianParent {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		String Y = input[0].toLowerCase();
		String P = input[1].toLowerCase();
		StringBuilder output = new StringBuilder();

		if (Y.charAt(Y.length() - 1) == 'e') { // First String ends with 'e'.
			output.append(Y + 'x' + P); // Add 'x' after first String then append second String.

		} else if (Y.charAt(Y.length() - 1) == 'a' || Y.charAt(Y.length() - 1) == 'i' || Y.charAt(Y.length() - 1) == 'o'
				|| Y.charAt(Y.length() - 1) == 'u') { // First String ends with vowel other than 'e'.
			String s = Y.substring(0, Y.length() - 1); // Make new String excluding last char of first String (vowel).
			output.append(s + "ex" + P); // Add "ex" after new String^ and append second String.

		} else if (Y.charAt(Y.length() - 2) == 'e' && Y.charAt(Y.length() - 1) == 'x') { // First String ends in "ex"
			output.append(Y + P); // Append first String then second String.
		} else {
			output.append(Y + "ex" + P);
		}

		System.out.println(output);
		br.close();
	}

}
