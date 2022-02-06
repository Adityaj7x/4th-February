package primeNumber;

//Program for checking whether the number is Prime or not

public class PrimeNumber {
	public static void main(String args[]) {
		int integer, mean=0, flag=0;
		int number=13; //number to be checked
		mean=number/2;
		if(number==0||number==1) {
			System.out.println("Not a prime number");
		} else {
			for(integer=2; integer<=mean;integer++) {
				if(number%integer==0) {
					System.out.println("The number is not prime");
					flag=1;
					break;
				}
				}
			if(flag==0) {
				System.out.println("Number is prime");
			}
		}
	}
}
