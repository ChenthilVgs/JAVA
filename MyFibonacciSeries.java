package myAssignments_day1;

public class MyFibonacciSeries {

	public static void main(String[] args) {
		int fstNum = 0;
		int secNum = 1;
		int range = 8;
		int sum = 0;
		System.out.println(fstNum);
		System.out.println(secNum);
		for (int i = 2; i < range; i++) {
			sum = fstNum + secNum;
			fstNum = secNum;
			secNum = sum;
			System.out.println(sum);

		}

	}

}
