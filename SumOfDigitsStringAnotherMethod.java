package week2.day2.assignment;

public class SumOfDigitsStringAnotherMethod {
	public static void main(String[] args) {
		/* * a) Iterate an  array over the String
		 * b) Get each character and check if it is a number using Character.isDigit()
		 * c) Now covert char to int using Character.getNumericValue() and add it to sum
		 * d) Now Print the value
		 */		
			String text = "Tes12Le79af65";
			char text1;
		  			int sum = 0;
		  		int length = text.length();
		  		for (int i = 0; i < length; i++) {
		  			text1=text.charAt(i);
		  			if(Character.isDigit(text1))
		  			{
		  				 int num = Character.getNumericValue(text1);
		  				sum=sum+num;
					}
		  		}
		  			System.out.println("Sum of Digits: "+sum);
		

	}

}
