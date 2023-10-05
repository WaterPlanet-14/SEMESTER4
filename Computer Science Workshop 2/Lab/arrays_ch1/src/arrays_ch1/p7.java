package arrays_ch1;

public class p7 {
	public static void indexArray(int[] arr, int size){
		int temp;
		for (int i = 0; i < size; i++){
			while (arr[i] != -1 && arr[i] != i){
				temp = arr[i];
				arr[i] = arr[temp];
				arr[temp] = temp;
				for(int e:arr) {
					System.out.print(e+" ");
				}
				System.out.println();
			}
		}
	}
	public static void main(String[] args) {
		int[] arr = {8, -1, 6, 1, 9, 3, 2, 7, 4, -1};
		int size = arr.length;
		indexArray(arr, size);
		for(int e:arr) {
			System.out.print(e+" ");
		}
	}
}
