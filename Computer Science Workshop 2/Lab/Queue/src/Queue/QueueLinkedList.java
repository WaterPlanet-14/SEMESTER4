package Queue;
class Node{
	Node next;
	int info;
	Node(int info){
		this.info = info;
	}
}
public class QueueLinkedList {
	static Node front,rear;
	
	public static void Insert(int info) {
//		if(front==null) {
//			front=new Node(info);
//			front=rear;
//		}
//		else {
//			Node a=new Node(info);
//			Node t=front;
//			while(t.next != null) {
//				t =t.next;
//			}
//			t.next =a;
//			rear = a;
//		}
		Node temp = new Node(info);
		if (rear == null){
		rear = temp;
		rear.next = rear;
		} else {
		temp.next = rear.next;
		rear.next = temp;
		rear = temp;
		}
	}
	public static void display() {
		
		if(front==null) {
			System.out.println("Nothing to display");
		}
		else {
			Node a=front;
			while(a.next!=null) {
				System.out.println(a.info+" ");
				a=a.next;
			}
		}
	}
	public static void main(String args[]) {
		Insert(1);
		Insert(2);
		Insert(3);
		Insert(4);
		Insert(5);
		display();
		
		
	}
}
