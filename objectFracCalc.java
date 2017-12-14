public class objectFracCalc
{
    private String expression;
    private String answer;
    public objectFracCalc(String expression)
    {
        this.expression = expression;
    }

    public void produceAnswer()//returns the final answer of calculation, simplified
    { 
        // TODO: Implement this function to produce the solution to the input
        String[] splitArr = expression.split(" ");
        String firstOperand = splitArr[0];
        String operator = splitArr[1];
        String secondOperand = splitArr[2];
        String[] answerStringOp1 = new String[3];
        String[] answerStringOp2 = new String[3];
        
        parseOperands(firstOperand, answerStringOp1);
        parseOperands(secondOperand, answerStringOp2);
        
        int whole1 = Integer.parseInt(answerStringOp1[0]);//convert strings in the array to integers
        int nume1 = Integer.parseInt(answerStringOp1[1]);
        int denom1 = Integer.parseInt(answerStringOp1[2]);
        
        int whole2 = Integer.parseInt(answerStringOp2[0]);
        int nume2 = Integer.parseInt(answerStringOp2[1]);
        int denom2 = Integer.parseInt(answerStringOp2[2]);
        
        int[] notReduced;
        int totalNume1 = toImproper(whole1, nume1, denom1);//changes the answer to improper fractions, meaning the answer is not reduced yet
        int totalNume2 = toImproper(whole2, nume2, denom2);
        String reduced;
        if(operator.equals("+") || operator.equals("-")){
            notReduced = plusMinus(operator, totalNume1, totalNume2, denom1, denom2);
        }else{
            notReduced = multiplyDivide(operator, totalNume1, totalNume2, denom1, denom2);
        }
        this.answer = reduce(notReduced);//reduce the improper answer
    }
    

    // TODO: Fill in the space below with any helper methods that you think you will need
    public void parseOperands(String operand, String[] answer){//process the input to determine the first operand, operator, and second operand
        String wholeNumber = "";
        String numerator = "";
        String denominator = "";
        String[] slashUnderscore;
        String[] splitUnderscore = operand.split("_");//split the input at underscore
        if(splitUnderscore.length == 2){//if the input is a mixed number
            wholeNumber = splitUnderscore[0];//set the first element to wholeNumber
            slashUnderscore = splitUnderscore[1].split("/");//split at slash to find numerator/denominator
            if(slashUnderscore.length == 2){
                numerator = slashUnderscore[0];
                denominator = slashUnderscore[1];
            }
        }else{//if there is no wholeNumber
            slashUnderscore = operand.split("/");
            if(slashUnderscore.length == 2){
                wholeNumber = "0";
                numerator = slashUnderscore[0];
                denominator = slashUnderscore[1];
            }else{
                wholeNumber = splitUnderscore[0];
                numerator = "0";
                denominator = "1";
            }
        }
        answer[0] = wholeNumber;
        answer[1] = numerator;
        answer[2] = denominator;
    }
    public int[] plusMinus(String operator, int totalNume1, int totalNume2, int denom1, int denom2){
        int[] improp = new int[2];
        improp[1] = denom1 * denom2;//multiply denominators to find common denominator
        if(operator.equals("+")){
            improp[0] = (totalNume1 * denom2) + (totalNume2 * denom1);//use denom1 and denom2 to multiply whats needed to get the common denominator
        }else{
            improp[0] = totalNume1 * denom2 - totalNume2 * denom1;
        }
        return improp;
    }
    public int[] multiplyDivide(String operator, int totalNume1, int totalNume2, int denom1, int denom2){//calculates the fraction if it's multiply or divide
        int[] improp2 = new int[2];
        if(operator.equals("*")){
            improp2[0] = totalNume1 * totalNume2;
            improp2[1] = denom1 * denom2;
        }else{
            improp2[0] = totalNume1 * denom2;//dividing a fraction is the same as multiplying its reciprocal
            improp2[1] = totalNume2 * denom1;
        }
        return improp2;
    }
    public int toImproper(int wholeNum, int numerator, int denominator){//does calculation do produce an answer that is an improper fraction
        int totalNume;
        if(wholeNum < 0){//if wholeNum is a negative number
            totalNume = wholeNum * denominator - numerator;
        }else{
            totalNume = wholeNum * denominator + numerator;//find totalNume
        }
        return totalNume;
    }
    public String reduce(int[] improper){//reduce the improper fraction
        int reducedNume;
        int reducedDenom;
        int whole;
        int gCF;
        if(improper[0] == 0){//if the numerator is 0
            return "0";
        }else if(improper[0] == improper[1]){//is the result will be 1
            return "1";
        }else if(isDivisibleBy(improper[0], improper[1])){//if numerator is divisible by denominator
            whole = improper[0] / improper[1];
            return "" + whole;
        }else if((absValue(improper[0]) > improper[1]) && !(isDivisibleBy(improper[0], improper[1]))){//if numerator is greater but not divisible by denominator
            whole = improper[0] / improper[1];
            reducedNume = absValue(improper[0]) % improper[1];//find numerator
            gCF = gcf(reducedNume, improper[1]);
            reducedNume /= gCF;//find reducedNume
            improper[1] /= gCF;
            if(whole == 0){
                if(improper[1] < 0) {
                    reducedNume *= -1;//changes the negative sign from denominator to numerator, answer is the same
                    improper[1] *= -1;
                }
            	return reducedNume + "/" + improper[1];
            }else
                return whole + "_" + reducedNume + "/" + absValue(improper[1]);
        }else{
            gCF = gcf(improper[0], improper[1]);
            reducedNume = improper[0] / gCF;
            reducedDenom = improper[1] / gCF;
            return reducedNume + "/" + reducedDenom;
        }
    }
    public int gcf(int number1, int number2){
        int num1 = number1;
        int num2 = number2;
        while(number2 != 0){
            if(isDivisibleBy(num1, num2)){
                number1 = number2;//returns number 2 if number1 is divisible by number2
            }
            else{
                int number3 = number1;
                number1 = number2;//swaps the values of number1 and number2
                number2 = number3 % number2;
            }
        }
        return (int) absValue(number1);
    }
    public int absValue(int number){
        if(number < 0){
            number *= -1;//converts a negative number to a positive number
        }
        return number;
    }
    public boolean isDivisibleBy(int divident, int divisor){
        return divident % divisor == 0;
    }
    public String toString(){
        return answer;
    }
}
