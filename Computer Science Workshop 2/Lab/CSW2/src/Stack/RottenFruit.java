package Stack;

public class RottenFruit {
//	Example 7.35
	public static void RottenFruitUtil(int[][] arr, int maxCol, int maxRow, int currCol, int currRow, int[][] traversed,int day) { 
		if (currCol < 0 || currCol >= maxCol || currRow < 0 || currRow >= maxRow)
			return;
		// Traversable and rot if not already rotten.
		if (traversed[currCol][currRow] <= day || arr[currCol][currRow] == 0)
			return;
		// Update rot time.
		traversed[currCol][currRow] = day;
		RottenFruitUtil(arr, maxCol, maxRow, currCol - 1, currRow, traversed, day + 1);
		RottenFruitUtil(arr, maxCol, maxRow, currCol + 1, currRow, traversed, day + 1);
		RottenFruitUtil(arr, maxCol, maxRow, currCol, currRow + 1, traversed, day + 1);
		RottenFruitUtil(arr, maxCol, maxRow, currCol, currRow - 1, traversed, day + 1);
	}
	public static int rottenFruit(int[][] arr, int maxCol, int maxRow) {
		int[][] traversed = new int[maxCol][maxRow];
		for (int i = 0; i < maxCol; i++) {
			for (int j = 0; j < maxRow; j++) {
				traversed[i][j] = Integer.MAX_VALUE;
			}
		}
		for (int i = 0; i < maxCol - 1; i++) {
			for (int j = 0; j < maxRow - 1; j++) {
				if (arr[i][j] == 2)
					RottenFruitUtil(arr, maxCol, maxRow, i, j, traversed, 0);
			}
		}
		int maxDay = 0;
		for (int i = 0; i < maxCol - 1; i++) {
			for (int j = 0; j < maxRow - 1; j++) {
				if (arr[i][j] == 1) {
					if (traversed[i][j] == Integer.MAX_VALUE)
						return -1;
					if (maxDay < traversed[i][j])
						maxDay = traversed[i][j];
				}
			}
		}
		return maxDay;
	}
	public static void main(String[] args) {
		int arr[][] = { { 1, 0, 1, 1, 0 }, { 2, 1, 0, 1, 0 }, { 0, 0, 0, 2, 1 }, { 0, 2, 0, 0, 1 },{ 1, 1, 0, 0, 1 } };	
		System.out.println(rottenFruit(arr, 5, 5));
	}	
}
