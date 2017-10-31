import java.util.Arrays;

public class Split {
	
	public static void main(String[] args) {
		// Your task Part 0
		//String.split();
		//It's a method that acts on a string, <StringName>.split(<String sp>);
		//Where sp is the string where the string splits
		//And it returns an array
		// Example: "I like apples!".split(" "); 
//			it will split at spaces and return an array of ["I","like","apples!"]
		// Example 2: "I really like really red apples".split("really")
//			it will split at the word "really" and return an array of ["I "," like "," red apples!"]
		//play around with String.split! 
		//What happens if you "I reallyreally likeapples".split("really") ?
		System.out.println(Arrays.toString("I like apples!".split(" ")));
		System.out.println(Arrays.toString("I really like really red apples".split("really")));
		System.out.println(Arrays.toString("I really like reallyreally red apples".split("really")));
		System.out.println(Arrays.toString("really like really red apples".split("really")));
		System.out.println(Arrays.toString("I really like really red apples, really".split("really")));

		//Your task Part 1:
		//Write a method that take in a string like "applespineapplesbreadlettustomatobaconmayohambreadcheese" describing a sandwich
		//use String.split to split up the sandwich by the word "bread" and return what's in the middle of the sandwich and ignores what's on the outside
		 //What if it's a fancy sandwich with multiple pieces of bread?
	}
		public static void middleOf(String sandwich) {
			String[] split = sandwich.split("bread");
			System.out.print(split[1]);
		}

		//Your task Part 2:
		/*Write a method that take in a string like "apples pineapples bread lettus tomato bacon mayo ham bread cheese" describing a sandwich
		* use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of the sandwich and ignores what's on the outside
		* Again, what if it's a fancy sandwich with multiple pieces of bread?
		*/
		public static void middleWithSpace(String sandwich) {
			String[] split = sandwich.split(" ");
			int count = 0;
			int index2 = 0;
			for (int i = 0; i < split.length; i++){
				index2++;
				if (split[i] == "bread"){
					count++;
				}
				if (count == 2){
					break;
				}
			}
			int index1 = 0;
			for (int j = 0; j < split.length; j++){
				index1++;
				if (split[j] == "bread"){
					break;
				}
			}
			for (int k = index1+1; k < index2; k++){
				System.out.println(split[k]);
			}
		}
}
