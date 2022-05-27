import java.util.Scanner;

public class Grass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double price = sc.nextDouble();
        int numOfLawns = sc.nextInt();
        int count = 0;
        double total = 0;

        while (count != numOfLawns) {
            // Find area of each lawn
            double width = sc.nextDouble();
            double length = sc.nextDouble();
            double area = width * length;
            // Multiply area by price per one square meter
            double calc = area * price;
            // Append to total sum
            total += calc;

            count++;
        }
        System.out.println(total);
    }
}
