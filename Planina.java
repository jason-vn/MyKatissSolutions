import java.util.Scanner;

public class Planina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfIterations = sc.nextInt();
        int points = 0;
        // Starting with 1 square (0 iterations)
        // Number of squares formed = 4^iterations
        int squares = (int) Math.pow(4, numOfIterations);

        // Number of points = (sqrt[squares] + 1)^2
        points = (int) Math.pow((Math.sqrt(squares) + 1), 2);
        System.out.println(points);
    }
}
