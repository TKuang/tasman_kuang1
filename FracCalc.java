import java.util.Arrays;
import java.util.Scanner;

public class FracCalc {

   public static void main(String[] args) 
    {
    	String expression = "";
    	while (!expression.equals("quit")) {
    		Scanner input = new Scanner(System.in);
    		System.out.println("Type an operation between two fractions or type quit");
    		expression = input.nextLine();
    		System.out.println(produceAnswer(expression));
    	}
    }
    public static String produceAnswer(String expression)
    { 
    		String[] splitExpression = expression.split(" ");
        String operand1 = splitExpression[0];
        String operator = splitExpression[1];
        String operand2 = splitExpression[2];
        String[] splitOperand1 = new String[3];   
        String[] splitOperand2 = new String[3];    
        fractionData(operand1, splitOperand1);
        fractionData(operand2, splitOperand2);
        int whole1 = Integer.parseInt(splitOperand1[0]);
        int numerator1 = Integer.parseInt(splitOperand1[1]);
        int denominator1 = Integer.parseInt(splitOperand1[2]);
        
        int whole2 = Integer.parseInt(splitOperand2[0]);
        int numerator2 = Integer.parseInt(splitOperand2[1]);
        int denominator2 = Integer.parseInt(splitOperand2[2]);
        if (operator.equals("+") || operator.equals("-")) {
        		return plusMinus(operator, whole1, numerator1, denominator1, whole2, numerator2, denominator2);
        }
        else {
        		return multiplyDivide(operator, whole1, numerator1, denominator1, whole2, numerator2, denominator2);
        }
        }
    
    public static void fractionData(String operand, String[] splitOperand) {
    		String whole = "";
    		String numerator = "";
    		String denominator = "";
    		if( (operand.contains("/")) && (operand.contains("_"))) {
    			String[] split2 = operand.split("/");
    			String[] split3 = operand.split("_");
    			whole = split3[0];
    			String[] split4 = split2[0].split("_");
    			numerator = split4[1];
    			denominator = split2[1];
    		}
    		else if (operand.contains("/") && !operand.contains("_")) {
    			String[] split2 = operand.split("/");
    			whole = "0";
    			numerator = split2[0];
    			denominator= split2[1];
    		}
    		else {
    			whole = operand;
    			numerator = "0"; 
    			denominator = "1";
    		}
    		splitOperand[0] = whole;
    		splitOperand[1] = numerator;
        splitOperand[2] = denominator;
    }
                  
    public static String plusMinus(String operator, int whole1, int numerator1, int denominator1, int whole2, int numerator2, int denominator2){
        boolean negative1 = false;
	if (whole1 < 0){
		whole1 *= -1;
		negative1 = true;
	}
	if (numerator1 < 0){
		numerator1 *= -1;
		negative1 = true;
	}
	int nume1result = (whole1 * denominator1 + numerator1) * denominator2;
	if (negative1 != false){
		nume1result *= -1;
	}
	boolean negative2 = false;
	if (whole2 < 0){
		whole2 *= -1;
		negative2 = true;
	}
	if (numerator2 < 0){
		numerator2 *= -1;
		negative2 = true;
	}
        int nume2result = (whole2 * denominator2 + numerator2) * denominator1;
	if (negative2 != false){
		nume2result *= -1;
	}
        int denomresult = denominator1 * denominator2;
        int numerator = 0;
        int denominator = 0;
        if (operator.equals("+")){
            numerator = nume1result + nume2result;
            denominator= denomresult;
        }
        else {
            numerator = nume1result - nume2result;
            denominator = denomresult;
        }
        return simplify(numerator, denominator);
    }
    public static String multiplyDivide(String operator, int whole1, int numerator1, int denominator1, int whole2, int numerator2, int denominator2){
        int numerator = 0;
        int denominator = 0;
        boolean negative = false;
    		if (whole1 < 0 && whole2 < 0) {
    			whole1 *= -1;
    			whole2 *= -1; 
    			negative = false;
    		}
    		if (whole1 < 0 && numerator2 < 0) {
    			whole1 *= -1;
    			numerator2 *= -1;
    			negative = false;
    		}
    		if (numerator1 < 0 && whole2 < 0) {
    			numerator1 *= -1;
    			numerator2 *= -1;
    			negative = false;
    		}
    		if (numerator1 < 0 && numerator2 < 0) {
    			numerator1 *= -1;
    			numerator2 *= -1;
    			negative = false;
    		}
    		if (whole1 < 0 && (whole2 >= 0 && numerator2 >= 0)) {
    			whole1 *= -1;
    			negative = true;
    		}
    		if (numerator1 < 0 && (whole2 >= 0 && numerator2 >= 0)) {
    			numerator1 *= -1;
    			negative = true;
    		}
    		if (whole2 < 0 && (whole1 >= 0 && numerator1 >= 0)) {
    			whole2 *= -1;
    			negative = true;
    		}
    		if (numerator2 < 0 && (whole1 >= 0 && numerator1 >= 0)) {
    			numerator2 *= -1;
    			negative = true;
    		}
    		int nume1result = whole1 * denominator1 + numerator1;
        int nume2result = whole2 * denominator2 + numerator2;
        if (operator.equals("*")){
            numerator = nume1result * nume2result;
            denominator = denominator1 * denominator2;
        }
        else {
            numerator = nume1result * denominator2;
            denominator = denominator1 * nume2result;
        }
	if (numerator == 0){
		negative = false;
	}
        if (negative != true){
        		return simplify(numerator, denominator);
        }
        else {
        		return "-" + simplify(numerator, denominator);
        }
    } 

	public static String simplify (int numerator, int denominator){
	    int temp = 0;
	    int a = numerator;
	    int b = denominator;
	    if (b > a) {
	         temp = a;
	         a = b;
	         b = temp;
	    }
	    while (b !=0) {
	        temp = a % b;
	        a = b;
	        b = temp;
	    }
	    int gcd = a;
	    numerator /= gcd;
	    denominator /= gcd;
	    int whole = 0;
	    if ((numerator >= denominator || numerator == 0) && (denominator != 1)) {
	    		while (numerator >= denominator) {
	    			numerator -= denominator;
	    			whole ++;
	    		}
	    		if (numerator == 0) {
	    			return whole + "";
	    		}
	    		else {
	    			return whole + "_" + numerator + "/" + denominator;
	    }
	    } 
		else if (denominator == 1){
		    return numerator + "";
	    }    
	    	else {
	    		return numerator + "/" + denominator;
	    	}
	    }   		
  
	}
