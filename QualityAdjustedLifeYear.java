import java.io.IOException;
import java.util.Scanner;

public class QualityAdjustedLifeYear {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        // Specify number of periods of constant quality of life during the person’s lifetime (lines of input)
        int lines = Integer.parseInt(sc.next());
        float total = 0;

        // 
        for (int i = 0; i < lines; i++) {
            // Quality of life in period
            float num1 = Float.parseFloat(sc.next());
            // Number of years in period
            float num2 = Float.parseFloat(sc.next());
            // Multiply values and add to running total
            total += num1 * num2;
        }
      
        // Output QALY accumulated
        System.out.println(total);

    }
}
