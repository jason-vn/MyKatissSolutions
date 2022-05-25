import java.util.Scanner;

public class carrots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");

        // Each line is a contestant
        int lines = Integer.parseInt(str[0]);
        // Total number of huffle-puff problems solved
        int problems = Integer.parseInt(str[1]);
        // Input counter
        int count = 0;
        String[] arr = new String[lines];

        // Must input line for each contestant
        while (count != lines) {
            for (int i = 0; i < lines; i++) {
                arr[i] = sc.nextLine();
                count++;
            }
        }

        // Output number of carrots given out (carrot per solution)
        System.out.println(problems);
        sc.close();
    }
}
