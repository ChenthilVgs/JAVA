package week1.day2.assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";

		char tstArr1[] = text1.toCharArray();
		char tstArr2[] = text2.toCharArray();
		Arrays.sort(tstArr1);
		Arrays.sort(tstArr2);
		int counter = 0;
		if (tstArr1.length == tstArr2.length) {
			for (int i = 0; i < tstArr1.length; i++) {

				if (tstArr1[i] != tstArr2[i]) {
					System.out.println("The given text is not an Anagram");
					counter++;
					break;
				}
			}
			if (counter == 0) {
				System.out.println("The given text is an Anagram");
			}

		} else {
			System.out.println("The given text is not an Anagram");
		}

	}

}
