package atmWithdrawal;

//This program will work like a basic ATM Machine

import java.util.Scanner;

public class ATMWithdrawal {
	public static void main (String args[]) {
		int accountBalance = 50000;
		int withdraw, deposit;
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			 System.out.println("Automated Teller Machine");
	         System.out.println("Press 1 for Withdraw Money");
	         System.out.println("Press 2 for Deposit Money");
	         System.out.println("Press 3 for Check Account Balance");
	         System.out.println("Press 4 for EXIT");
	         System.out.print("Select the operation you want to perform:");
	         System.out.println("");
	         
	         int choice = scan.nextInt();
	         
	         switch(choice)
	         {
	         case 1:
	        	 System.out.println("Enter the amount of money to be wthdrawn");
	        	 System.out.println("");
	        	 withdraw = scan.nextInt();
	        	 
	        	 if(accountBalance>withdraw) {
	        		 accountBalance = accountBalance - withdraw;
	        		 System.out.println("Please collect your money");
	        	 } else {
	        		 System.out.println("Insufficient funds in your account");
	        	 }
	        	 System.out.println("");
	        	 break;
	        	 
	         case 2:
	        	 System.out.println("Enter the amount of money to be deposited");
	        	 System.out.println("");
	        	 deposit = scan.nextInt();
	        	 
	        	 accountBalance = accountBalance + deposit;
	        	 System.out.println("Your funds have been credited to your accounnt");
	        	 System.out.println("");
	        	 break;
	        	 
	         case 3:
	        	 System.out.println("Your account balance is: " + accountBalance);
	        	 System.out.println("");
	        	 break;
	        	 
	         case 4:
	        	 System.exit(0);
	         }
		}
	}
}
