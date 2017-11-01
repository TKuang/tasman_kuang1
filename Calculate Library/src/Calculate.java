/*Tasman Kuang
 * September 6, 2017
 * Self-written math library...contains series of methods to solve basic math functions
 */
public class Calculate {
	
	//returns square of specific value
	public static int square (int num) {
		//integer is multiplied by itself once, then square is returned
		int square = num*num;
		return square;
	}
	//returns cube of specific value
	public static int cube (int num) {
		//integer is multipled by itself twice, then cube is returned
		int cube = num*num*num;
		return cube;
	}
	//returns average of two integers
	public static double average (double num1, double num2) {
		//two numbers are added together, divided by the amount of numbers, then the average is returned
		double average = (num1+num2)/2;
		return average;
	}
	//returns average of three integers
	public static double average (double num1, double num2, double num3) {
		//three numbers are added together, divided by the amount of numbers, then the average is returned
		double average = (num1+num2+num3)/3;
		return average;
	}
	//returns angle measure in radians in degrees
	public static double toDegrees (double num) {
		//angle measure of radians is multiplied by the ratio of 180 degrees over pi and converted into a degree measurement which is returned
		double toDegrees= num*(180/3.14159);
		return toDegrees;
	}
	//returns angle measure in degrees in radians
	public static double toRadians (double num) {
		//degree measurement is multiplied by ratio of pi over 180 degrees and converted into angle measurement in radians
		double toRadians = num*(3.14159/180);
		return toRadians;	
	}
	//returns value of discriminant given  coefficients of quadratic equation
	public static int discriminant (int a, int b, int c) {
		//three coefficients from standard form equation are plugged into the discriminant b^2 * 4ac, result is returned
		int discriminant = b*b-(4*a*c);
		return discriminant;
	}
	//returns improper fractions given mixed number
	public static String toImproperFrac (int whole, int nume, int denom) {
		// whole number is multiplied by denominator, then added to numerator of mixed fraction to find the numerator of improper fraction
		int numerator = whole * denom + nume;
		String ImproperFrac = numerator + "/" + denom;
		//initiated string prints out numerator of new improper fraction, then "/" and old denominator because denominator of mixed and improper fractions are same
		return ImproperFrac;	
	}
	//returns mixed number given improper fraction
	public static String toMixedNum (int num, int denom) {
		// whole number of mixed fraction found by how many times numerator goes in denominator (AKA by dividing them)
		int whole = num/denom;
		int nume = num - whole * denom;
		//whole number is equivalent to the numerator value of itself times denominator, so leftover numerator in mixed fraction can be found by subtracting producting of whole # and denominator
		String toMixedNum = whole + "_" + nume + "/" + denom;
		//initiated string prints out whole number followed by numerator, /, and denominator, appearing as a mixed fraction
		return toMixedNum;
	}
	//returns binomial multiplication in form of quadratic equation
	 public static String foil(int a, int b, int c, int d, String x){
	    String equation = new String(a*c + x + "^2 " + "+ " + (a*d + b*c) + x +" + " + b*d);
		// equation form of (num1*a + num2)(num3*a + num4) simplifies/foils to (num*a^2 + num2*num3*a + num2*num4) when fully distributed
		return equation;
	}
	//determines divisibility of an integer by another
	public static Boolean isDivisibleBy (int num1, int num2) {
		Boolean IsDivisibleBy;
		if (num1 % num2 == 0){
			IsDivisibleBy = true;
			//num1 is divisible by num2 if the remainder of their division is 0
		}
		else {
			IsDivisibleBy = false;
			//if there is a remainder, then they are not divisible
		}
		if (num2 == 0){
			throw new ArithmeticException("A result of a number divided by 0 is undefined");
		}
		return IsDivisibleBy;
	}
	//returns absolute value of specific number
	public static double absValue (double num){
		if (num <= 0){
			return num * -1;
			//multiplying a negative by negative returns a positive
		}
		else {
			return num;
		}
	}
	//returns the largest of two value
	public static double max (double num1, double num2){
		if (num1 >= num2){
			return num1;
			//return num1 if that double is greater than num2 as it would be the max
		}
		else {
			return num2;
		}
	}
	//returns the largest of three numbers
	public static double max (double num1, double num2, double num3){
	    if (num1 >= num2 && num1 >= num3){
		    return num1;      
		    //if num1 is greater than both num2 and num3, it would be the max and returned
	       }
	       else if(num2 >= num1 && num2 >= num3){
		    return num2;
		    //if num2 is greater than both num1 and num3, it would be the max and returned
	       }
	       else {
	            return num3;
		    //if num2 and num1 are not the max or equal to the others, than num3 would be the max and returned
	       }
	   }
	//returns minimum of two numbers
	public static int min (int num1, int num2){
	       if (num1 <= num2){
	           return num1;
		   //if num1 is less than num2, it would be the minimum and returned
	       }
	       else{
	           return num2;
	       }
	   }
	//rounds given number to 2 decimal places
	public static double round2 (double num){
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
	//returns result of a value raised to a positive integer power
	public static double exponent (double num1, int num2){
		double multiply = num1;
		for (int i = num2; i > 0; i--){
			//loops number of times of num2
			multiply *= num1;
			//num1 is multiplied by itself for num2 cycles
		}
		if (num2 < 0){
			throw new ArithmeticException("Program will only compute for positive exponents");
		}
		return multiply;
	}
	//returns factorial of specific value
	public static int factorial (int num){
		int num1;
		num1 = num;
		int answer = num1 * num;
		if (num >= 0){
			for (int i = num; i > 0; i--){
				num1--;
				answer = num * num1;
			}
			//the number enterred is multiplied by itself repeatedly, with the multiple increasing by incrememnts of 1 until it reaches 0
			return answer;
			}
		else {	
			throw new ArithmeticException("Facorial of negative number cannot be found");
		}

	}
	//determines whether or not a number is prime
	public static boolean isPrime (int num){
		boolean check;
		boolean isPrime = true;
		if(num > 1){
			for(int i = num - 1; i > 1; i --){
				check = Calculate.isDivisibleBy(num, i);
				//checks to see if any num is divisible by any number less than it besides 1
				if (check == true){
					isPrime = false;
					//if num is divisible by a smaller number other than 1, then it is not prime
				}
				else {
					isPrime = true;
				}
			}
		}
		else if (num == 1){
			isPrime = true;
			//number is prime if it's one
		}
		else {
			isPrime = false;
			//number is not prime if it's 0 or less
		}
		return isPrime;
		
	}
	//returns greatest common factor of two numbers
	public static int gcf (int num1, int num2){
		while (num2 != 0){
			if(isDivisibleBy(num1, num2)){
				num1 = num2;
				//returns integer if it is divisible by the other
			}
			else {
				int num3 = num1;
				num1 = num2;
				num2 = num3 % num2;
			}
		}
		return (int) absValue (num1);
	}
	//returns square root of a specific number
	public static double sqrt(double num){
		double estimate;
		double root;
		if (num == 0){
			root = 0;
			//square root of 0 is 0
		}
		else if (num > 0){
			root = num/2;
			do {
				estimate = root;
				root = (estimate + (num/estimate))/2;
				//newton's method
			}
			while ((estimate - root) != 0);
		}
		else {
			root = num;
		}
		if (num < 0){
			throw new IllegalArgumentException ("Square root of negative number is an imaginary number");
		}
		return round2(root);
	}
	//returns the roots of a quadratic equation by using the quadratic formula
	public static String quadForm (int num1, int num2, int num3){
		double quad = discriminant(num1, num2,num3);
		//plugs three integers into discriminant equation
		if (quad < 0){
			String result = "no real roots";
			//sqare root of negative integer is undefined, so no roots
			return result;
		} 
		else if (quad == 0){
			double answer = round2(-num2/(2*num1));
			String result = answer + "";
			//discriminant of 0 will result in one root of -b/2a
			return result;
		} 
		else {
			double answer1 = round2((-num2 + quad)/(2 * num1));
			double answer2 = round2((-num2 - quad)/(2 * num1));
			//rounds roots to two decimal places
			if (max(answer1, answer2) == answer1){
				String result = answer2 + " and " + answer1;
				return result;
			}
			else {
				String result = answer1 + " and " + answer2;
				return result;
			}
		}	
	}
}
