import java.util.Scanner;

public class MinHeap {

	private final int capacity = 2;
	private int[] heap;
	private int size;
	
	MinHeap() {
		heap = new int[capacity];
	}
	
	void insert(int x) {
		if(size == heap.length) {
			doubleSize();
		}
		int pos = size++;
		heap[pos] = x;
		heapifyUp(pos);
	}

	/**
	 * @param pos
	 * @return
	 */
	private void heapifyUp(int pos) {
		while(pos >= 0 && heap[pos] < heap[parent(pos)]) {
			swap(pos,parent(pos));
			pos = parent(pos);
		}
	}

	private void swap(int pos, int parent) {
		int t = heap[pos];
		heap[pos] = heap[parent];
		heap[parent] = t;
	}

	private int parent(int pos) {
		return (pos-1)/2;
	}

	int deleteMin() {
		int x = heap[0];
		heap[0] = heap[--size];
		heapifyDown(0);
		return x;
	}
	
	void deleteElement(int x) {
		for(int i=0;i<size;i++) {
			if(heap[i] == x) {
				heap[i] = heap[--size];
				heapifyDown(i);
				break;
			}
		}
	}
	private void heapifyDown(int pos) {
		int left = left(pos);
		int right = right(pos);
		
		if(left < size && heap[left] < heap[right]) {
			swap(left,pos);
			heapifyDown(left);
		} else if(right < size){
			swap(right,pos);
			heapifyDown(right);
		}
	}

	private int right(int pos) {
		return 2*pos+2;
	}

	private int left(int pos) {
		return 2*pos+1;
	}

	private void doubleSize() {
		int[] oldHeap = heap;
		heap = new int[size*2];
		System.arraycopy(oldHeap, 0, heap, 0, size);
	}
	
	void print() {
		for(int i=0;i<size;i++) {
			System.out.print(heap[i] + " ");
		}
	}
	
	int min() {
		return heap[0];
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		MinHeap heap = new MinHeap();
		while(q-- > 0) {
			int op = sc.nextInt();
			if(op == 1) {
				int x = sc.nextInt();
				heap.insert(x);
			} else if(op == 2) {
				int x = sc.nextInt();
				heap.deleteElement(x);
			} else if(op == 3) {
				System.out.println(heap.min());
			}
		}
		sc.close();
	
	}
}
