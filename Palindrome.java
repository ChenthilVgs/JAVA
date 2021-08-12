package week1.day2.assignments;

import org.apache.poi.poifs.crypt.dsig.services.RevocationDataService;

/*
 * Pseudo Code
 * a) Declare A String value as"madam"
 * b) Declare another String rev value as ""
 * c) Iterate over the String in reverse order
 * d) Add the char into rev
 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
  * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
 */

public class Palindrome {

	public static void main(String[] args) {
		String origStr = "madam";
		String revStr = "";
		char arr1[] = origStr.toCharArray(); //
		for (int i = arr1.length - 1; i >= 0; i--) {
			revStr = revStr + arr1[i];
			//System.out.println(revStr);
		}
		if (origStr.equals(revStr)) {
			System.out.println("The given String is a Palindrom");
		} else {
			System.out.println("The given String is not a Palindrom");
		}
	}

}
