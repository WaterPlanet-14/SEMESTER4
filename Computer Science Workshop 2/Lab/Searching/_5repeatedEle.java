package Searching;
public class _5repeatedEle {
	public static void main(String []args) {
		int arr[]= {34, 56, 77, 1, 5, 6, 6, 6, 7, 8, 10, 34, 20, 30 };
		int x=ElementRepeat(arr,arr.length);
		System.out.println(x);
	}
	
	//Example 5.5
	public static int ElementRepeat(int arr[],int size) {	
		for(int i=0;i<arr.length;i++) {
			for (int j=i+1; j<arr.length;j++) {
				if (arr[i] == arr[j] ) {
					return arr[i];
				}
			}
		}
		return 0;
	}
	//T(n) = O(n ^ 2) , S(n) = O(1)
}
