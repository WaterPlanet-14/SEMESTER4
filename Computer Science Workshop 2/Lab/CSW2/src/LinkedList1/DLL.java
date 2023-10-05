package LinkedList1;

public class DLL {
	Node head;
	class Node{
		Node prev;
		Node next;
		int data;
		Node(int data){
			this.data = data;
		}
	}
	public  void addFirst(int data) {
		Node temp = new Node(data);
		if (head == null) {
			head = temp;
		}
		else {
			head.prev = temp;
			temp.next = head;
			head=temp;
		}
	}
	public void addLast(int data) {
		Node temp = new Node(data);
		Node curr = head;
		if (head == null) {
			head = temp;
		}
		else {
			while(curr.next != null) {
				curr = curr.next;
			}
			curr.next = temp;
			curr.prev=temp;
		}
	}
	public void print() {
		Node curr=head;
		if (head == null) {
			System.out.println("List is Empty");
		}
		else {
			while (curr != null) {
				System.out.println(curr.data);
				curr = curr.next;
			}
		}
	}
	public void RemoveFirst(){
		if (head == null) {
			System.out.println("List is Empty");
		}
		else {
			head = head.next;
			head.prev = null;
		}
	}
	public void RemoveLast(){
		Node curr= head;
		if (head == null) {
			System.out.println("List is Empty");
		}
		else {
			while (curr.next != null) {
				curr= curr.next;
			}
			curr.prev.next = null;
		}
	}
	public static void main(String args[]) {
		DLL dll = new DLL();
		dll.addFirst(1);
		dll.addFirst(5);
		dll.addFirst(7);
		System.out.println("The Double Linked List is :");
		dll.print();
		dll.RemoveFirst();
		dll.addLast(72);
		dll.addLast(86);
		dll.addLast(12);
		dll.RemoveLast();
		System.out.println("The Double Linked List is :");
		dll.print();

	}
}
