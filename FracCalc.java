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
        String result = Arrays.toString(splitOperand2);
        return result;
        // TODO: Implement this function to produce the solution to the input
    }
    
    public static void fractionData(String operand, String[] splitOperand) {

    	if( (operand.contains("/")) && (operand.contains("_"))) {
    		String[] split2 = operand.split("/");
        	split2 = operand.split("_");
        	splitOperand[0] = "whole:" + split2[0];
        	splitOperand[1] = " numerator:" + split2[1];
        	splitOperand[2] = " denominator:" + split2[2];
    	}
    	else if (operand.contains("/") && !operand.contains("_")) {
    		String[] split2 = operand.split("/");
    		splitOperand[0] = "whole:0 ";
    		splitOperand[1] = " numerator:" + split2[0];
    		splitOperand[2] = " denominator" + split2[1];
    	}
    	else {
    		splitOperand[0] = "whole:" + operand;
    		splitOperand[1] = " numberator:0"; 
    		splitOperand[2] = " denominator:1";
    	}
    	}
    	
    	
    	
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    
