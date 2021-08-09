package week1.day2.assignments;

public class MyCalculator {
	
	public static void main(String[] args) {
		Calculator myCalc = new Calculator();

		int a = myCalc.add();
		int b = myCalc.sub();
		double c = myCalc.mult();
		float d = myCalc.div();
//	 	
		System.out.println("The Sum of the numbers : " + a);
		System.out.println("The difference of the numbers : " + b);
		System.out.println("The times of the numbers : " + c);
		System.out.println("The fraction of the numbers : " + d);
	}

}
