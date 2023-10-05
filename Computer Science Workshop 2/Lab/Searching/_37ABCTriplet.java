package Searching;

import java.util.Arrays;

//Example 5.37
public class _37ABCTriplet {
	public static void abcTriplet(int[] arr, int size) {
		int j,k;
		Arrays.sort(arr);
		for (int i=0;i<size -2;i++) {
			j=i+1;
			k=size-1;
			while(j<k) {
				if (arr[i] == arr[j] + arr[k]) {
					System.out.println("Triplet ::%d, %d, %d" + arr[i] + arr[j] + arr[k]);
					j+= 1;
					k-= 1;
				}
				else if (arr[i] > arr[j] + arr[k]) {
					k-= 1;
				}	
				else {
					j += 1;
				}
			}
		}
	}
}
//T(n) = O(n^2)
