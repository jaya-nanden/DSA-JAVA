class Node {
	
	int data;
	Node next;
	
}


class LinkedList {
	
	Node head;
	
	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		if(head == null) {
			head = node;
		} else {
			Node tNode = head;
			while(tNode.next != null) {
				tNode = tNode.next;
			}

			tNode.next = node;
		}
	}

	public void insertAtStart(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		node.next = head;	
		head  = node;
	}


	public void insertAtIndex(int index, int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if(index == 0) {
			insertAtStart(data);
		} else  {

		Node beforeNode = head;
		for(int i = 0; i < index - 1; i++) {
			beforeNode = beforeNode.next;
		}
		
		node.next = beforeNode.next;
		beforeNode.next = node;
		}

	}
	
	public void deleteAt(int index) {
		
		if(index == 0) {
			System.out.println("n1 " + head.data);
			head = head.next;
			
		} else {	
			Node beforeNode = head;
			Node n1 = null;
			for(int i = 0; i < index - 1; i++) {
				beforeNode = beforeNode.next;
			}
			
			n1 = beforeNode.next;
			beforeNode.next = 	n1.next;	
			System.out.println("n1 " + n1.data);
			n1 = null;	
		}
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


public class MyLinkedList {
	

	public static void main(String args[]) {
		System.out.println("Hello");

		LinkedList list = new LinkedList();
		
		list.insert(1);
		list.insert(2);
		list.insert(4);
		
		list.insertAtStart(7);
		list.insertAtIndex(1, 44);
		list.insertAtIndex(0, 44);

		list.show();

		list.deleteAt(3);
		
		list.show();

	}
	
}




