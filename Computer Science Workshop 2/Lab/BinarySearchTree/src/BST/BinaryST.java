package BST;
public class BinaryST {
	Node root;
	static class Node {
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data = data;
		}
	}
	public void Insert(int data) {
		root = InsertRec(root,data);
	}
	
	public Node InsertRec(Node node,int data) {
		if (node == null) {
			node = new Node(data);
		}
		else {
			if(node.data > data) {
				node.left = InsertRec(node.left,data);
			}
			else {
				node.right = InsertRec(node.right,data);
			}
		}
		return node;
	}
	
	public void InOrder(Node root) {
		if (root == null) {
			return;
		}
		else {
			InOrder(root.left);
			System.out.print(root.data + " ");
			InOrder(root.right);
		}
	}
	
	public void PreOrder(Node root) {
		if (root == null) {
			return;
		}
		else {
			System.out.print(root.data + " ");
			PreOrder(root.left);
			PreOrder(root.right);
		}
	}
	
	public void PostOrder(Node root) {
		if (root == null) {
			return;
		}
		else {
			PostOrder(root.left);
			PostOrder(root.right);
			System.out.print(root.data + " ");
		}
	}
	
	public boolean Find(int data) {
		Node temp = root;
		while (temp!= null) {
			if(temp.data == data)
				return true;
			else if(temp.data > data)
				temp = temp.left;
			else
				temp = temp.right;
		}
		return false;
	}
	
	public int FindMin() {
		Node temp = root;
		if (temp == null)
			return -1;
		while(temp.left != null)
			temp = temp.left;
		return temp.data;	
	}
	
	public Node FindMinNode(Node node) {
		Node temp = node;
		if (temp == null)
			return null;
		while(temp.left != null)
			temp = temp.left;
		return temp;	
	}
	
	public Node FindMaxNode(Node node) {
		Node temp = node;
		if (temp == null)
			return null;
		while(temp.right != null)
			temp = temp.right;
		return temp;	
	}
	
	public int FindMax() {
		Node temp = root;
		if (temp == null)
			return -1;
		while (temp.right != null)
			temp = temp.right;
		return temp.data;
	}
	
	public boolean checkBST(Node root) {
		if (root == null) {
			return true;
		}
		else if (root.left!=null && root.left.data <= root.data && root.right!=null && root.data< root.right.data) {
			return true;
		}
		else if (root.left==null || root.left.data > root.data || root.right==null || root.data>root.right.data) {
			return false;
		}
		else {
			return checkBST(root.left) && checkBST(root.right);
		}	
	}
	
	public boolean isBST3(Node root) {
		if (root == null)
		return true;
		if (root.left != null && FindMaxNode(root.left).data > root.data)
		return false;
		if (root.right != null && FindMinNode(root.right).data <= root.data)
		return false;
		return (isBST3(root.left) && isBST3(root.right));
		}
	
	public Node Delete(Node node,int data) {
		if(node.data>data) {
			node.left = Delete(node.left ,data);                                                                                                                 
		}
		else if(node.data< data) {
			node.right =  Delete(node.right,data);
		}
		else{       
			if(node.left == null && node.right == null) {                   
					return null;   
			}
			else {                                                                                                                          
				if (node.left == null) {                                                                                                               
					return node.right;                                                                                                     
				}                                                                                                                         
				else if(node.right == null) {                                                                       
					return node.left;                                                                                    
				}
				else {
					Node IS = IntermedSucc(node.right);
					node.data = IS.data;
					node.right = Delete(node.right,IS.data);
				}
			}
		}
		return node;	
	}
	
	public Node IntermedSucc(Node root) {
		while(root.left != null) {
			root = root.left;
		}
		return root;
	}
	
	public static void main(String args[]) {
		BinaryST bst = new BinaryST();
//		bst.root = new Node(6);
//		bst.root.left = new Node(3);
//		bst.root.right = new Node(12);
//		bst.root.left.left = new Node(1);
//		bst.root.left.right = new Node(5);
//		bst.root.right.left = new Node(9);
//		bst.root.right.right = new Node(18);
		int[] arr = {5,4,2,1,3,6,7};
		
		for(int i=0;i<arr.length;i++)
			bst.Insert(arr[i]);
		bst.Insert(23);
		bst.Insert(13);
		bst.Delete(bst.root, 5);
		System.out.println("IN ORDER : ");
		bst.InOrder(bst.root);
//		System.out.println( "\nPOST ORDER : ");
//		bst.PostOrder(bst.root);
//		System.out.println("\nPRE ORDER : ");
//		bst.PreOrder(bst.root);
//		boolean x = bst.Find(18);
//		System.out.println(" \nElement Searched is present : " + x);
		System.out.println();
//		System.out.println(bst.FindMin());
//		System.out.println(bst.FindMax());
		System.out.println(bst.isBST3(bst.root));
		
	}
}
