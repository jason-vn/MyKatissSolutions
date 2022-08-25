import java.util.Scanner;

public class Stopwatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int timesPressed = sc.nextInt();
        int timesCounter = 0;
        // Stopwatch starts at 0 seconds.
        int display = 0;

        // Loop for how many times the button was pressed.
        while (timesCounter != timesPressed) {
            // If even amount of presses
            if (timesPressed % 2 == 0) {
                // Next inputted int is the current seconds on display
                int start = sc.nextInt();
                // Increase press count being tracked
                timesCounter++;
                // Next inputted int is the seconds shown on display after next press
                int stop = sc.nextInt();
                // Subtract currently displayed seconds by previous seconds shown
                display = display + (stop - start);
                // Increase press count being tracked
                timesCounter++;
            } else {
                // Odd number of presses then stopwatch is still running
                System.out.println("still running");
                System.exit(0);
            }
        }

        // Print time stopped at
        System.out.println(display);

        sc.close();
    }
}
