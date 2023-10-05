public class InsertionSort {
	public static void sort(int[] arr) {
		int size = arr.length;
		int i,j,value;
		for (i = 1; i < size; i++) {
			value = arr[i];
			for (j = i; j > 0 && (arr[j - 1]> value); j--) {
				arr[j] = arr[j - 1];
			}
			arr[j] = value;
		}
	}
	
	public static void main(String[] args) {
		int[] array = { 9, 1, 8, 2, 7, 3, 6, 4, 5 };
		sort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}