package LinkedList1;
public class CircularLL {
	class Node{
		Node next;
		int data;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	Node head;
	Node tail;
	
	public void addFirst(int data) {
		Node temp = new Node(data);
		if (head==null) {
			head = temp;
			tail = temp;
		}
		else {
			temp.next = head;
			head = temp;
			tail.next = head;
		}
	}
	
	public void print() {
		Node curr = head;
		if (head == null) {
			System.out.println(" The List is empty");
		}
		else {
			do {
				System.out.println(curr.data);
				curr=curr.next;
			}while(curr != head);		
		}
	}
	public void addLast(int data) {
		Node temp = new Node (data);
		if (head == null) {
			head = temp;
			tail = temp;
		}
		else {
			tail.next = temp;
			tail = temp;
			temp.next = head;
		}
	}
	public static void main(String args[]) {
		CircularLL cll = new CircularLL();
		cll.addFirst(1);
		cll.addFirst(5);
		cll.addFirst(7);
		System.out.println("The Circular Linked List is :");
		cll.print();
//		cll.RemoveFirst();
		cll.addLast(72);
		cll.addLast(86);
		cll.addLast(12);
//		cll.RemoveLast();
		System.out.println("Circular Linked List is :");
		cll.print();

	}
}
