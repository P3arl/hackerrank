import java.util.Scanner;
import java.util.Stack;

class MyQueue{

	private Stack<Integer> front;
	private Stack<Integer> rear;

	MyQueue(){
		this.front = new Stack<>();
		this.rear = new Stack<>();
	}
	void enq(int data) {
		rear.push(data);
	}

	int deq() {
		if(front.isEmpty()) {
			while(!rear.isEmpty()) {
				front.push(rear.pop());
			}
		}
		return front.pop();
	}

	void print() {
		if(front.isEmpty()) {
			while(!rear.isEmpty()) {
				front.push(rear.pop());
			}
		}
		System.out.println(front.peek());
	}
}

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		MyQueue q = new MyQueue();
		while(n-- > 0) {
			int op = sc.nextInt();
			if(op == 1) {
				int data = sc.nextInt();
				q.enq(data);
			} else if(op == 2) {
				q.deq();
			} else if(op == 3) {
				q.print();
			}
		}
		sc.close();
	}
}
