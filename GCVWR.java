import java.util.Scanner;

public class GCVWR {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Put input into space-delimited string array
        String[] s1 = sc.nextLine().split(" ");
        // Assign variables accordingly
        int g = Integer.parseInt(s1[0]); // GCVWR in lbs
        int t = Integer.parseInt(s1[1]); // Weight of truck in lbs
        int n = Integer.parseInt(s1[2]); // Number of items to bring camping
        int itemWeight = 0;

        // Split line into new space-delimited string array
        String[] s = sc.nextLine().split(" ");
        int[] items = new int[n];
        
        // Parse items input into int array
        for (int i = 0; i < items.length; i++) {
            items[i] = Integer.parseInt(s[i]);
            itemWeight += items[i];    // Append parsed int to total weight tracker
        }

        // 90% * [GCVWR (max total weight can haul including truck weight) - weight of truck]
        // Subtract by total item weight tracker
        // Print max possible weight trailer that can be pulled subject to restrictions
        int output = (int) (((g - t) * 0.9) - itemWeight);
        System.out.println(output);

        sc.close();
    }

}
