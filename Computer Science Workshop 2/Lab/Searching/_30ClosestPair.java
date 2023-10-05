package Searching;
import java.util.Arrays;
public class _30ClosestPair {
//Example 5.30
	public static void closestPair(int arr[], int size, int value) {
		int diff = 999999;
		int first = -1;
		int second = -1;
		int curr;
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				curr = Math.abs(value - (arr[i] + arr[j]));
				if (curr < diff) {
					diff = curr;
					first = arr[i];
					second = arr[j];
				}
			}
		}
		System.out.println("closest pair is ::" + first + second);
	}
	//T(n) = O(n^2)
	
//Example 5.31
	public static void ClosestPair2(int arr[], int size, int value) {
		int first = 0, second = 0;
		int start = 0;
		int stop = size - 1;
		int diff, curr;
		Arrays.sort(arr);
		diff = 9999999;
		while (start < stop) {
			curr = (value - (arr[start] + arr[stop]));
			if (Math.abs(curr) < diff) {
				diff = Math.abs(curr);
				first = arr[start];
				second = arr[stop];
			}
			if (curr == 0) {
				break;
			} 
			else if (curr > 0) {
				start += 1;
			} 
			else {
				stop -= 1;
			}
		}
	System.out.println("closest pair is :: " + first + second);
	}
	//T(n) = O(n log n)
}
