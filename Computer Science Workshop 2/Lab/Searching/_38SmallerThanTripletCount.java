package Searching;
import java.util.Arrays;
//Example 5.38
public class _38SmallerThanTripletCount {
	public static void smallerthantripletcount(int arr[],int size,int value) {
		int start,stop;
		int count =0;
		Arrays.sort(arr);
		for (int i=0;i<size -2;i++) {
			start=i+1;
			stop = size-1 ;
			while (start<stop) {
				if (arr[i] + arr[start] + arr[stop] >= value)
					stop-=1;
				else {
					count += stop-start;
					start+= 1;
				}
			}
		}
		System.out.println(count);
	}
}
//T(n) = O(n^2)