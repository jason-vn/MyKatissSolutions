import java.util.ArrayList;
import java.util.Scanner;

public class SpeedLimit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int set = Integer.parseInt(sc.nextLine());

        ArrayList<Integer> distances = new ArrayList<>();

        while (set != -1) {
            int sum = 0;
            int speed = 0;
            int hours = 0;

            for (int i = 0; i < set; i++) {
                String[] setArr = sc.nextLine().split(" ");
                speed = Integer.parseInt(setArr[0]);
                sum += speed * (Integer.parseInt(setArr[1]) - hours);
                hours = Integer.parseInt(setArr[1]);
            }
            distances.add(sum);
            set = Integer.parseInt(sc.nextLine());
        }

        // Output
        for (Integer sum : distances) {
            System.out.println(sum + " miles");
        }
        sc.close();
    }
}
