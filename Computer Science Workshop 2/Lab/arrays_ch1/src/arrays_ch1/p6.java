package arrays_ch1;
public class p6{
	public static void WaveArray(int[] arr) {
		int size=arr.length;
		for(int i=1;i<size;i+=2) {
			if((i-1)>=0 && arr[i]>arr[i-1]) {
				swap(arr,i,i-1);
			}
			if((i+1)<size && arr[i]> arr[i+1]) {
				swap(arr,i,i+1);
			}
		}
	}
	public static void swap(int arr[],int a,int b) {
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	public static void main(String[] args) {
		int[] arr = {8, 1, 2, 3, 4, 5, 6, 4, 2};
		WaveArray(arr);
		for(int e:arr) {
			System.out.print(e+" ");
		}
		
		}
}
