import java.util.Scanner;

public class JumboJavelin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfRods = Integer.parseInt(sc.next());
        int total = 0;
        
        // Get total sum of all rod lengths
        for(int i = 0; i < numOfRods; i++) {
            total += Integer.parseInt(sc.next());
        }
        
        // Subtract 1cm for each rod fused to get actual rod length
        System.out.println(total - (numOfRods - 1));
    }
}
