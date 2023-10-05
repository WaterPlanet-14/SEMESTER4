package arrays_ch1;

public class p5 {
	public static int maxSubArraySum(int[] a,int size) {
		int maxSoFar=0,maxEndingHere=0;
		for (int i=0;i<size;i++) {
			maxEndingHere+= a[i];
			System.out.println(maxEndingHere);
			if(maxEndingHere<0) {
				maxEndingHere=0;
			}
			if(maxSoFar<maxEndingHere) {
				System.out.println(maxSoFar);
				maxSoFar=maxEndingHere;
				System.out.println(maxSoFar);
			}
			System.out.println();
		}
		return maxSoFar;
	}
	public static void main(String[] args) {
		int arr[]= {1,-2,3,4,-4,6,-4,3,2};
		System.out.println("Max sub array sum : " +maxSubArraySum(arr,9));
	}
}