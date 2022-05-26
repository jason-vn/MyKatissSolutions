import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HeartRate {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        int numOfCases = Integer.parseInt(br.readLine());
        int count = 0;
        int b;
        double p;
        double bpm;
        String[] strArr;
        String[] output = new String[numOfCases];

        while (count != numOfCases) {
            // Read input string line
            line = br.readLine();
            // Space delimit into string array
            strArr = line.split(" ");
            // 1st number is beats
            b = Integer.parseInt(strArr[0]);
            // 2nd number is seconds
            p = Float.parseFloat(strArr[1]);
            // Calculate general BPM for input
            bpm = BPM(b, p);
 
            // Insert calculation into array as a single string
            output[count] = minABPM(bpm, p) + " " + bpm + " " + maxABPM(bpm, p);

            count++;
        }

        // Print each array index
        for (String s : output) {
            System.out.println(s);
        }

        br.close();
    }

    static double BPM(int b, double p) {
        return (60 * b) / p;
    }

    static double minABPM(double bpm, double p) {
        return bpm - (60 / p);
    }

    static double maxABPM(double bpm, double p) {
        return bpm + (60 / p);
    }
}
