/*Tasman Kuang
 * Steptember 6, 2017
 * Self-written math library...contains series of methods to solve basic math functions
 */
public class Calculate {
	
	public static int square (int num) {
		int square = num*num;
		return square;
	}
	public static int cube (int num) {
		int cube = num*num*num;
		return cube;
	}
	public static double average (int num1, int num2, int num3) {
		int average = (num1*num2*num3)/3;
		return average;
				
	}
	public static double toDegrees (double num) {
		double toDegrees= num*(180/3.14159);
		return toDegrees;
	}
	public static double toRadians (double num) {
		double toRadians = num*(3.14159/180);
		return toRadians;	
	}
	public static int discriminant (int a, int b, int c) {
		int discriminant = b*b-(4*a*c);
		return discriminant;
	}
	public static int toImproperFrac (int num1, int num2, int num3) {
		int  toImproperFrac = (num1*num2+num3)/num3;
		return toImproperFrac;	
	}
}
