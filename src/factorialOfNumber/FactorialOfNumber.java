package factorialOfNumber;

//This program will give the factorial of given number

public class FactorialOfNumber {
	public static void main(String args[]) {
		int number=5; // Enter the number here 
		int integer, factors=1;
		
		for (integer=number;integer>0;--integer) {
			factors=factors*integer;
		}
			System.out.print("Factorials of number " + number + " is " + factors);
	}
}
