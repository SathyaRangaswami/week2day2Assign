package week2.day2.assignment;

public class ReverseEvenWord {
	public static void main(String[] args) {
		/*
		a) split the words and have it in an array
	b) Traverse through each word (using loop)
	c) find the odd index within the loop (use mod operator)	
	d)split the words and have it in an array	
	e)print the even position words in reverse order using another loop (nested loop)
	f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).

		 */
	
	String test = "I am a software tester"; 
	String[] split = test.split(" ");
	for (int i = 0; i < split.length; i++) {
		if(i%2!=0)
		{
			//System.out.println(split[i]);
			int length = split[i].length();
			//System.out.println(length);
			for(int j=length-1;j>=0;j--)
			{
				System.out.print(split[i].charAt(j));
			}
			System.out.print(" ");
		}
		else
		{
			System.out.print(split[i]+ " ");
		}
				
		}
	
	}
}
