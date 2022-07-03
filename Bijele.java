import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bijele {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strArr = br.readLine().split(" ");

		int kings = Integer.parseInt(strArr[0]);
		int queens = Integer.parseInt(strArr[1]);
		int rooks = Integer.parseInt(strArr[2]);
		int bishops = Integer.parseInt(strArr[3]);
		int knights = Integer.parseInt(strArr[4]);
		int pawns = Integer.parseInt(strArr[5]);
		int kingsCounter = 0;
		int queensCounter = 0;
		int rooksCounter = 0;
		int bishopsCounter = 0;
		int knightsCounter = 0;
		int pawnsCounter = 0;

		while (kings != 1) {
			if (kings > 1) {
				kings--;
				kingsCounter--;
			} else {
				kings++;
				kingsCounter++;
			}
		}

		while (queens != 1) {
			if (queens > 1) {
				queens--;
				queensCounter--;
			} else {
				queens++;
				queensCounter++;
			}
		}

		while (rooks != 2) {
			if (rooks > 2) {
				rooks--;
				rooksCounter--;
			} else {
				rooks++;
				rooksCounter++;
			}
		}

		while (bishops != 2) {
			if (bishops > 2) {
				bishops--;
				bishopsCounter--;
			} else {
				bishops++;
				bishopsCounter++;
			}
		}

		while (knights != 2) {
			if (knights > 2) {
				knights--;
				knightsCounter--;
			} else {
				knights++;
				knightsCounter++;
			}
		}

		while (pawns != 8) {
			if (pawns > 8) {
				pawns--;
				pawnsCounter--;
			} else {
				pawns++;
				pawnsCounter++;
			}
		}

		System.out.println(kingsCounter + " " + queensCounter + " " + rooksCounter + " " + bishopsCounter + " "
				+ knightsCounter + " " + pawnsCounter);
		br.close();
	}

}
