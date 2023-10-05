package arrays_ch1;

public class p13 {
	//Example 1.47
	public static int maxPathSum(int[] arr1, int size1, int[] arr2, int size2) {
		int i = 0, j = 0, result = 0, sum1 = 0, sum2 = 0;
		while (i < size1 && j < size2) {
			if (arr1[i] < arr2[j]) {
				sum1 += arr1[i];
				i += 1;
			}
			else if (arr1[i] > arr2[j]) {
				sum2 += arr2[j];
				j += 1;
			}
			else {
				result += Math.max(sum1, sum2);
				result = result + arr1[i];
				sum1 = 0;
				sum2 = 0;
				i += 1;
				j += 1;
			}
		}
		while (i < size1) {
			sum1 += arr1[i];
			i += 1;
		}
		while (j < size2) {
			sum2 += arr2[j];
			j+= 1;
		}
		result += Math.max(sum1, sum2);
		return result;
	}
	//T(n) = O(n)
	//S(n) = O(n)
	
	public static void main(String[] args) {
		int[] arr1 = { 12, 13, 18, 20, 22, 26, 70 };
		int[] arr2 = { 11, 15, 18, 19, 20, 26, 30, 31 };
		System.out.println("Max Path Sum :: " + maxPathSum(arr1, arr1.length,arr2, arr2.length));
	}
}
