class Queue {

	private static class Node {
		private int data;
		private Node next;

		private Node(int data) {
			this.data = data;
		}
	}

	private Node head;
	private Node tail;

	public boolean isEmpty() {
		return head == null;
	}

	public int peek() {
		if(isEmpty()) {
			System.out.println("Empty");
			return -1;
		}
		return head.data;
	}

	public void add(int data) {
		Node node = new Node(data);

		if(head == null) {
			head = node;
		}

		if(tail != null) {
			tail.next = node;
		}

		tail = node;
		
	}

	public int remove() {
		int data = head.data;
		head = head.next;

		if(head == null) {
			tail = null;
		}
		return data;
	}

	public void show() {
		Node node = head;
		while(node.next != null) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data); // last node
	}
}


public class FlexibleLinkedQueue {

	public static void main(String[] args) {

		Queue queue = new Queue();

		queue.add(4);
		queue.add(5);
		queue.add(7);
		queue.add(1);
		queue.add(10);

		// queue.show();
		System.out.print(queue.peek()); // Gives the first entered
	}
}