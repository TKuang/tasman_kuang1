import.java.util;

public clas FracCalc {
  
  public static void main (String[]args) {
    Scanner userInput= newScanner(System.in);
    System.out.println("Type an addition operation between two fractions");
    String fractions = userInput.nextString();
    System.out.print("Sum = " + produceAnswer(fractions));
  }
  
  public static String produceAnswer(fractions){
    String[] split = fractions.split(" ");
    String operand1 = split[0];
    
    
