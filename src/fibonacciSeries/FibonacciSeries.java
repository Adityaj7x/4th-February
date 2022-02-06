package fibonacciSeries;

//This is a program for printing first 10 Fibonacci Numbers without recursion

public class FibonacciSeries {
	public static void main(String args[]) {
		int firstInteger=0, secondInteger=1, thirdInteger=0, integer, count=10;
		
		System.out.print(firstInteger + " " + secondInteger);
		
		for(integer=2; integer < count; ++integer) {
			thirdInteger = firstInteger + secondInteger;
			System.out.print(" " + thirdInteger);
			firstInteger = secondInteger;
			secondInteger = thirdInteger;
		}
	}
}
