package arrays_ch1;


public class sort012 {
	public static void sort(int []arr,int size) {
		int left = 0;
		int right = size - 1;
		int i = 0;
		while (i <= right) {
			if (arr[i] == 0) {
				swap(arr, i, left);
				i += 1;
				left += 1;
			}
			else if (arr[i] == 2) {
				swap(arr, i, right);
				right -= 1;
			}
			else {	
					i += 1;
			}
		}
	}
	public static void  swap(int []arr,int a,int b) {
		int emp=arr[a];
		arr[a]=arr[b];
		arr[b]=emp;
	}
	public static void main(String[] args) {
		int[] arr = { 2,1,2,0,0,0,1,2,1,1,2,1,1 };
		int size=arr.length;
		sort(arr,size);
		for(int e:arr) {
			System.out.print(e+" ");
		}
		System.out.println();
	}
}
