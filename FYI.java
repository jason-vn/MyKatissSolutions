import java.util.Scanner;

public class FYI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Separate input into string array
        String[] strArr = sc.next().split("");
        int[] arr = new int[strArr.length];

        // Parse input into int array
        for (int i = 0; i < strArr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }
        
        // If first 3 indexes are '5' -> Print 1
        if(arr[0] == 5 && arr[1] == 5 && arr[2] == 5) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
        
        sc.close();
    }

}
