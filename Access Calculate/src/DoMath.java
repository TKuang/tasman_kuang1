/*Tasman Kuang
 * Steptember 6, 2017
 * The runner for calculate library. Use to test the methods in Calculate.
 */
public class DoMath {
	public static void main (String[] args) {
		System.out.println(Calculate.square(5));
		System.out.println(Calculate.cube(8));
		System.out.println(Calculate.average(5, 7));
		System.out.println(Calculate.average(24, 30, 67));
		System.out.println(Calculate.toDegrees(8));
		System.out.println(Calculate.toRadians(45));
		System.out.println(Calculate.discriminant(9, 6, 5));
		System.out.println(Calculate.toImproperFrac(3,1,2));
		System.out.println(Calculate.toMixedNum(7, 2));
		
		

}
}