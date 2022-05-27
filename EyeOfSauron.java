import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class EyeOfSauron {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Read input
        String s = br.readLine();
        // Place characters into separated array of Strings
        String[] arr = s.split("");
      
        ArrayList<String> a = new ArrayList<>(), b = new ArrayList<>();
        int num = 0;

        // Place left |'s into separate arrays
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].equals("(")) {  // Add |'s to array until "(" is reached
                a.add(arr[i]);
            } else {                    // Skip over () and break out of loop
                num = i + 2;
                break;
            }
        }

        // Place right |'s into separate array continuing after previous break out
        for (int i = num; i < arr.length; i++) {
            b.add(arr[i]);
        }

        // Compare |'s on both sides
        if (a.size() == b.size()) {
            System.out.println("correct");
        } else {
            System.out.println("fix");
        }

        br.close();
    }

}
