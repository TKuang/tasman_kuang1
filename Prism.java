/* Write this abstract class called Prism.  It has one private field (height) and a constructor.  
 * It contains the methods calcAreaOfBase, calcPerimeter, calcVolume, and calcSA.
 * None of these methods require parameters.   
 * A couple are abstract - can you tell which ones and why?
 * 
 * Math note:
 * The volume of any prism can be found by multiplying the area of the base by the height.
 * The surface area of any prism can be found by multiplying the perimeter of the base by the height
 *   and then adding on the areas of the 2 bases.
 */


public abstract class Prism  
{
	private double height;
	
	public Prism(double height) {
		this.height = height;
	}
	
	public abstract double calcAreaOfBase();

	public abstract double calcPerimeter(); 
	
	public double calcVolume() {
		return calcAreaOfBase() * height;
	}
		
	public double calcSA() {
		return calcPerimeter() * height + 2 * calcAreaOfBase();
	}
	public double round2 (double num){
		//for negative number
		if (num < 0){
			num *= -1;
			//converts number to positive if initially negative
			if (num * 1000 % 10 < 5){
				num = (num * 1000 - num * 1000 % 10)/1000;
			}
			else {
				num = (10 - num * 1000 % 10 + num * 1000)/1000;
			}
			num *= -1;
			//converts number back into negative as initially
			return num;
		}
		//for positive number
		else {
			if (num * 1000 % 10 < 5){
				return (num * 1000 - num * 1000 % 10)/1000;
			}
			else {
				return (10 - num * 1000 % 10 + num * 1000)/1000;
			}
		}
	}
}
