import java.util.*;

class MyStack {
	
	int capacity = 2;
	int stack[] = new int[capacity];
	int top = 0;
	
	private void expand() {
		int length = size();		
		capacity *= 2;
		int newStack[] = new int[capacity];
		System.arraycopy(stack, 0, newStack, 0, length);
		stack = newStack;
	}
	
	private void shrink() {
		
		int length = size();
		if(length <= (capacity/2)/2) {
			capacity /= 2;
			int newStack[] = new int[capacity];
			System.arraycopy(stack, 0, newStack, 0, length);
			stack = newStack;
		}
	}


	public void push(int data) {
		if(size() == capacity) {
			expand();
		}
		stack[top] = data;
		top++;
	}

	public int pop() {
		int data = 0;
		if(isEmpty()) {
			System.out.println("No POP, Stack is empty");
		} else {
			top--;
			data = stack[top];
			stack[top] = 0;
			shrink();
		} 
		return data;
	}

	public int peek() {
		int data;
		data = stack[top - 1];
		return data;
	}
	
	public int size() {
		return top;
	}
	
	public boolean isEmpty() {
		return top <= 0; 
	}

	public void show() {
		
		for(int n : stack) {
			System.out.print(n + " ");
		}
		System.out.println();
	} 

	
}


public class Stack {

	public static void main(String args[]) {
		System.out.println("Hello\n");
		
		MyStack books = new MyStack();
		books.push(1);
		books.push(2);
		books.push(3);
		books.push(4);
		books.push(1);
		books.push(2);
		books.push(3);
		books.push(4);

		books.show();
		//books.push(1);
		
		System.out.println(books.pop());
		System.out.println(books.pop());
		books.show();
		System.out.println(books.pop());
		System.out.println(books.pop());
		books.show();
		System.out.println(books.pop());
		System.out.println(books.pop());

		//System.out.println(books.peek());

		//System.out.println(books.isEmpty());
				
		books.show();
	}

}