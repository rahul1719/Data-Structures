public class Linked {

	// properties
	Node head;
	int count = 0;

	// constructor
	public Linked() {

	}

	public Linked(Node newNode) {
		head = newNode;
		count++;
	}

	// methods

	// add node to the last
	public Node addLast(String data) {
		Node tempNode = new Node(data);
		Node currentNode = head;
		if (currentNode != null) {
			while (currentNode.getNext() != null) {
				currentNode = currentNode.getNext();
			}
			currentNode.setNext(tempNode);
			count++;
		} else {
			head = tempNode;
			count++;
		}
		return head;

	}

	// add in the beginning
	public Node addFirst(String newData) {
		Node currentNode = head;
		Node tempNode = new Node(newData);
		tempNode.setNext(currentNode);
		head = tempNode;
		count++;
		return head;

	}

	// add at particular index
	public Node addAt(int index, String newData) {
		Node currentNode = head;
		Node tempNode = new Node(newData);
		if (index == 0) {
			return addFirst(newData);
		} else if (index == count) {
			return addLast(newData);
		} else {
			for (int i = 1; i <= index; i++) {

				if (i == index - 1) {
					Node nextNode = currentNode.getNext();
					currentNode.setNext(tempNode);
					tempNode.setNext(nextNode);
				}
				currentNode = currentNode.getNext();
			}
		}
		count++;
		return head;
	}

	// add data after particular data

	public Node addAfter(String data, String newData) {
		Node currentNode = head;
		Node tempNode = new Node(newData);
		while (!currentNode.getData().equalsIgnoreCase(data)) {
			currentNode = currentNode.getNext();
		}
		tempNode.setNext(currentNode.getNext());
		currentNode.setNext(tempNode);
		count++;
		return head;
	}

	// get data from particular index
	public String getData(int index) {
		if (index < 0) {
			return "-1";

		} else {
			Node currentNode = head;
			for (int i = 1; i < index; i++) {
				currentNode = currentNode.getNext();
			}
			return currentNode.getData();
		}
	}

	// get the size of the linkedList

	public int getLength() {
		return count;
	}

	// check if linkedList is empty or not

	public boolean isEmpty() {
		return head == null;
	}

	// remove from the back of the linkedList
	public Node removeLast() {
		Node tempNode = head;
		if (tempNode != null) {
			while (tempNode.getNext().getNext() != null) {
				tempNode = tempNode.getNext();
			}
			tempNode.setNext(null);
			count--;
		}
		return tempNode;
	}
	
	// remove from front of the list
	public Node removeFirst(){
		head=head.getNext();
		count--;
		return head;
		}
	// remove from particular index
	
	public Node removeAt(int index){
		Node currentNode = head;
		if(index==1){
			removeFirst();
		}
		else if(index==count){
			removeLast();
		}
		else{
			for(int i=1;i<index-1;i++){
				currentNode=currentNode.getNext();
			}
			currentNode.setNext(currentNode.getNext().getNext());
			count--;
		}
		
		return head;
	}
	
	//get count of the list
	public int getSize(){
		return count;
		}
	
	@Override
	public String toString() {
		Node curretnNode = head;
		StringBuilder sb = new StringBuilder();
		if (count > 0) {
			sb.append("[");
		}
		while (curretnNode.getNext() != null) {
			sb.append(curretnNode.getData() + ",");
			curretnNode = curretnNode.getNext();
		}
		sb.append(curretnNode.getData() + "]");
		return sb.toString();
	}

	public static void main(String[] args) {

		Linked link = new Linked();
		link.addLast("Ra1");
		System.out.println(link.toString());
		link.addLast("Sup");
		link.addLast("Rahul");
		link.addLast("last");
		System.out.println(link.toString());
		link.addAt(2, "test");
		link.addAfter("last", "RahulTest");
		System.out.println(link.getData(5));
		link.removeLast();
		link.removeFirst();
		System.out.println(link.toString());
		link.removeAt(1);
		System.out.println(link.getLength());
		System.out.println(link.toString());

	}

}
