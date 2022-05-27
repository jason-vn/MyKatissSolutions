import java.util.Scanner;

public class Faktor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int articles = sc.nextInt();
		int impactFactor = sc.nextInt();
		int scientists = 0;

		scientists = articles * (impactFactor - 1) + 1;
		System.out.println(scientists);

		sc.close();
	}
}
