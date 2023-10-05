package PriorityQueue;

import java.util.PriorityQueue;

public class KthSmallest {
//	Example 10.9:
		public static int kthSmallest(int[] arr, int size, int k) {
		int i = 0;
		int value = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for (i = 0; i < size; i++) {
		pq.add(arr[i]);
		}
		i = 0;
		while (i < size && i < k) {
		value = pq.remove();
		i += 1;
		}
		return value;
		}
		public static int KthLargest(int[] arr, int size, int k) {
			int i = 0;
			int value = 0;
			PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
			for (i = 0; i < size; i++) {
			pq.add(arr[i]);
			}
			i = 0;
			while (i < size && i < k) {
			value = pq.remove();
			i += 1;
			}
			return value;
		}
		
		public static void main(String args[]) {
			int arr[] = {12,6,4,8,11,1,2,7,9,3,5};
			int size = arr.length;
			int k= 3;
			System.out.println(kthSmallest(arr,size,k));
		}
}
