package Searching;
import java.util.Arrays;
public class _19MinAbsSumPair {
	//Example 5.19
	public static void minAbsSumPair(int[] arr, int size) {
		int l, r, minSum, sum, minFirst, minSecond;
		
		if (size < 2) {System.out.println("Invalid Input");
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
		System.out.println(" Minimum sum elements are : " + arr[minFirst] + " , " +arr[minSecond] );
	}
	//T(n) = O(n^2) ,S(n) = O(1)
	
	//Example 5.20
	public static void minAbsSumPair2(int[] arr, int size) {
		int l, r, minSum, sum, minFirst, minSecond;
		// Array should have at least two elements
		if (size < 2) {
			System.out.println("Invalid Input");
			return;
		}
		Arrays.sort(arr);
		minFirst = 0;
		minSecond = size - 1;
		minSum = Math.abs(arr[minFirst] + arr[minSecond]);
		System.out.println(minFirst + " " + minSecond + " " + minSum );
		for (l = 0, r = size - 1; l < r;) {
			sum = (arr[l] + arr[r]);
			System.out.println(sum);
			if (Math.abs(sum) < minSum) {
				minSum = Math.abs(sum);
				minFirst = l;
				minSecond = r;
			}
			if (sum < 0) {
				l++;
			} 
			else if (sum > 0) {
				r--;
			} 
			else {
				break;
			}
		}
		System.out.println(" Minimum sum pair : " + arr[minFirst] + " , " +arr[minSecond]);
	}	
	public static void main(String args[]) {
		int arr[]= {1,-6,5,9,-3,6,-5,-1,4};
		int size=arr.length;
		minAbsSumPair2(arr,size);
	}
	//T(n) = O(n log n) ,S(n) = O(1)
}


