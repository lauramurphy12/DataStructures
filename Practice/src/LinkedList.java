
public class LinkedList<T> {
	private Node head;
	
	//default constructor
	public LinkedList() {
		this.head = null;
	}
	//overloaded constructor
	public LinkedList(Node par_node) {
		this.head = par_node;
	}
	//check if list is empty
	public boolean isEmpty(){
		return this.head == null;
	}
	
	public Node getHead(){
		return this.head;
	}
	//return the last node in the list
	public Node returnLast(){
		Node curr = this.head;
		if(curr == null) {
			return null;
		}
		while(curr.next != null) {
			curr = curr.next;
		}
		return curr;
	}
	
	//insert new node at the front of the list
	public void addAtFront(Node par_node){
		if(this.head==null) {
			this.head = par_node;
		}else {
			par_node.next = this.head.next;
			this.head = par_node;
		}
	}
	
	// insertion after a node 
	public void addAfter(Node add_after, Node add_first) {
		if(add_first == null) {
			this.head = add_after;
		}
		else {
			add_first.next = add_after;
			add_after.previous = add_first;
		}
	}
	
	//insert new node at the end of the list
	public void addAtEnd(Node par_node) {
		if(this.head == null) {
			this.head = par_node;
		}
		else {
			Node last = this.returnLast();
			last.next = par_node;
			par_node.previous = last;
		}
	}
	
	public Node divideList(Node par_node) {
		par_node = this.head;
		Node secondHead = null;
		if(par_node == null || par_node.next == null) {
			return null;
		}
		//get middle of list
		int mid = getLength(par_node)/2;
		int counter = 0;
		
		for (int i=0; i<mid; i++) {
			par_node = par_node.next;
		}
		secondHead = par_node.next;
		secondHead.previous = null;
		par_node.next = null;
		return secondHead;
	}
	
	//deletion of a node according to the first occurrence of key
	// in the list
	public void delete(Node par_node) {
		par_node.previous.next = par_node.next;
	}
	
	public void printList(Node curr) {
		if(curr == null) {
			return;
		}else {
			System.out.println(curr.getData());
			printList(curr.next);
			//while(curr.next != null) {
			//	System.out.println(curr.getData());
			//	curr = curr.next;
			//}
			//System.out.println(curr.getData());
		}
		
	}
	//return the length of the list
	public int getLength(Node curr) {
		int counter = 0;
		curr = this.head;
		if(curr == null) {
			return 0;
		}else {
			while(curr.next != null) {
				counter++;
				curr = curr.next;
			}
		}
		return counter;
	}
	
	public int findKthToLastElement(Node head, int k){
		int counter = 0;
		// base case
		if(head == null) {
			return 0;
		}
		counter = findKthToLastElement(head.next, k) + 1;
		if(counter == k) {
			System.out.println(head.getData());
		}
		return counter;
	}
}
