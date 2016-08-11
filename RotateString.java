package xter_in_string;

import java.util.Arrays;

public class RotateString {

	public static void main(String[] args) {
		long [] arry = { 1, 2, 3, 4, 5, 6 };
		//long[] arry = getArrayElement(); 
		int N = 2;
		long [] arrRotated = rotateNPosition(arry, N);
		System.out.println("Rotating Array of " + Arrays.toString(arry) + " = " + Arrays.toString(arrRotated));

	}
	
	// rotate array of N position
		private static long[] rotateNPosition(long[] arr, int order) {
			if (arr == null || order < 0) {
				throw new IllegalArgumentException(
						"The array must be non-null and the order must be non-negative");
			}
			int offset = arr.length - order % arr.length;
			if (offset > 0) {
				long[] copy = (long[]) arr.clone();
				for (int i = 0; i < arr.length; ++i) {
					int j = (i + offset) % arr.length;
					arr[i] = copy[j];
				}
			}
			return arr;
		}

}
