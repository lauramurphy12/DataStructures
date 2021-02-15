
public class Node<T extends Comparable<T>> {
	private T data;
	Node<T> next;
	Node<T> previous;
	
	public Node(T par_data) {
		this.data = par_data;
		this.next = null;
		this.previous = null;
	}
	public Node(T data, Node<T> par_next, Node<T> par_previous){
		this.data = data;
		this.next = par_next;
		this.previous = par_previous;
	}
	public T getData() {
		return this.data; 
	}
	public void setData(T par_data) {
		this.data = par_data;
	}
	public String toString(T par_data) {
		return par_data.toString();
	}
	public int compareTo(Node<T>par_node) {
		return getData().compareTo(par_node.getData());
	}

}
