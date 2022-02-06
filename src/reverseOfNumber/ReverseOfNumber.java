package reverseOfNumber;

//This program is for reversing a number

public class ReverseOfNumber {
	public static void main(String args[]) {
		int number=987654321; //number which we want to check 
		int reverse=0;
		
		while(number!=0) {
			int reminder=number%10;
			reverse=(reverse*10) + reminder;
			number=number/10;
		}
		System.out.println("Reverse is " + reverse);
	}
}
