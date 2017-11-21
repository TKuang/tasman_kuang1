package fracCalc;
import java.util.Arrays;
import java.util.Scanner;

public class FracCalc {

    public static void main(String[] args) 
    {
    	String expression = "";
    	while (!expression.equals("quit")) {
    		Scanner input = new Scanner(System.in);
    		System.out.println("Type an addition operation between two fractions or type quit");
    		expression = input.nextLine();
    		System.out.println(produceAnswer(expression));
    	}
        
        // TODO: Read the input from the user and call produceAnswer with an equation

    }
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
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
        
        //parseOperands(firstOperand, answerStringOp1);
        //parseOperands(secondOperand, answerStringOp2);
        
        int whole1 = Integer.parseInt(splitOperand1[0]);
        int nume1 = Integer.parseInt(splitOperand1[1]);
        int denom1 = Integer.parseInt(splitOperand1[2]);
        
        int whole2 = Integer.parseInt(splitOperand2[0]);
        int nume2 = Integer.parseInt(splitOperand2[1]);
        int denom2 = Integer.parseInt(splitOperand2[2]);
        return plusMinus(operator, whole1, nume1, denom1, whole2, nume2, denom2);
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
                  
    public static String plusMinus(String operator, int whole1, int nume1, int denom1, int whole2, int nume2, int denom2){
        int nume1result;
        int nume2result;
        int denomresult;
        nume1result = (whole1 * denom1 + nume1) * denom2;
        nume2result = (whole2 * denom2 + nume2) * denom1;
        denomresult = denom1 * denom2;
        if(operator.equals("+")){
            return nume1result + nume2result + "/" + denomresult;
        }
        else {
            return nume1result - nume2result + "/" + denomresult;
        }
    }
}
