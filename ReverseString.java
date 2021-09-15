package week2.day2.assignment;

public class ReverseString {
	public static void main(String[] args) {
		String test = "feeling good";
		char[] charArr = test.toCharArray();
		System.out.print("Reverse of the String :");
		
		for(int i=charArr.length-1;i>=0;i--)
		{
			System.out.print(charArr[i]);
		}	
				
	}

}
