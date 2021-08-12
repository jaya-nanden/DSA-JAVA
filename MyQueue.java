import java.util.*;

class Queue {

	int queue[] = new int[5];
	int size;
	int front;
	int rear;

	public void enqueue(int data) {

		if(!isFull()) {
			queue[rear] = data;
			rear = (rear + 1) % 5;
			size++;
		} else {
			System.out.print("Full");
		}

	}

	public int dequeue() {

		int data = queue[front];
		
		if(!isEmpty()) {
			front = (front + 1) % 5;
			size--;
		} else {
			System.out.print("Empty");
		}

		return data;
	}

	public void show() {
		for(int i = 0; i < size; i++) {
			System.out.print(queue[(front+i)%5] + " ");
		}
		System.out.println();
	}

	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return getSize() == 0;
	}

	public boolean isFull() {
		return getSize() == 5;
	}


}


public class MyQueue {

	public static void main(String args[]) {
		System.out.println("Hello");

		Queue q = new Queue();
		
		q.enqueue(5);
		q.enqueue(2);
		q.enqueue(6);
		q.enqueue(7);
		//q.enqueue(5);
		

		q.show();

		q.dequeue();
		
		q.show();
	
	}



}