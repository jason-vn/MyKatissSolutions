import java.util.Scanner;

public class Filip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        String x = sc.next();
        String y = sc.next();
        // Split input string as two string arrays of characters
        String[] xArr = x.split("");
        String[] yArr = y.split("");
        String temp;

        // Swap first and last digits for both numbers
        temp = xArr[0];
        xArr[0] = xArr[2];
        xArr[2] = temp;

        temp = yArr[0];
        yArr[0] = yArr[2];
        yArr[2] = temp;

        x = "";
        y = "";
        // Put string arrays of characters into single whole strings
        for (int i = 0; i < xArr.length; i++) {
            x += xArr[i];
        }
        for (int i = 0; i < yArr.length; i++) {
            y += yArr[i];
        }
        
        // Parse strings into integers
        a = Integer.parseInt(x);
        b = Integer.parseInt(y);

        // Print larger number
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
