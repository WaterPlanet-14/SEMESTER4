package LinkedList1;
//Example 6.6
public class sortedInsert {
	public class Node {
		int data;
		Node next;
		Node (int data){
			this.data=data;
			this.next=null;
		}
	}
	public void SortInsert(int data) {
		Node head = null;
		Node newnode = new Node(data);
		Node curr = head;
		if(curr==null || curr.data> data) {
			newnode.next= head;
			head= newnode;
			return;
		}
	}
	public static void main(String args[]) {
		LL si=new LL();
		si.AddFirst(1);
		si.AddFirst(2);
		si.AddFirst(5);
		si.AddLast(7);
		si.AddLast(7);
		si.AddLast(9);
		si.Display();
//		si.SortInsert(3);
//		ll.Display();
	}
}
