package week1.day2.assignments;

public class Calculator {

	public int add() {
		int num1 = 100;
		int num2 = 50;
		int num3;
		num3 = num1 + num2;
		return num3;
	}

	public int sub() {
		int num1 = 100;
		int num2 = 50;
		int num3;
		num3 = num1 - num2;
		return num3;
	}

	public double mult() {
		double num1 = 100.28;
		double num2 = 50.28;
		double num3 = num1 * num2;
		return num3;
	}

	public float div() {
		float num1 = 100.25f;
		float num2 = 50.85f;
		float num3 = num1 + num2;
		return num3;
	}

	public static void main(String[] args) {

		Calculator myCalc = new Calculator();
		System.out.println("The Sum of the numbers : " + myCalc.add());
		System.out.println("The difference of the numbers : " + myCalc.sub());
		System.out.println("The times of the numbers : " + myCalc.mult());
		System.out.println("The fraction of the numbers : " + myCalc.div());
	}

}
