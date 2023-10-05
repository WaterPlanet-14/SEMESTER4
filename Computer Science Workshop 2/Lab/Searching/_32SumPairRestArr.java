package Searching;
import java.util.Arrays;
//Example 5.32
public class _32SumPairRestArr {
	public static boolean SumPairRestArray(int[] arr, int size) {
		int total, low, high = 0, curr, value;
		Arrays.sort(arr);
		total = 0;
		for (int i = 0; i < size; i++) {
			total += arr[i];
		}
		value = total / 2;
		low = 0;
		high = size - 1;
		while (low < high) {
			curr = arr[low] + arr[high];
			if (curr == value) {
				System.out.println("Pair is :: " + arr[low] + arr[high]);
				return true;
			}
			else if (curr < value) {
				low += 1;
			}
			else {
				high -= 1;
			}
		}
		return false;
	}
}
//T(n) = O(n log n)