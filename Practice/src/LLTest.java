
public class LLTest {

	public static void main(String[] args) {
		
		//instantiate bunch of free standing nodes
		Node<Integer> n1 = new Node<Integer>(12);
		Node<Integer> n2 = new Node<Integer>(10);
		Node<Integer> n3 = new Node<Integer>(8);
		Node<Integer> n4 = new Node<Integer>(5);
		Node<Integer> n5 = new Node<Integer>(20);
		Node<Integer> n6 = new Node<Integer>(99);
		Node<Integer> n7 = new Node<Integer>(14);
		Node<Integer> n8 = new Node<Integer>(50);
		Node<Integer> n9 = new Node<Integer>(33);
		
		//instantiate new Linked List
		LinkedList<Integer> LL = new LinkedList<Integer>();
		
		// add some nodes to the end of the list
		LL.addAtEnd(n1);
		LL.addAtEnd(n2);
		LL.addAtEnd(n3);
		LL.addAtEnd(n4);
		LL.addAtEnd(n5);
		
		System.out.println("Create initial list");
		LL.printList(LL.getHead());
		
		LL.addAfter(n6, n5);
		System.out.println("Add node with value 99 after another node with value 20.");
		LL.printList(LL.getHead());
		LL.addAfter(n7, n6);
		System.out.println("Add node with value 14 after another node with value 99.");
		LL.printList(LL.getHead());
		LL.addAfter(n8, n7);
		System.out.println("Add node with value 50 after another node with value 14.");
		LL.printList(LL.getHead());
		
		
		System.out.println("Add node with value 33 at the head of the list");
		LL.addAtFront(n9);
		LL.printList(LL.getHead());
		
		System.out.println("Delete node with value 5");
		LL.delete(n4);
		LL.printList(LL.getHead());
		
	
		System.out.print("4th to last element is: " );
		LL.findKthToLastElement(LL.getHead(), 4);
	
	
		Node<Integer> secondHalf = LL.divideList(LL.getHead());
		System.out.println("Print first half of list");
		LL.printList(LL.getHead());
		System.out.println("Print second half of list");
		LL.printList(secondHalf);
	}

}
