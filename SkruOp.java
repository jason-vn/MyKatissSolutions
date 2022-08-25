import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SkruOp {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Get input for how many requests are made
        int requests = Integer.parseInt(br.readLine());
        // Starting at 7 volume
        int volume = 7;

        // Loop for number of requests given
        for (int i = 0; i < requests; i++) {
            // Read next line
            String line = br.readLine();
            // If line has "op" AND volume is not at max volume then add 1
            if (line.contains("op") && (volume >= 0 && volume < 10)) {
                volume++;
            } // If line has "ned" AND volume is not at minimum then subtract 1
            else if (line.contains("ned") && (volume > 0 && volume <= 10)) {
                volume--;
            }
        }

        System.out.println(volume);

        br.close();
    }
}
