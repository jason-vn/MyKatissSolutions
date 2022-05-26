import java.io.*;
import java.util.Scanner;

public class TwoStones {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        
        if(n % 2 == 0) {                    // If number is even, print Bob
            System.out.println("Bob");
        } else if(n % 2 != 0) {             // If number is odd, print Alice
            System.out.println("Alice");
        }
    }
}
