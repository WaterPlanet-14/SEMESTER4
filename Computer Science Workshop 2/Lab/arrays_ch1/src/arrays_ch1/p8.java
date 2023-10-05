package arrays_ch1;
public class p8 {
	//Example 1.36
	public static void Sort1toN(int[] arr,int size){
		int curr,value,next;
		for(int i=0;i<size;i++) {
			curr=i;
			value=-1;
			while(curr<size && curr>=0 && arr[curr]!= curr+1) {//arr[i]>1 to prevent negative numbers
				next=arr[curr];
				arr[curr]=value;
				value=next;
				curr=next-1;
//				System.out.println("Swapped arr[i] = " + arr[i] + " and arr[temp-1] = " + arr[temp-1] );
//				for(int e:arr) {
//					System.out.print(e+" ");
//				}
			}
		}
	}
	//T(n) = O(n)
	
	
	//Example 1.37
	public static void Sort1toN2(int[] arr,int size){
		int temp;
		for(int i=0;i<size;i++) {
//			System.out.println();
//			System.out.println("i =  " +i + "\n");
//			for(int e:arr) {
//				System.out.print(e+" ");
//			}
			while(arr[i]!=i+1 && arr[i]>1) {//arr[i]>1 to prevent negative numbers
				temp=arr[i];
				arr[i]=arr[temp-1];
				arr[temp-1]=temp;
//				System.out.println("Swapped arr[i] = " + arr[i] + " and arr[temp-1] = " + arr[temp-1] );
//				for(int e:arr) {
//					System.out.print(e+" ");
//				}
			}
		}
	}
	//T(n) = O(n)
	
	public static void main(String[] args) {
		int[] arr = {8, 5, 6, 1, 9, 3, 2, 7, 4, 10};
		int size = arr.length;
		Sort1toN(arr, size);
		System.out.print("THE SORTED ARRAY IS : ");
		for(int e:arr) {
			System.out.print(e+" ");
		}
		System.out.println();
		Sort1toN2(arr, size);
		System.out.print("THE SORTED ARRAY IS : ");
		for(int e:arr) {
			System.out.print(e+" ");
		}
	}
	
}
