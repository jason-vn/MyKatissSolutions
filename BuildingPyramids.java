import java.util.Scanner;

public class BuildingPyramids {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int totalBlocks = sc.nextInt();
		int blocksCounter = 0;
		int row = 0;
		int incr = 1;

		if (totalBlocks < 1) {
			System.out.println("0");
			System.exit(0);
		}

		// Start count at top of pyramid and go tier by tier
		while (blocksCounter < totalBlocks) {
			blocksCounter += (int) Math.pow(incr + 2, 2);
			incr += 2;
			row++;
		}

		System.out.println(row);
		sc.close();

	}

}