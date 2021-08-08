package myAssignments_day1;

public class MyArmstrongCode {

	public static void main(String[] args) {

		int calc = 0;
		int rem, orig;
		int arm = 371;
		orig = 371;
		while (orig > 0) {
			int input = orig / 10;
			rem = orig % 10;
			calc = calc + (rem * rem * rem);
//			System.out.println("Output : " + calc);
			orig = input;
//			System.out.println("Output : " + orig);
		}
		if (arm == calc) {
			System.out.println("The Given Number is an Armstrong Numbre");

		} else {
			System.out.println("The Given Number is not an Armstrong Numbre");

		}
	}

}
