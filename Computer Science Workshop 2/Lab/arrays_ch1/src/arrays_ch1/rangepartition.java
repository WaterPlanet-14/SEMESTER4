package arrays_ch1;

public class rangepartition {
	public static void RangePartition(int[] arr, int size, int lower, int higher) {
		int start = 0;
		int end = size - 1;
		int i = 0;
		while (i <= end) {
		if (arr[i] <= lower) {
		swap(arr, i, start);
		i += 1;start += 1;
		} else if (arr[i] >= higher) {
		swap(arr, i, end);
		end -= 1;
		} else {
		i += 1;
		}
		}
		}
		// Testing code
	public static void  swap(int []arr,int a,int b) {
		int emp=arr[a];
		arr[a]=arr[b];
		arr[b]=emp;
	}
		public static void main(String[] args) {
		int arr[] = { 1, 21, 2, 20, 3, 19, 4, 18, 5, 17, 6, 16 , 9, 7, 15, 8, 14, 13, 10, 11
		};
		RangePartition(arr, arr.length, 9, 14);
		for(int e:arr) {
			System.out.print(e+" ");
		}
		System.out.println();
		}
}
