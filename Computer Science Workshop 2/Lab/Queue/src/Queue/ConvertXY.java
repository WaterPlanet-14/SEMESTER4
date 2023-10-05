package Queue;
import java.util.ArrayDeque;
public class ConvertXY {
	public static int convertXY(int src,int dst) {
		ArrayDeque<Integer> que = new ArrayDeque<Integer>();
		int steps =0;
		int value;
		que.add(src);
		while(que.size() != 0) {
			value =que.remove();
			if (value == dst) {
				return steps;
			}
		 	steps++;
			if (value < dst)
				que.add(value * 2);
			else
				que.add(value - 1);
		}
		return -1;
	}
	
	public static int convertXY2(int x,int y) {
		int steps = 0; 
		while(x<y) {
			x*=2;
			steps++;
		}
		return steps + (x - y);
	}
	
	public static void main(String[] args) {
		System.out.println(convertXY(2, 7));
		System.out.println(convertXY2(2, 7));
		
	}
}