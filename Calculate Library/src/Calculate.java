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

}
