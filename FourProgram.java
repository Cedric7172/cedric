/**
 * 
 */
/**
 * @author welcome
 *
 */
package fourprogramprj;

import java.util.Scanner;

public class FourProgram {
	public static int absoluteValue(int number) {
		number = Math.abs(number);
		return number;

	}

	private float totalExpense(int a, int b) {
		float totalExpense = a * b;
		if (totalExpense > 5000) {
			float discount = totalExpense * 0.1F;
			totalExpense = (totalExpense - discount);
		}
		return totalExpense;

	}

	public String profitLoss(int cp, int sp) {
		String res = null;
		if (cp > sp) {
			res = "loss";
		} else if (sp > cp) {
			res = "profit";
		} else {
			res = "no profit or loss";
		}

		return res;

	}

	private static String youngAge(int a, int b, int c) {
		String out = null;
		if (a < c) {
			if (c < a) {
				out = "c";
			} else {
				out = "a";
			}
		} else {
			if (b < c) {
				out = "b";
			} else {
				out = "c";
			}

		}
		return out;
	}
	public static boolean triAngle(int a, int b, int c) {
		boolean isequal=false;
		int sum = a+b+c;
		if(sum==180)
		{
			isequal=true;
		}
			
		return isequal;
	}
	 private boolean leapYear(int year) {
		boolean isleapyear=false;
		if(year%400==0)
		{
			isleapyear=true;
		}else if(year%100==0)
		{
				isleapyear=false;
			}else if(year%4==0) {
				isleapyear=true;
			}
 return isleapyear; 
	}
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("enter number: ");
		int number = in.nextInt();
		int result1 = absoluteValue(number);
		System.out.println("the absoulte value is " + result1);

		System.out.println("enter a: ");
		int a = in.nextInt();
		System.out.println("enter b: ");
		int b = in.nextInt();
		FourProgram out = new FourProgram();
		float result2 = out.totalExpense(a, b);
		System.out.println("the total expense with discount is: " + result2);

		System.out.println("enter cp: ");
		int cp = in.nextInt();
		System.out.println("enter sp: ");
		int sp = in.nextInt();
		String result3 = out.profitLoss(cp, sp);
		System.out.println("incurred " + result3);

		System.out.println("enter q: ");
		int q = in.nextInt();
		System.out.println("enter w: ");
		int w = in.nextInt();
		System.out.println("enter e: ");
		int e = in.nextInt();
		String result4 = youngAge(q, w, e);
		System.out.println("youngest age is " +result4);
		
		
		
		System.out.println("enter a: ");
		int r = in.nextInt();
		System.out.println("enter b: ");
		int t = in.nextInt();
		System.out.println("enter c: ");
		int c = in.nextInt();
		boolean result5=triAngle(r,t,c);
		System.out.println("is the given sides form triangle?  "+result5);
		
		
		System.out.println("enter year: ");
		int y = in.nextInt();
		boolean result6=out.leapYear(y);
		System.out.println("is the given year is leap year? "+result6);
		in.close();

	}

}