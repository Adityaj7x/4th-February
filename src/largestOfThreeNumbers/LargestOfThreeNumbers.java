package largestOfThreeNumbers;

//In this program, we will take 3 inputs from the users and the program will find which one of them is largest

import java.util.Scanner;

public class LargestOfThreeNumbers {
	public static void main(String args[]) {
		 Scanner scan = new Scanner(System.in);
		 
		 System.out.println("Enter the first number");
		 int firstInteger = scan.nextInt();
		 
		 System.out.println("Enter the second number");
		 int secondInteger = scan.nextInt();
		 
		 System.out.println("Enter the third number");
		 int thirdInteger = scan.nextInt();
		 
		 int largest, temp;
		 
		 temp = firstInteger>secondInteger ? firstInteger : secondInteger;
		 largest = thirdInteger>temp ? thirdInteger : temp;
		 
		 System.out.println("Largest amongst " + firstInteger + ", " + secondInteger + " & " + thirdInteger + " is " + largest);
	}
}
