class Stack {

	private static class Node {
		private int data;
		private Node next;
		private Node(int data) {
			this.data = data;
		}
	}

	private Node top;

	public boolean isEmpty() {
		return top == null;
	}

	public int peek() {
		if(isEmpty()) {
			System.out.println("Empty");
			return -1;
		}

		return top.data;
	}

	public void push(int data) {
		Node node = new Node(data);
		node.next = top;
		top = node;
	}

	public int pop() {
		int data = top.data;
		top = top.next;
		return data;
	}

	public void show() {
		Node node = top;
		while(node.next != null) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data); // last node
	}

}


public class FlexibleLinkedStack {

	public static void main(String[] args) {

		Stack stack = new Stack();

		stack.push(40);
		stack.push(50);
		stack.push(70);
		stack.push(10);

		// stack.show();
		System.out.print(stack.peek()); // Gives the last entry

	}
}