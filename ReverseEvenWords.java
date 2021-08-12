package week1.day2.assignments;
/* Pseudo Code:
 * Declare the input as Follow
  		String test = "I am a software tester"; 
a) split the words and have it in an array
b) Traverse through each word (using loop)
c) find the odd index within the loop (use mod operator)
d)split the words and have it in an array
e)print the even position words in reverse order using another loop (nested loop)
f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).
 */
public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester";
		String[] testArr=test.split(" ");
		int len = testArr.length;
		String rev ;
		//System.out.println(len);
		for (int i = 0; i < len; i++) {
			rev="";
			//System.out.println(testArr[i]);
			if (i%2!=0) { 
				char[] chrArr = testArr[i].toCharArray();
				for (int j = chrArr.length -1; j >=0; j--) {
					
				rev = rev+chrArr[j];
				//break;			
				}
				System.out.print(" "+rev);
				//break;
				continue; 
			}
			
			System.out.print(" "+testArr[i]+"");
		}
		
	}

}
