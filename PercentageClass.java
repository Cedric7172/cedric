package fourprogramprj;

import java.util.Scanner;

public class PercentageClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter percentage: ");
		float per = sc.nextFloat();
		if (per >= 60) {
			System.out.println("first division");
		} else if (per >= 50 && per <= 59) {
			System.out.println("second division");
		} else if (per >= 40 && per <= 49) {
			System.out.println("third division");
		} else {
			System.out.println("fail");
		}

		sc.close();
	}

}
