import java.util.Scanner;

/*
 * Stack implementation using array
 */
public class StackImpl {

	private String[] stack = new String[5];
	private int top = -1;

	// check if stack is full
	public boolean isFull() {
		return top == (stack.length - 1);

	}

	// check if stack is empty
	public boolean isEmpty() {
		return top == -1;

	}

	// add data to stack
	public void push(String data) {
		if (!isFull()) {
			stack[++top] = data;
		}

	}

	// remove data from stack
	public String pop() {
		if (!isEmpty()) {
			return stack[top--];
		}
		return null;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < stack.length; i++) {
			sb.append(stack[i] + " ");
		}
		sb.append("]");
		return sb.toString();
	}

	public static void main(String[] args) {

		StackImpl st = new StackImpl();
		Scanner scan = new Scanner(System.in);

		st.push(scan.next());

		System.out.println(st.toString());
		System.out.println(st.top);
		System.out.println(st.pop());
		System.out.println(st.top);

	}

}
