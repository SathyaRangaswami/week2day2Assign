package week2.day2.assignment;

public class RemoveDuplicates {
	public static void main(String[] args) {
		/*
		 * c) Split the String into array and iterate over it d) Initialize another loop
		 * to check whether the word is there in the array e) if it is available then
		 * increase and count by 1. f) if the count > 1 then replace the word as "" g)
		 * Displaying the String without duplicate words
		 */
		String text = "We learn java basics as part of java  in sessions in java week1";
		int count = 0;
		String replace = "";
		String[] split = text.split(" ");

		for (int i = 0; i < split.length; i++) {
			count = 0;
			// System.out.print("split:["+i+"] "+split[i]);
			for (int j = i + 1; j < split.length; j++) {

				if (split[i].equalsIgnoreCase(split[j])) {

					count = count + 1;
				}
				
			}
			
			if (count > 1)

			{
				replace = text.replaceAll(split[i], " ");
				System.out.print(replace);
				
			}

		}

	}
}
