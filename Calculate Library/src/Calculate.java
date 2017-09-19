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
	public static double average (int num1, int num2) {
		int average = (num1+num2)/2;
		return average;
	}
	public static double average (int num1, int num2, int num3) {
		int average = (num1+num2+num3)/3;
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
	public static String toImproperFrac (int whole, int num, int den) {
		int  nume = whole * den + num;
		String ImproperFrac = new String(nume + "/" + den);
		return ImproperFrac;	
	}
	public static String toMixedNum (int num, int denom) {
		int whole = num/denom;
		int nume = num - whole * denom;
		String toMixedNum = new String(whole + "_" + nume + "/" + denom);
		return toMixedNum;
	}
	public static String foil (int num1, int num2, int num3, int num4, int a) {
		String equation = new String((num1*a + "^2" + num2 *(num3*a + num4)));
		return equation;
		
	}
	public static Boolean IsDivisibleBy (int num1, int num2) {
		if (num1 % num2 == 0){
			Boolean IsDivisible = true;
		}
		else {
			Boolean IsDivisible = false
		}
		return IsDivisible;
	}
	public static double absValue (double num){
		if (num <= 0){
			return num * -1;
		}
		else {
			return num;
		}
	
	}
	public static double max (double num1, double num2){
		if (num1 >= num2){
			return num1;
		}
		else {
			return num2;
		}
	}
	public static double max (double num1, double num2, double num3){
	    if (num1 >= num2 && num1 >= num3){
		    return num1;      
	       }
	       else if(num2 >= num1 && num2 >= num3){
		    return num2;
	       }
	       else {
	            return num3;
	       }
	   }
	public static int min (int num1, int num2){
	       if (num1 <= num2){
	           return num1;
	       }
	       else{
	           return num2;
	       }
	   }
	public static double round2 (double num){
	    if (num * 1000 % 10 < 5){
	        return (num * 1000 - num * 1000 % 10)/1000;
	       }
	    else {
	        return (10 - num * 1000 % 10 + num * 1000) / 1000;
	       }
	   }
	public static double exponent (double num1, int num2){
		for (int i = 1, i <= num2, i++){
			num1 * num1;
		}
		return num1;
	}
	public static int factorial (num){
		int num1;
		num1 = num;
		for (int i = num, i > 0, i--){
			num--;
			int final = num1 * num;
		}
		return final;
	}
	public static Boolean prime (int num){
		int temp;
		boolean isPrime=true;
		for(int i=2;i<=num/2;i++){
        	  	 temp=num%i;
		  	 if(temp==0)
	   	{
	   	   		IsPrime=false;
	   	   		break;
	   	}
		return IsPrime;
	}
	public static int gcf (int num1, int num2){
		if (num1 > num2){
			int gcd = num1 % num2;
		}
		else if (num1 = num2){
			int gcd = 
	
		
	
	
	
	   
	   
	   
	         
