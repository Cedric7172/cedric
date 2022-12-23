package fourprogramprj;

import java.util.Scanner;

public class BigPrograms {
	public float grossSalary(float basic) {
		float hra = 0.00F;
		float da = 0.00F;
		float totalsalary = 0.00F;
		if (basic < 1500) {
			hra = 0.10F * basic;
			da = 0.90F * basic;
		} else if (basic >= 1500) {
			hra = 0.10F * basic;
			da = 0.90F * basic;
		}
		totalsalary = basic + da + hra;
		System.out.println("your hra is " + hra + "\n da is " + da);
		return totalsalary;
	}

	public static void main(String[] args) {
		System.out.println("enter the basic salary: ");
		Scanner scanner = new Scanner(System.in);
		float basicsalary = scanner.nextFloat();
		BigPrograms bigprogram = new BigPrograms();
		float result1 = bigprogram.grossSalary(basicsalary);
		System.out.println("your gross salary is " + result1);

		scanner.close();
	}

}
