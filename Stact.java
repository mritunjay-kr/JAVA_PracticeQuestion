import static java.lang.System.exit;

class stack {
	public static void main(String[] args)
	{
		// create Object of Implementing class
		StackUsingLinkedlist obj
			= new StackUsingLinkedlist();
		// insert Stack value
		obj.push(11);
		obj.push(22);
		obj.push(33);
		obj.push(44);

		obj.display();

		// print Top element of Stack
		System.out.printf("\nTop element is %d\n",
						obj.peek());

		// Delete top element of Stack
		obj.pop();
		obj.pop();

		// print Stack elements
		obj.display();

		// print Top element of Stack
		System.out.printf("\nTop element is %d\n",
						obj.peek());
	}
}

// Create Stack Using Linked list
class StackUsingLinkedlist {

	// A linked list node
	private class Node {

		int data; 
		Node link; 
	}
	// create global top reference variable global
	Node top;
	StackUsingLinkedlist() { this.top = null; }
	public void push(int x)
	{
		// create new node temp and allocate memory
		Node temp = new Node();

		if (temp == null) {
		 System.out.print("\nHeap Overflow");
			return;
		}

		// initialize data into temp data field
		temp.data = x;
		temp.link = top;
		top = temp;
	}

	public boolean isEmpty() { return top == null; }

	public int peek()
	{
		// check for empty stack
		if (!isEmpty()) {
			return top.data;
		}
		else {
			System.out.println("Stack is empty");
			return -1;
		}
	}

	public void pop()
	{
		// check for stack underflow
		if (top == null) {
			System.out.print("\nStack Underflow");
			return;
		}

		top = (top).link;
	}

	public void display()
	{
		if (top == null) {
			System.out.printf("\nStack Underflow");
			exit(1);
		}
		else {
			Node temp = top;
			while (temp != null) {

				System.out.print(temp.data);

				temp = temp.link;
				if(temp != null)
					System.out.print(" -> ");
			}
		}
	}
}
