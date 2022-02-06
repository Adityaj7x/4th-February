package smallestElementOfArray;

//This program will give us smallest element present in the array

public class SmallestElementOfArray {
	public static void main(String args[]) {
		int [] array = new int [] {11, 15, 71, 80, 8};
		int minimum = array[0];
		for (int integer = 0; integer<array.length; integer++) {
			if(array[integer]<minimum) {
				minimum = array[integer];
			}
		}
		System.out.println("Smallest element in the given array is: " + minimum);
	}
}