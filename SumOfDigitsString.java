package week2.day2.assignment;

public class SumOfDigitsString {
public static void main(String[] args) {
	/*
	 
	 * Declare a String text with the following value
		
	 * a) using replaceAll(), replace all the non-digits into ""
	 * b) Now, convert the String into array
	 * c) Iterate over the array and get each character
	 * d) Using Character.getNumericValue(), Change the char into int
	 * e) Add the values to sum & print
	 * 
	 */
	String text = "Tes12Le79af65";
	int sum = 0;
	  String replAll = text.replaceAll("[\\D]","");	
	  char[] charArr = replAll.toCharArray();
	  for (int i = 0; i < charArr.length; i++) {
		  System.out.println(charArr[i]);
		  int num = Character.getNumericValue(charArr[i]);
		sum=sum+num;
	}
	  System.out.println("Sum of Digits:"+sum);
	 
	  }
}
