import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map.Entry;

public class Zamka {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // L <= N <= D
        int l = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());
        int x = Integer.parseInt(br.readLine());

        // N = minimal int where L <= N <= D and sum of digits = X
        int n = 0;

        // M = maximal int where L <= N <= D and sum of digits = X
        int m = 0;

        // Put all digit sums into a map
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = l; i <= d; i++) {
            int sum = 0, num = i;
            while (num > 0) {
                sum += num % 10;
                num = num / 10;
            }
            map.put(i, sum);
        }

        // Put all digit sums that equal x into a new map
        HashMap<Integer, Integer> targetMap = new HashMap<>();
        for (Entry<Integer, Integer> val : map.entrySet())
            if (val.getValue() == x) {
                targetMap.put(val.getKey(), val.getValue());
            }

        // Compare all entries in targetMap to find smallest and largest key ints
        Entry<Integer, Integer> min = null;
        Entry<Integer, Integer> max = null;
        for (Entry<Integer, Integer> entry : targetMap.entrySet()) {
            if (min == null || entry.getKey().compareTo(min.getKey()) < 0) {
                min = entry;
            }
            if (max == null || entry.getKey().compareTo(max.getKey()) > 0) {
                max = entry;
            }
        }

        n = min.getKey();
        m = max.getKey();

        System.out.println(n);
        System.out.println(m);

        br.close();
    }

}
