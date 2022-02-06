package copyFromArrayToAnotherArray;

//This program will copy elements of array from one array to another

public class CopyFromArrayToAnotherArray {
	public static void main(String[] args) {
  	int [] firstArray = new int [] {1, 2, 3, 4, 5};
  	int secondArray[] = new int[firstArray.length];
  		for (int i = 0; i < firstArray.length; i++) {
  			secondArray[i] = firstArray[i];
  		}
  		System.out.println("Following is the original array: ");
  			for (int i = 0; i < firstArray.length; i++) {
  					System.out.print(firstArray[i] + " ");
  			}
  			System.out.println("\nFollowing is the new array: ");
  			for (int i = 0; i < secondArray.length; i++) {
  				System.out.print(secondArray[i] + " ");
  			}
}
}