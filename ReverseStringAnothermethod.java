package week2.day2.assignment;

public class ReverseStringAnothermethod {
	public static void main(String[] args) {
		/* Pseudo Code: 2
		a) Find the length of the string
		b) Traverse through each index from length-1 -> 0 (using loop in reverse direction)
		c) Find the character of the String using its index
		*/
		String test = "feeling good";
		int length=test.length();
		
		System.out.print("Reverse of the String :");
		for(int i=length-1;i>=0;i--)
		{
			System.out.print(test.charAt(i));
		}
						
	}

}
