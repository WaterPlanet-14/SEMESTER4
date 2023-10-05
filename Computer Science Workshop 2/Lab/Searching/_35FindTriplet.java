package Searching;
import java.util.Arrays;
public class _35FindTriplet {
//Example 5.35
	public static void findTriplet(int arr[], int size, int value) {
		for (int i = 0; i < (size - 2); i++) {
			for (int j = i + 1; j < (size - 1); j++) {
				for (int k = j + 1; k < size; k++) {
					if ((arr[i] + arr[j] + arr[k]) == value) {
						System.out.println("Triplet :: " + arr[i] + arr[j] + arr[k]);
					}
				}
			}
		}
	}
//T(n) = O(n^3)
	
//Example 5.36
	public static void findTriplet2(int arr[], int size, int value) {
		int start, stop;
		Arrays.sort(arr);
		for (int i = 0; i < size - 2; i++) {
			start = i + 1;
			stop = size - 1;
			while (start < stop) {
				if (arr[i] + arr[start] + arr[stop] == value) {
					System.out.println("Triplet ::" + arr[i] + arr[start] + arr[stop]);
					start += 1;
					stop -= 1;
				} 
				else if (arr[i] + arr[start] + arr[stop] > value)
					stop -= 1;
				else
					start += 1;
			}
		}
	}
}
//T(n) = O(n^2)