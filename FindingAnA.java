import java.util.Scanner;

public class FindingAnA {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Split given string into array of string characters
        String[] s = sc.next().split("");
        int spot = 0;
        
        // Loop through string array of characters
        for(int i = 0; i < s.length; i++) {
            if(s[i].equals("a")) {    // Break out of array when 'a' is found
                spot = i;
                break;
            }
        }
        
        // Print string starting at located 'a' index
        for(int i = spot; i < s.length; i++) {
            System.out.print(s[i]);
        }
        
        sc.close();
    }

}
