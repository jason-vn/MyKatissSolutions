import java.util.ArrayList;
import java.util.Scanner;

public class Sibice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfMatches = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < numOfMatches; i++) {
            // Get length of match
            int l = sc.nextInt();
            // Match fits if it's less than or equal to sqrt of w^2 + h^2
            if (l <= Math.sqrt(Math.pow(w, 2) + Math.pow(h, 2))) {
                list.add("DA");
            } else {
                list.add("NE");
            }
        }

        for (String s : list) {
            System.out.println(s);
        }
        sc.close();
    }
}
