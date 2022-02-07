package spiralMatrix;

import java.util.Scanner;

public class SpiralMatrix {
public static void main(String[] args) {
		
		Scanner scan =  new Scanner(System.in);
		System.out.println("Enter the value of N");
		int userInput = scan.nextInt();
		int currentNumber = 1;
		int columnMinimum = 0;
		int rowMinimum = 0;
		int columnMaximum = userInput-1;
		int rowMaximum = userInput-1;
		
		int spiral[][] = new int[userInput][userInput];
		
		
		while( rowMinimum <= rowMaximum && columnMinimum <= columnMaximum ) {
		 
		//left to right
		 for(int j = columnMinimum; j <= columnMaximum; j++) {
			spiral[rowMinimum][j]= currentNumber;
			currentNumber++;
		 }
		 rowMinimum++;
		 
		 //top to bottom
		 for(int j = rowMinimum; j <= rowMaximum; j++) {
			 spiral[j][columnMaximum] = currentNumber;
			 currentNumber++;
		 }
		 columnMaximum--;
		 
		 //right to left
		 for(int j = columnMaximum; j >= columnMinimum; j--) {
			 spiral[rowMaximum][j] = currentNumber;
			 currentNumber++;
		 }
		 rowMaximum--;
		 
		 //bottom to top
		 for(int j = rowMaximum; j >= rowMinimum; j--) {
			 spiral[j][columnMinimum] = currentNumber;
			 currentNumber++;
			
		 }
		 columnMinimum++;
		}

	for(int i = 0; i < userInput; i++) {
		for(int j = 0; j < userInput; j++) {
			System.out.printf("%4d",spiral[i][j]);
			
		}
		System.out.println();
	}
		}
}
