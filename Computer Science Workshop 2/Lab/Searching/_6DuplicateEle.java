package Searching;

import java.util.Arrays;
import java.util.HashSet;

public class _6DuplicateEle {
	//Example 5.6
	public static void printRepeating(int[] arr,int size) {
		System.out.println("Repeating Elements are : ");
		for(int i=0;i<arr.length;i++) {
			for (int j=i+1; j<arr.length;j++) {
				if (arr[i] == arr[j] ) {
					System.out.print(arr[i] + " ");
					break;
				}
			}
		}
	}
	//T(n) = O(n ^ 2) , S(n) = O(1)
	
	//Example 5.7
	public static void printRepeating2(int[] arr, int size) {
		Arrays.sort(arr);
		System.out.println("Sorted Array is now : ");
		for (int e: arr) {
			System.out.print(e + " ");
		}
		System.out.println("\n");
		System.out.print("Repeating elements are ");
		for (int i = 1; i < size; i++) {
			if (arr[i] == arr[i - 1]) {
				System.out.print(" " + arr[i]);
			}
		}
	}
	//T(n) = O(n log n) , S(n) = O(1)

	//Example 5.8
	public static void printRepeating3(int[] arr, int size) {
		HashSet<Integer> hs = new HashSet<Integer>();
		System.out.print("Repeating elements are :");
		for (int i = 0; i < size; i++) {
			if (hs.contains(arr[i])) {
				System.out.print(" " + arr[i]);
			} 
			else {
				hs.add(arr[i]);
			}
		}
	}
	//T(n) = O(n) , S(n) = O(n)

	//Example 5.9
	public static void printRepeating4(int[] arr, int size, int range) {
		int[] count = new int[range];
		for (int i = 0; i < size; i++) {
			count[i] = 0;
		}
		System.out.print(" Repeating elements are ");
		for (int i = 0; i < size; i++) {
			if (count[arr[i]] == 1) {
				System.out.print(" " + arr[i]);
			}
			else {
				count[arr[i]]++;
			}
		}
	}
	//T(n) = O(n) , S(n) = O(n)
	
	public static void main(String []args) {
		int arr[]= {34, 56, 77, 1, 5, 6, 6, 6, 7, 8, 10, 34, 20, 30 };
//		printRepeating(arr,arr.length);
//		printRepeating2(arr,arr.length);
//		printRepeating3(arr,arr.length);
		printRepeating4(arr,arr.length,77);
		
	}
}
