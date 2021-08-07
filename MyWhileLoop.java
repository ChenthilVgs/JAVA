package week1.day1;

public class MyWhileLoop {
	// Sum of Digit using while

	public static void main(String[] args) {
		
		int numberAdd = 3456;
		int cor,rem,sum=0;
		while (numberAdd !=0) {
			 cor = numberAdd/10;
			 //System.out.println(cor);
			 rem = numberAdd % 10;
			 //System.out.println(rem);
			 numberAdd = cor;
			 //System.out.println(numberAdd);
			 sum = sum+rem;
			 //System.out.println(sum);
			 		 }
		System.out.println("The Sum of the digits are : "+sum);
	}

}
