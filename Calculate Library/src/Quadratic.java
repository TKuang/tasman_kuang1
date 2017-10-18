/**
 * This class is responsible for the calculations QuadraticClient need to
 * print out information about a parabola
 * Tasman Kuang
 * 10/17/2017
 */

public class Quadratic
{
    public static double round2 (double num){
	if (num < 0){
		num *= -1;
		if (num * 1000 % 10 < 5){
			num = (num * 1000 - num * 1000 % 10)/1000;
		}
		else {
		num = (10 - num * 1000 % 10 + num * 1000)/1000;
		}
		num *= -1;
		return num;
	}
	else {
		if (num * 1000 % 10 < 5){
			return (num * 1000 - num * 1000 % 10)/1000;
			}
		else {
			return (10 - num * 1000 % 10 + num * 1000)/1000;
			}
		}
	}
    
        public static double sqrt(double num){
        double answer; 
        double root;
        if(number == 0){
            root = 0;
        }
        else if(num > 0){
            root = num/2;
            do {
                estimate = root;
                root = (answer + (num / answer)) / 2;
            }
            while ((answer - root) != 0);
        }
        else if (num < 0){
            throw new IllegalArgumentException("You enterred a negative number");
        }
        else {
            root = num;
        }
        return round2(root);
    }
    
    public static String quadrDescriber(double a, double b, double c){
        String description = "Description of the graph of: \n" + "y = " + a + "x^2 + " + b + " + " + c + "\n\n";
        if(a < 0){
            description += "Opens: Down\n";
        }else{
            description += "Opens: Up\n";
        }
        double x-vertex = -b / (2 * a);
        double y-vertex = a * x-vertex ^ 2 + b * x-vertex + c;
        String x-intercepts = quadForm(a, b, c);
        
        description += "Axis of Symmetry: " + x-vertex + "\n";
        description += "Vertex: (" + x-vertex + ", " + y-vertex + ")\n";
        description += "X-intercept: " + x-intercepts + "\n";
        description += "Y-intercept: " + c + "\n";
        return description;
    }
    public static String quadForm(double a, double b, double c){
        if(discriminant(a, b, c) < 0){//if the output after calling the discriminant is a negative number
            return "None";
        }
        else if(discriminant(a, b, c) == 0){
            double root = round2(-b / (2 * a));
            String answer = root + "";
            return answer;
        }
        else{
            double smallRoot = round2((-b + (sqrt(discriminant(a,b,c)))) / (2*a));//rounds answer to two decimal places
            double bigRoot = round2((-b - (sqrt(discriminant(a,b,c)))) / (2*a));
            String answer = smallRoot + " and " + bigRoot;
            return answer;
        }
    }

    public static double discriminant(double a, double b, double c){
        return (b * b) - 4 * a * c;
    }
}
