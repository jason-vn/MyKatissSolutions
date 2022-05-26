import java.util.Scanner;

public class Tarifa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int monthlyLimit = sc.nextInt();
        int months = sc.nextInt();
        int totalData = monthlyLimit * months;
        int counter = 0;
        int[] dataUse = new int[months];

        while (counter != months) {
            for (int i = 0; i < dataUse.length; i++) {
                dataUse[i] = sc.nextInt();
                counter++;
            }
        }

        int dataUsed = 0;
        for (int i = 0; i < dataUse.length; i++) {
            dataUsed += dataUse[i];
        }

        System.out.println((totalData - dataUsed) + monthlyLimit);
    }
}
