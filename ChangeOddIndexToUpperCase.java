package week1.day2.assignments;
/* Pseudo Code
* Declare String Input as Follow
* String test = "changeme";
* a) Convert the String to character array
* b) Traverse through each character (using loop)
* c)find the odd index within the loop (use mod operator)
* d)within the loop, change the character to uppercase, if the index is odd else don't change
*/

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String test = "changeme";
		char[] tstArr = test.toCharArray();
		for (int i = 0; i < tstArr.length; i++) {
			for (int j = i + 1; j < tstArr.length; j++) {
				if (i % 2 == 0) {
					tstArr[i] = Character.toUpperCase(tstArr[i]);

				}

			}
		}
		System.out.println(tstArr);
	}
}
