package sumOf10NaturalNumbers;

//This program will display the sum of first 10 natural numbers

public class SumOf10NaturalNumbers {
	public static void main(String args[]) {
		int integer, sum=0;
		int numbers = 10; //testing
		for(integer=1; integer<=numbers; integer++) {
			sum = sum + integer;
		}
		System.out.println("Sum of first 10 natural numbers is " + sum);
	}
}
