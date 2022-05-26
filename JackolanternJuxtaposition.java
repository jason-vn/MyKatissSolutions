import java.util.Scanner;

public class JackolanternJuxtaposition {
    public static void main(String[] args) {
        int eyes = 0;
        int noses = 0;
        int mouths = 0;

        // Parse string input into int array
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        eyes = Integer.parseInt(arr[0]);
        noses = Integer.parseInt(arr[1]);
        mouths = Integer.parseInt(arr[2]);

        // Calculate number of different possible designs
        System.out.println(eyes * noses * mouths);
    }
}
