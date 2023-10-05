package Searching;
import java.util.Arrays;
public class _28MinAbsSumArr {
//Example 5.28
	public static void minAbsSumPair(int[] arr, int size) {
		int l, r, minSum, sum, minFirst, minSecond;
		if (size < 2) {
			System.out.println("Invalid Input");
			return;
		}
		minFirst = 0;
		minSecond = 1;
		minSum = Math.abs(arr[0] + arr[1]);
		for (l = 0; l < size - 1; l++) {
			for (r = l + 1; r < size; r++) {
				sum = Math.abs(arr[l] + arr[r]);
				if (sum < minSum) {
					minSum = sum;
					minFirst = l;
					minSecond = r;
				}
			}
		}
		System.out.println(" Minimum sum elements are : " + arr[minFirst] + " , " + arr[minSecond]);
		}
		//T(n) = O(n^2)
		
//Example 5.29
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
