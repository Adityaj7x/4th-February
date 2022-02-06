package evenNumbersFrom1To100;

//This program will print even numbers from 1 to 100

public class EvenNumbersFrom1To100 {
	public static void main (String args[]) {
		int number=100;
		System.out.print("List of even numbers from 1 to " + number + ": ");
		for (int integer=1;integer<=100;integer++) {
			if(integer%2==0) {
				System.out.print(integer + ", ");
			}
		}
	}
}
