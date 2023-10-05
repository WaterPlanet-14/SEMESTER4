public class partition0and1 {
	public static int partition01(int []arr,int size) {
		int low=0;
		int high=size-1;
		int count=0;
		while (low<high) {
			while (arr[low] == 0) {
				low += 1;
				while (arr[high] == 1)
					high -= 1;
					if (low < high) {
						int temp=arr[low];
						arr[low]=arr[high];
						arr[high]=temp;
						count += 1;
					}
				}
			}
		return count;	
	}
}

