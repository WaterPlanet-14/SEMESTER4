package Stack;
public class MaxRectArea {
	//Example 7.29
	public static int GetMaxArea(int[] arr) {
		int size = arr.length;
		int maxArea = -1;
		int currArea;
		int minHeight = 0;
		for (int i = 1; i < size; i++) {
			minHeight = arr[i];
			for (int j = i - 1; j >= 0; j--) {
				if (minHeight > arr[j]) {
					minHeight = arr[j];
				}
				currArea = minHeight * (i - j + 1);
				if (maxArea < currArea) {
					maxArea = currArea;
				}
			}
		}
		return maxArea;
	}
	public static void main(String[] args) {
		int[] arr = { 7, 6, 5, 4, 4, 1, 6, 3, 1 };
//		int size = arr.length;
		int value = GetMaxArea(arr);
		System.out.println("GetMaxArea : " + value);
		int value2 = GetMaxArea2(arr);
		System.out.println("GetMaxArea : " + value2);
	}
	//Example 7.30
	public static int GetMaxArea2(int[] arr) {
		int size = arr.length;
		Stack stk = new Stack();
		int maxArea = 0;
		int top;
		int topArea;
		int i = 0;
		while (i < size) {
			while ((i < size) && (stk.isEmpty() || arr[stk.peek()] <= arr[i])) {
				stk.push(i);
				i++;
			}
			while (!stk.isEmpty() && (i == size || arr[stk.peek()] > arr[i])) {
				top = stk.peek();
				stk.pop();
				topArea = arr[top] * (stk.isEmpty() ? i : i - stk.peek() - 1);
				if (maxArea < topArea) {
					maxArea = topArea;
				}
			}
		}
		return maxArea;
	}
}
