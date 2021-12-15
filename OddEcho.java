import java.util.Scanner;

public class OddEcho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        String[] inputArray = new String[Integer.parseInt(num)];

        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = sc.nextLine();
        }

        System.out.println();
        for (int i = 0; i < inputArray.length; i++) {
            if ((i + 1) % 2 == 1) {
                System.out.println(inputArray[i]);
            }
        }
        sc.close();
    }
}