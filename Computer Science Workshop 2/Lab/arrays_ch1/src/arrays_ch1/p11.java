package arrays_ch1;

public class p11 {
	
	//Example 1.44
	public static int maxCircularSum(int[] arr, int size){
		int sumAll = 0;
		int currVal = 0;
		int maxVal;
		for(int i = 0; i< size ; i++){
			sumAll += arr[i];
			currVal += (i*arr[i]);
		}
		maxVal = currVal;
		for(int i= 1; i< size; i++){
			currVal = ( currVal + sumAll ) - ( size * arr[size-i] );
			if (currVal > maxVal){
				maxVal = currVal;
			}
		}
		return maxVal;
	}
	//T(n) = O(n)
	//S(n) = O(1)
	
	public static void main(String[] args) {
		int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		System.out.println("MaxCirculrSm: " + maxCircularSum(arr, arr.length));
	}
}

	