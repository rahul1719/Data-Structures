
public class Node {

	private Node next;
	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	private String data;
	
	public Node() {

		super();
	}
	public Node(String data) {

		this.data = data;
	}

	public Node(Node next, String data) {

		this.next = next;
		this.data = data;
	}

	

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

}
