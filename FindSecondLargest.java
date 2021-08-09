package week1.day2.assignments;

import java.util.Arrays;

/*
Pseudo Code:
1) Arrange the array in ascending order
2) Pick the 2nd element from the last and print it
*/

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		Arrays.sort(data);
		int lastIndx = data.length;
		System.out.println(data[lastIndx-2]);
				
	}

}
 