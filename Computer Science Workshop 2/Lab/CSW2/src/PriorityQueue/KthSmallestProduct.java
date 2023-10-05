package PriorityQueue;

import java.util.PriorityQueue;

public class KthSmallestProduct {
	public static int kthSmallestProduct(int[] arr, int size, int k) {
		int i = 0;
		int product = 1;
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for (i = 0; i < size; i++) {
			pq.add(arr[i]);
		}
		i = 0;
		while (i < size && i < k) {
			product *= pq.remove();
			i += 1;
		}
		return product;
	}
	
	public static void main(String args[]) {
		int arr[] = {12,6,4,8,11,1,2,7,9,3,5};
		int size = arr.length;
		int k= 3;
		System.out.println(kthSmallestProduct(arr,size,k));
	}
}
