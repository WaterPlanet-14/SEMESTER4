package Searching;
//Example 5.39
public class _39ArProgTriplets {
	public static void APTriplets(int arr[],int size) {
		int i,j,k;
		for (i=0;i<size;i++) {
			j=i-1;
			k=i+1;
			while (j>=0 && k<size) {
				if (arr[j]+arr[k]==arr[i]*2) {
					System.out.println("Triplets are :"+ arr[j] +" " + arr[i] + " " + arr[k]);
				}
				else if(arr[j] + arr[k] < 2 * arr[i]) {
					k += 1;
				}
				else {
					j -= 1;
				}
			}
		}
	}
}
//T(n) =  O(n log n)