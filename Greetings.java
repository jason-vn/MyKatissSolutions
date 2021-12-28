import java.util.ArrayList;
import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        ArrayList<Character> list = new ArrayList<>();

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'e') {
                list.add(s.charAt(i));
                list.add(s.charAt(i));
            } else {
                list.add(s.charAt(i));
            }
        }

        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }

    }
}