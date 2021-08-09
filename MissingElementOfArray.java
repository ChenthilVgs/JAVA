package week1.day2.assignments;

import java.util.Arrays;

public class MissingElementOfArray {

	public static void main(String[] args) {
			
			int[] arr = {1,2,3,4,7,6,8}; 
			Arrays.sort(arr);
			int len = arr.length;
						
			for (int i = 0; i < len; i++) {
				//System.out.println(arr[i]);	 
				if (i!=arr[i]-1) {
					System.out.println(i+1);
					break;
				}
				
			}
			

}
}
