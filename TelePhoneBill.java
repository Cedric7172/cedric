package fourprogramprj;

import java.util.Scanner;

public class TelePhoneBill {

	public static void main(String[] args) {
		System.out.println("enter the number of calls: ");
		Scanner sc = new Scanner(System.in);
		int calls = sc.nextInt();
		float total = 0.00F;
		if (calls <= 100) {
			total = 200;
		} else if (calls >= 100 || calls <= 150) {
			calls = calls - 100;
			total = 200 + 0.60F * calls;
		} else if (calls >= 150 || calls <= 200) {
			calls = calls - 150;
			total = 200 + (0.50F * 50) + (0.60F * calls);
		} else if (calls > 200) {
			calls = calls - 200;
			total = 200 + (0.50F * 50) + (0.60F * 50) + (0.40F * calls);
		}
		System.out.println("monthly telephone bill is " + total);

		sc.close();
	}

}
