package Queue;
import java.util.ArrayDeque;
public class MaxSlidingWindow {
	public static void MaxSlide(int arr[],int size,int k) {
		ArrayDeque<Integer> que = new ArrayDeque<Integer>();
		for(int i = 0;i<size;i++) {
		if(que.size()>0 && que.peek()<= (i-k))
			que.remove();
		while(que.size() > 0 && arr[que.peekLast()] <= arr[i])
			que.removeLast();
		que.add(i);
		if(i>= (k-1)) 
			System.out.println(arr[que.peek()]);
		}
	}
	public static void main(String[] args) {
		int arr[] = { 11, 2, 75, 92, 59, 90, 55 };
		int k = 3;
		MaxSlide(arr,arr.length,k);
	}
}
