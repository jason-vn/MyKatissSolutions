import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Parking {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(br.readLine());
        int[] output = new int[cases];

        for (int i = 0; i < cases; i++) {
            // Input number of stores.
            int numStores = Integer.parseInt(br.readLine());
            int sum = 0;
            // Space-delimit store numbers into String array.
            String[] s = br.readLine().split(" ");
            int[] stores = new int[numStores];

            // Parse into integers.
            for (int j = 0; j < s.length; j++) {
                stores[j] = Integer.parseInt(s[j]);
            }
            
            // Sort store positions.
            Arrays.sort(stores);
            
            // Subtract next store position by previous store position to get total distance sum.
            for (int a = 0; a < stores.length - 1; a++) {
                sum += stores[a + 1] - stores[a];
            }

            // Multiply total distance sum by 2 since it is a two way trip.
            output[i] = sum * 2;
        }

        // Output
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }

        br.close();
    }

}
