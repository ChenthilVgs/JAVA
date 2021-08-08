package myAssignments_day1;

public class MyPrimeNumber {

	public static void main(String[] args) {
		int input = 12;
		boolean flag = false;
		for (int i = 2; i < input/2; i++) {
			int rem = input % i;
			if (rem ==0) {
				System.out.println(input+" is not a Prime Number");
				flag = true;
				break;
			}
										
			}
		if (flag==false) {
		
			System.out.println(input+" is a Prime Number");
		}
	

	}

}
