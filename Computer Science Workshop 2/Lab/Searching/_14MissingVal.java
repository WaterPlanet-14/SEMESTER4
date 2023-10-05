package Searching;
import java.util.Arrays;
import java.util.HashSet;
public class _14MissingVal {
//Example 5.14
	public static void MissingValues(int[] arr, int size) {
		Arrays.sort(arr);
		int value = arr[0];
		int i = 0;
		while (i < size) {
			if (value == arr[i]) {
				value += 1;
				i += 1;
			} 
			else {
				System.out.println(value);
				value += 1;
			}
		}
	}
//T(n) = O(n log n)

//Example 5.15
	public static void MissingValues2(int[] arr, int size) {
		HashSet<Integer> ht = new HashSet<Integer>();
		int minVal = 999999;
		int maxVal = -999999;
		for (int i = 0; i < size; i++) {
			ht.add(arr[i]);
			if (minVal > arr[i])
				minVal = arr[i];
			if (maxVal < arr[i])
				maxVal = arr[i];
		}
		for (int i = minVal; i < maxVal + 1; i++) {
			if (ht.contains(i) == false) {
				System.out.println(i);
			}
		}
	}
//T(n) = O(n) , S(n) = O(n)
}
