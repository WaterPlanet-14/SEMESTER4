package Searching;
import java.util.Arrays;
public class _33ZeroSumTriplet {
//Example 5.33
	public static void ZeroSumTriplets(int[] arr, int size) {
		for (int i = 0; i < (size - 2); i++) {
			for (int j = i + 1; j < (size - 1); j++) {
				for (int k = j + 1; k < size; k++) {
					if (arr[i] + arr[j] + arr[k] == 0) {
						System.out.println("Triplet :: " + arr[i] + arr[j] + arr[k]);
					}
				}
			}
		}
	}
//T(n) = O(n^3)

//Example 5.34
	public static void ZeroSumTriplets2(int[] arr, int size) {
		int start, stop, i;
		Arrays.sort(arr);
		for (i = 0; i < (size - 2); i++) {
			start = i + 1;
			stop = size - 1;
			while (start < stop) {
				if (arr[i] + arr[start] + arr[stop] == 0) {
					System.out.println("Triplet :: " + arr[i] + arr[start] + arr[stop]);
					start += 1;
					stop -= 1;
				} 
				else if (arr[i] + arr[start] + arr[stop] > 0) {
					stop -= 1;
				}
				else {
					start += 1;
				}
			}
		}
	}
	//T(n) = O(n^2)
}