package Queue;
import java.util.Stack;
public class QueueusingStack {
	Stack<Integer> stk1;
	Stack<Integer> stk2;
	public QueueusingStack() {
		stk1 = new Stack<Integer>();
		stk2 = new Stack<Integer>();
	}
 	void add(int value) {
		stk1.push(value);
	}
 	
 	int remove() {
 		int value;
 		if (stk2.isEmpty()==false) {
 			return stk2.pop();
 		}
 		while (stk1.isEmpty() == false) {
 			value = stk1.pop();
 			stk2.push(value);
 		}
 		return stk2.pop();
 	}
 	
 	public static void main(String args[]) {
 		QueueusingStack que = new QueueusingStack();
 		que.add(1);
 		que.add(3);
 		que.add(12);
 		que.add(8);
 		que.add(15);
 		System.out.println(que);
 		System.out.println(que.remove());
 		System.out.println(que.remove());
 		System.out.println(que.remove());
 	}
}
