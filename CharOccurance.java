package week1.day2.assignments;
//Check number of occurrences of a char (eg 'e') in a String
// declare and initialize a variable count to store the number of occurrences
// convert the string into char array
//get the length of the array
// traverse from 0 till the array length 
// Check the char array has the particular char in it 
// if is has increment the count
// print the count out of the loop
					

public class CharOccurance {

	public static void main(String[] args) {
		String str = "welcome to chENnai";
		//str = str.toLowerCase()
		char strArr[] = str.toCharArray();
		int counter = 0;
		for (int i = 0; i < strArr.length; i++) {
			if (strArr[i]=='n'||strArr[i]=='N') {
			counter++;
				
			}
					}
		
System.out.println(counter);
	}

}
