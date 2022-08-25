import java.util.Scanner;

public class DiceCup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a;
        int b;

        // Make a > b
        if (n >= m) {
            a = n;
            b = m;
        } else {
            a = m;
            b = n;
        }

        // Print all numbers starting at smallest number (b) until largest number + 1 (a + 1)
        int temp = b;
        for (int i = temp; i < (a + 1); i++) {
            temp++;
            System.out.println(temp);
        }

        sc.close();
    }
}
