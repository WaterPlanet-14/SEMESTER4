package Searching;
import java.util.Arrays;
//Example 5.18
public class _18SumDistinct {
	public static void sumDistinct(int[] arr, int size) {
		int sum = 0;
		Arrays.sort(arr);
		for (int i = 0; i < (size - 1); i++) {
		if (arr[i] != arr[i + 1])
		sum += arr[i];
		}
		sum += arr[size - 1];
		System.out.println(sum);
	}
	public static void main(String args[]) {
		int arr[]= {1,-6,5,9,-3,6,-5,-1,4};
		int size=arr.length;
		sumDistinct(arr,size);
	}
	//T(n) = O(n) ,S(n) = O(1)
}
