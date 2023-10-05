import java.util.Scanner;
//Example 4.15
public class Equationsort {
	public static void EqBubbleSort(int[] arr, int size, int ref) {
		for (int i = 0; i < (size - 1); i++) {
			for (int j = 0; j < (size - i - 1); j++) {
				if (AbsMore(arr[j], arr[j + 1], ref)) {
					int temp = arr[j] ;
					arr[j] = arr[j+1] ;
					arr[j+1] = temp ;
				}
			}
		}
	}
	public static boolean AbsMore(int value1, int value2, int A) {
		value1 = A * value1 * value1;
		value2 = A * value2 * value2;
		return value1 > value2;
	}
	public static void main(String[] args) {
		int array[] = { 9, 1, 8, 2, 7, 3, 6, 4, 5 };
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of A : ");
		int A = sc.nextInt();
		int s = array.length;
		EqBubbleSort(array, s , A);
		for (int e: array) {
			System.out.println(e);
		}
		sc.close();
	}
}