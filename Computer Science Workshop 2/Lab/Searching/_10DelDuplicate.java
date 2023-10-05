package Searching;
import java.util.Arrays;
import java.util.HashSet;
public class _10DelDuplicate {
//Example 5.10
	public static int[] removeDuplicates(int[] array, int size) {
		int j = 0;
		Arrays.sort(array);
		for (int i = 1; i < size; i++) {
			if (array[i] != array[j]) {
				j++;
				array[j] = array[i];
			}
		}
		int[] ret = Arrays.copyOf(array, j + 1);
		return ret;
	}
//T(n) = O(n log n) , S(n) = O(1)
	

	public static void removeDuplicates2(int[] arr, int size) {
		HashSet<Integer> hs = new HashSet<Integer>();
		for (int i = 0; i < size; i++) {
			if (hs.contains(arr[i])) {
				
			} 
			else {
				hs.add(arr[i]);
			}
		}
		System.out.print("Duplicate Elements are removed Successfully . \nThe array now is ");
		for (int e: hs) {
			System.out.print(e + " ");
		}
	}
	//T(n) = O(n) , S(n) = O(n)	

	public static void main(String []args) {
		int arr[]= {34, 56, 77, 1, 5, 6, 6, 6, 7, 8, 10, 34, 20, 30 };
//		int x[]=removeDuplicates(arr,arr.length);
//		for (int e: x) {
//			System.out.print(e + " ");
//		}
		removeDuplicates2(arr,arr.length);
	}
}
