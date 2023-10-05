package Searching;
import java.util.HashSet;
public class _11MissingNum {
//Example 5.11
	public static int findMissingNumber(int[] arr, int size) {
		int i, j, found = 0;
		for (i = 1; i <= size; i++) {
			found = 0;
			for (j = 0; j < size; j++) {
				if (arr[j] == i) {
					found = 1;
					break;
				}
			}
			if (found == 0) {
				return i;
			}
		}
		return Integer.MAX_VALUE;
	}
//T(n) = O(n ^ 2) , S(n) = O(1)
	
//Example 5.12
	public static int findMissingNumber2(int[] arr, int size, int range) {
		int i;
		int xorSum = 0;
		// get the XOR of all the numbers from 1 to range
		for (i = 1; i <= range; i++) {
			xorSum ^= i;
		}
		// loop through the array and get the XOR of elements
		for (i = 0; i < size; i++) {
			xorSum ^= arr[i];
		}
		return xorSum;
	}
//T(n) = O(n) , S(n) = O(1)
	
//Example 5.13
	public static int findMissingNumber3(int[] arr, int size, int upperRange) {
		HashSet<Integer> st = new HashSet<Integer>();
		int i = 0;
		while (i < size) {
			st.add(arr[i]);
			i += 1;
		}
		i = 1;
		while (i <= upperRange) {
			if (st.contains(i) == false)
				return i;
			i += 1;
		}
		System.out.println("NoNumberMissing");
		return -1;
	}
//T(n) = O(n) , S(n) = O(n)
	
	public static void main(String []args) {
		int arr[]= {34, 56, 77, 1, 5, 6, 6, 6, 7, 8, 10, 34, 20, 30 };
		findMissingNumber(arr,arr.length);
//		findMissingNumber2( arr , arr.length);
//		findMissingNumber3( arr, arr.length);
	}
}
