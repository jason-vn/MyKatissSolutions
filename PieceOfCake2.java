import java.util.Scanner;

public class PieceOfCake2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Length of sides of the square cake
        int h = sc.nextInt(); // Distance of the horizontal cut from the top edge
        int v = sc.nextInt(); // Distance of the vertical cut from the left edge
        int thickness = 4;

        // Volume = L * W * H
        // L = larger number of (n - h) and h
        // W = larger number of (n - v) and v
        // H = Thickness given
        System.out.println(Math.max(n - h, h) * Math.max(n - v, v) * thickness);
        sc.close();
    }

}
