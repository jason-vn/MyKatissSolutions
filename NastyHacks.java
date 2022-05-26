import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class NastyHacks {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numOfCases = Integer.parseInt(br.readLine());
        int doNotAdverRev = 0;
        int doAdverRev = 0;
        int adCost = 0;
        String line;

        ArrayList<String> list = new ArrayList<>();
        String one = "advertise";
        String two = "do not advertise";
        String three = "does not matter";
        
        // Allow for specified number of test cases.
        for (int i = 0; i < numOfCases; i++) {
            // Read line of input.
            line = br.readLine();
          
            // Load space-delimited numbers into string array.
            String[] strArr = new String[3];
            for (int j = 0; j < strArr.length; j++) {
                strArr = line.split(" ");
            }
            // Transfer and parse string array to int array.
            int[] arr = new int[3];
            for (int x = 0; x < arr.length; x++) {
                arr[x] = Integer.parseInt(strArr[x]);
            }

            // Set numbers to corresponding variables.
            doNotAdverRev = arr[0];
            doAdverRev = arr[1];
            adCost = arr[2];

            // Calculation --> add desired output string to arraylist
            if (doAdverRev - doNotAdverRev > adCost) {
                list.add(one);
            } else if (doAdverRev - doNotAdverRev < adCost) {
                list.add(two);
            } else if (doAdverRev - doNotAdverRev == adCost) {
                list.add(three);
            }
        }

        // Output
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
