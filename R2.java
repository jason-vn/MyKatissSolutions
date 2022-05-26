import java.util.Scanner;

public class R2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Parse line of input into array of separate strings
        String str = sc.nextLine();
        String[] strArr = str.split(" ");

        // Parse input array into ints
        int r1 = Integer.parseInt(strArr[0]);
        int s = Integer.parseInt(strArr[1]);

        // S = (R1 + R2) / 2, so
        // R2 = 2(S) - R1
        int r2 = (2*(s))-r1;

        System.out.println(r2);

    }
}
