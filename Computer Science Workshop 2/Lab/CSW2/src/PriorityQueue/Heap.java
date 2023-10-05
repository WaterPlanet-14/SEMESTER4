package PriorityQueue;
public class Heap{
	private static final int CAPACITY = 32;
	private int size; 
	private int[] arr;
	boolean isMinHeap;
//Methods.
	public boolean isEmpty() {
		return (size == 0);	
	}
	private void proclateDown(int position) {
		int lChild = 2 * position + 1;
		int rChild = lChild + 1;
		int child = -1;
		int temp;	
		if (lChild < size) {
			child = lChild;
		}
		if (rChild < size && compare(arr, rChild, lChild)) {
			child = rChild;
		}
		if (child != -1 && compare(arr, child, position)) {
			temp = arr[position];	
			arr[position] = arr[child];
			arr[child] = temp;
			proclateDown(child);
		}
	}
	private void proclateUp(int position) {
		int parent = (position - 1) / 2;
		int temp;
		if (parent == 0) {
			return;
		}
		if (compare(arr, parent, position)) {
			temp = arr[position];
			arr[position] = arr[parent];
			arr[parent] = temp;
			proclateUp(parent); 
		}	
	}
	boolean compare(int[] arr, int first, int second) {
		if (isMinHeap)
			return (arr[first] < arr[second]);
		return (arr[first] > arr[second]);
	}
	
	public int size() {
		return size;
	}
	
	public int peek() {
		if (isEmpty()) {
			throw new IllegalStateException();	
		}
		return arr[0];
	}
	
	public Heap(int[] array, boolean isMin) {
		size = array.length;
		arr = array;
		isMinHeap = isMin;
		// Build Heap operation over array
		for (int i = (size / 2); i >= 0; i--) {
		proclateDown(i);
		}
	}
	
	public Heap(boolean isMin) {
		arr = new int[CAPACITY];
		size = 0;
		isMinHeap = isMin;
	}
	
	public void add(int value) {
		if (size == arr.length) {
			doubleSize();
		}
		arr[size++] = value;
		proclateUp(size - 1);
	}
	private void doubleSize() {
		int[] old = arr;
		arr = new int[arr.length * 2];
		System.arraycopy(old, 0, arr, 0, size);
	}
	public int remove() {
		if (isEmpty()) {
			throw new IllegalStateException();
		}
		int value = arr[0];
		arr[0] = arr[size - 1];
		size--;
		proclateDown(0);
		return value;
	}
	public static void main(String[] args) {
		int[] a = { 1, 9, 6, 7, 8, 0, 2, 4, 5, 3 };
		Heap hp = new Heap(a, true);
		System.out.println(hp);
		System.out.println();
		while (!hp.isEmpty()) {
			System.out.print(hp.remove() + " ");
		}
	}
}