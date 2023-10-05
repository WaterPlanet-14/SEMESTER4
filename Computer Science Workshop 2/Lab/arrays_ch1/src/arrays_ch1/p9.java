package arrays_ch1;

import java.util.HashMap;

public class p9 {
	//Example 1.38
	public static void /* int */ SmallestPositiveMissingNumber(int []arr,int size) {
		for (int i=1;i<size+1;i++) {
			int flag=0;
			for (int j=0;j<size;j++) {
				if(arr[j]==i) {
					flag=1;
					break;
				}
			}
			if (flag==0) {
				System.out.println("Missing Number : " + i );
				/* return i; */
			}
			/* return -1; */
		}
	}
	//T(n) = O(n^2)
	
	//Example 1.39
	public static int SmallestPositiveMissingNumber2(int[] arr, int size){
		HashMap<Integer, Integer> hs = new HashMap<Integer, Integer>();
		for(int i = 0;i< size; i++) {
			hs.put(arr[i], 1);
		}
		for(int i=1;i< size+1; i++) {
			if (hs.containsKey(i) == false){
				return i;
			}
		}
		return -1;
	}
	//T(n) = O(n)
	//S(n) = O(n)
	
	//Example 1.40
	public static int SmallestPositiveMissingNumber3(int[] arr, int size){
		int[] aux = new int[20];
		for (int i=0;i<size;i++) {
			aux[i]= -1;
		}
		for (int i = 0; i < size; i++){
			if (arr[i] > 0 && arr[i] <= size) {
				aux[arr[i] - 1] = arr[i];
			}
		}
		for (int i = 0; i < size; i++){
			if (aux[i] != i + 1){
				return i + 1;
			}
		}
		return -1;
	}
	//T(n) = O(n)
	//S(n) = O(n)
	
	//Example 1.41
	public static int SmallestPositiveMissingNumber4(int[] arr, int size){
		int temp;
		for (int i = 0; i < size; i++){
			while (arr[i] != i + 1 && arr[i] > 0 && arr[i] <= size){
				temp = arr[i];
				arr[i] = arr[temp - 1];
				arr[temp - 1] = temp;
			}
		}
		for (int i = 0; i < size; i++){
			if (arr[i] != i + 1)
				return i + 1;
		}
		return -1;
	}
	//T(n) = O(n)
	//S(n) = O(n)
	
	public static void main(String[] args) {
		int[] arr = {8, 5, 1, 1, 9, 11, 2, 7, 4, 10};
		int size = arr.length;
		SmallestPositiveMissingNumber(arr, size);
		
		System.out.println( "Smallest positive missing number is : " +
		SmallestPositiveMissingNumber2(arr, size));
		
		System.out.println( "Smallest positive missing number is : " +
		SmallestPositiveMissingNumber3(arr, size));
		
		System.out.println( "Smallest positive missing number is : " +
		SmallestPositiveMissingNumber4(arr, size));

	}

}
