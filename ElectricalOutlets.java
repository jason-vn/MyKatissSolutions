import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ElectricalOutlets {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numOfCases = Integer.parseInt(br.readLine());
        String line;
        int counter = 0;
        ArrayList<Integer> list = new ArrayList<>();

        // Allow as much input as numOfCases
        while (counter != numOfCases) {
            int total = 0;
            // Read line.
            line = br.readLine();
            // Load line in space-delimited String array.
            String[] strArr = line.split(" ");
            // Create new int array for strip outlet amounts
            int[] stripOutletsArr = new int[strArr.length - 1];

            // Load stripOutletsArr with input starting after 1st number (# of strips)
            for (int i = 0; i < stripOutletsArr.length; i++) {
                stripOutletsArr[i] = Integer.parseInt(strArr[i + 1]);
                // Add parsed int to total.
                total += stripOutletsArr[i];
            }
            // Subtract (amount of strips - 1) since outlets are daisy-chained.
            total = total - (Integer.parseInt(strArr[0]) - 1);
            list.add(total);
            counter++;
        }

        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
