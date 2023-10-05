package LinkedList1;
public class LL {
	public class Node {
		int data;
		Node next;
		Node (int data,Node n){
			this.data=data;
			this.next=n;
		}
	}
	Node head;
	public void copyreverse() {
		Node temp = null;
		Node temp2 = null;
		Node curr = head;
		while (curr != null) {
			temp2 = new Node(curr.data,temp);
			curr = curr.next;
			temp = temp2;
		}
		LL ll2 = new LL();
		ll2.head = temp;
		ll2.Display();
	}
	
	public void reverse() {
		Node curr = head;
		Node prev = null;
		Node next = null;
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
	}
	public void AddFirst(int data) {
		Node newnode = new Node(data,null) ;
		if (head==null) {
			head=newnode;
			return;
		}
		newnode.next=head;
		head=newnode;
	}
	
	public void AddLast(int data) {
		Node newnode= new Node(data,null);
		Node currnode = head;
		if (head==null)
			head=newnode;
		while(currnode.next != null)
			currnode = currnode.next;
		currnode.next = newnode;
	}
	
	public void Display() {
		Node currnode = head;
		if (currnode==null) {
			System.out.println("The Linked List is empty. ");			
		}
		while(currnode!= null){
			System.out.print(currnode.data + " --> ");
			currnode = currnode.next;
		}
		System.out.println("Null");
	}
	
	public void DeleteLast() {
		Node secondlast = head;
		Node last = head.next;
		if (secondlast == null) {
			return;
		}
		if(last==null) {
			head=null;
			System.out.println("Element Deleted");
			return;
		}
		while(last.next != null) {
			secondlast = secondlast.next;
			last=last.next;
		}
		secondlast.next = null;
	}
	
	public void DeleteFirst() {
		Node currnode = head;
		if(currnode == null) {
			System.out.println("Linked List is already empty. ");
			return;
		}
		if(head != null) {
			head = head.next;
		}
	}
	
	public static void main(String args[]) {
		LL ll=new LL();
		ll.AddFirst(1);
		ll.AddFirst(2);
		ll.AddFirst(5);
		ll.AddLast(4);
		ll.AddLast(7);
		ll.AddLast(3);
		ll.Display();
//		ll.DeleteFirst();
//		ll.DeleteFirst();
//		ll.Display();
//		ll.DeleteLast();
//		ll.DeleteLast();
//		ll.Display();
//		ll.DeleteFirst();
//		ll.Display();
//		ll.DeleteLast();
//		ll.Display();
//		ll.reverse();
//		ll.Display();
		ll.copyreverse();
	}
}
