package a3sorting;

public class q1 {
	public static void Sort012(int arr[],int size) {
		int count = 0;
		for (int i=0;i<size;i++) {
			for (int j=i+1;j<size;j++) {
				if(arr[j]<arr[i]) {
					int temp= arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					count++;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Count : " +count);
	}
	
	public static void main(String []args) {
		int []arr = {0,1,2,0,2,2,2,1,1,1,0,0,0};
		Sort012(arr,arr.length);
	}

}