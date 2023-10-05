package arrays_ch1;

public class p10 {
	
	//Example 1.41
	public static void MaxMinArr(int arr[], int size) {
		int[] aux = new int[size];
		for (int i = 0; i < size; i++) {
			aux[i] = arr[i];
		}
		int start = 0;
		int stop = size - 1;
		for (int i = 0; i < size; i++) {
			if (i % 2 == 0) {
				arr[i] = aux[stop];
				stop -= 1;
			} 
			else {
				arr[i] = aux[start];
				start += 1;
			}
		}
		for(int e:arr) {
			System.out.print(e+" ");
		}
		System.out.println();
	}
	//T(n) = O(n)
	//S(n) = O(n)
	
	public static void reverseArray(int[] a, int start, int end) {
		for (int i = start, j = end; i < j; i++, j--) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		}
	}
	
	//Example 1.43
	public static void MaxMinArr2(int[] arr,int size) {
		for(int i=0;i<size;i++) {
			reverseArray(arr,i,size-1);
		}
		for(int e:arr) {
			System.out.print(e+" ");
		}
		System.out.println();
	}
	//T(n) = O(n^2)
	//S(n) = O(1)
	
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int size = arr.length;
		MaxMinArr(arr, size);
		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7 };
		int size1 = arr1.length;
		MaxMinArr2(arr1,size1);
	}
}