package xter_in_string;

import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {
		long[] arr = { 1, 3, 7, 7, 8, 9, 9, 10 };
		//long[] arr = getArrayElement();
		long[] arrSorted = removeDuplicates(arr);
		System.out.println("Unique Array of " + Arrays.toString(arr) + " = " + Arrays.toString(arrSorted));
		
	}
	// function to accept input of array from user.
	/*private static long[] getArrayElement() {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter Number of Elements in the Array");
		int t = s.nextInt(); // read number of element
		s.nextLine(); // consume new line
		long arr[] = new long[t];
		for (int i = 0; i < t; i++) {
			arr[i] = Integer.parseInt(s.nextLine());
		}
		return arr;
	}*/	
	// remove duplicate from string array.
	private static long[] removeDuplicates(long[] A) {
		if (A.length < 2)
			return A;

		int j = 0;
		int i = 1;

		while (i < A.length) {
			if (A[i] == A[j]) {
				i++;
			} else {
				j++;
				A[j] = A[i];
				i++;
			}
		}
		long[] B = Arrays.copyOf(A, j + 1);
		return B;
	}
	
	
}
