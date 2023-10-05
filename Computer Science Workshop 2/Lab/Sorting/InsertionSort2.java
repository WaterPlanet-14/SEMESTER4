public class InsertionSort2 {
	public static void sort(int arr[]){
		int n = arr.length;
		for (int i = 1; i < n; i++) {	
			int j = i - 1;
			int key= arr[i];
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}
	public static void main(String args[]){
		int arr[] = { 12, 11, 13, 5, 6 };
		sort(arr);
		for(int e : arr) {
			System.out.print(e+ " ");
		}
	}
}
