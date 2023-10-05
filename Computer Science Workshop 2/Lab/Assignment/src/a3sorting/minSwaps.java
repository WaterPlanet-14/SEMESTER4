package a3sorting;
public class minSwaps{
	public static void MinSwaps(int[] arr, int size,int val) {
		int count=0,left=0;
		int right=size-1;
		int temp;
		while(left<right) {
			if (arr[left]<val) {
				left++;
			}
			else if(arr[right]>val){
				right--;
			}
			else {
				temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
				count++;
			}	
		}
		System.out.println(count);
	}
	public static void main() {
		int arr[]= {1,6,8,3,4,2,6,9};
		MinSwaps(arr,arr.length,4);
	}
}
