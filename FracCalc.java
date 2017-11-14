package fracCalc;
import java.util.Scanner;

public class FracCalc {

    public static void main(String[] args) 
    {
    	Scanner input = new Scanner(System.in);
        System.out.println("Type an addition operation between two fractions");
        String fractions = input.next();
        System.out.print("Sum = " + produceAnswer(fractions));
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
    public static String produceAnswer(String fractions)
    { 
    	String[] split = fractions.split(" ");
        String Operand1 = split[0];
        String operator = split[1];
        String Operand2 = split[split.length - 1];
        return Operand2;
        // TODO: Implement this function to produce the solution to the input
        
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    
}
