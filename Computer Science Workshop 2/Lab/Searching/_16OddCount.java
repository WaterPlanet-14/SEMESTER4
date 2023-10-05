package Searching;
import java.util.HashMap;
//Example 5.16
public class _16OddCount {
	public static void OddCount(int[] arr, int size) {
		HashMap<Integer, Integer> ctr = new HashMap<Integer, Integer>();
		int count = 0;
		for (int i = 0; i < size; i++) {
			if (ctr.containsKey(arr[i]))
				ctr.put(arr[i], ctr.get(arr[i]) + 1);
			else
				ctr.put(arr[i], 1);
		}
		for (int i = 0; i < size; i++) {
			if (ctr.containsKey(arr[i]) && (ctr.get(arr[i]) % 2 == 1)) {
				System.out.println(arr[i]);
				count++;
				ctr.remove(arr[i]);
			}
		}
		System.out.println("Odd count is :: " + count);
	}
}
//T(n) = O(n) , S(n) = O(n)