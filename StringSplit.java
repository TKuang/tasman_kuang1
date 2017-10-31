import java.util.Arrays;

public class Split {
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString("I like apples!".split(" ")));
		System.out.println(Arrays.toString("I really like really red apples".split("really")));
		System.out.println(Arrays.toString("I really like reallyreally red apples".split("really")));
		System.out.println(Arrays.toString("really like really red apples".split("really")));
		System.out.println(Arrays.toString("I really like really red apples, really".split("really")));
	}
		public static void middleOf(String sandwich) {
			String[] split = sandwich.split("bread");
			System.out.print(split[1]);
		}

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
