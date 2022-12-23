package fourprogramprj;

import java.util.Scanner;

public class AsciiPro {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a character: ");
		char character = scanner.next().charAt(0);
		int cecil = (int) character;
		// typecasting changing one datatype into another
		if (cecil >= 65 && cecil <= 90) {
			System.out.println("upper case");
		} else if (cecil >= 97 && cecil <= 122) {
			System.out.println("lower case");
		} else if (cecil >= 48 && cecil <= 57) {
			System.out.println("numerics");
		} else if (cecil >= 0 && cecil <= 47 || cecil >= 58 && cecil <= 64 || cecil >= 91 && cecil <= 96
				|| cecil >= 123 && cecil <= 127)

			System.out.println("special characters");

		scanner.close();
	}

}
