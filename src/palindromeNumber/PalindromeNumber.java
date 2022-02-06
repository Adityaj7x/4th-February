package palindromeNumber;

//This program is for checking whether a number is palindrome or not

public class PalindromeNumber {
	public static void main(String args[]) {
		int reminder, sum=0, temp;
		int number=152; //number to be checked
		temp=number;
		while(number>0) {
			reminder=number%10;
			sum=(sum*10) + reminder;
			number = number/10;
		}
		if(temp==sum) {
			System.out.println("Number is palindrome");
		} else {
			System.out.println("Number is not palindrome");
		}
	}
}
