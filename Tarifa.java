import java.util.Scanner;

public class Tarifa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Monthly MB limit
        int monthlyLimit = sc.nextInt();
        // Number of months of data use to account for (lines of input)
        int months = sc.nextInt();
        // Maximum MB that can be used
        int totalData = monthlyLimit * months;
        int counter = 0;
        int[] dataUse = new int[months];

        // Insert monthly data use line inputs to dataUse array
        while (counter != months) {
            for (int i = 0; i < dataUse.length; i++) {
                dataUse[i] = sc.nextInt();
                counter++;
            }
        }

        // Get total sum of given data usage
        int dataUsed = 0;
        for (int i = 0; i < dataUse.length; i++) {
            dataUsed += dataUse[i];
        }

        // (Maximum MB allowed - MB used) + monthly limit = Remaining MB
        System.out.println((totalData - dataUsed) + monthlyLimit);
    }
}

