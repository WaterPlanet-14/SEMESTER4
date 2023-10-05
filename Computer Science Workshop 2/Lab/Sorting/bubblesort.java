public class bubblesort {
	public static void sort(int arr[]) {
		int size=arr.length;
		int i,j,temp;
		for(i=0;i<(size-1);i++) {
			for(j=0;j<(size-1);j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				for(int k=0;k<arr.length;k++) {
					System.out.print(arr[k]+ " ");
				}
				System.out.println( );
			}
		}
	}
	public static void main(String args[]) {
		int[] array= {9,1,8,2,7,3,6,4,5};
		sort(array);
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+ " ");
		}
	}
}