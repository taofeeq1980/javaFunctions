package xter_in_string;

import java.util.Arrays;

public class LowestCommomMultiple {

	public static void main(String[] args) {
		long a[] = { 2, 5, 7 };
		//long a[] = getArrayElement();
		System.out.println("LCM of " + Arrays.toString(a) + " = " + getLCM(a));
	}
	// function to compute Lowest Commom Multiple
		private static long getLCM(long[] a) {
			long lcm = 0;
			boolean found;
			for (int i = 1;; i++) {
				found = true;
				for (int x = 0; x < a.length; x++) {
					if (i % a[x] != 0) {
						found = false;
						break;
					}
				}
				if (found) {
					lcm = i;
					break;
				}
			}
			return lcm;
		}
}
