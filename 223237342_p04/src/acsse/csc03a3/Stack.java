package acsse.csc03a3;



//************ Total Marks for Stack class: 10 marks
public class Stack<T extends Comparable<T>> {
	//TODO: COMPLETE CODE HERE
	/*
	 * Data member (1 mark)
	 */
	private DList<T> stackList;
	
	/*
	 * Default constructor (1 mark)
	 */
	public Stack() {
		stackList = new DList<>();
	}
	
	
	/*
	 * Add an element to the stack, by adding at the beginning of the list (2 marks)
	 */
	public void push(T element) {
		
		stackList.addFirst(element);
	}
	
	
	/*
	 * Removes an element from the stack, by removing the first element in the list (2 marks)
	 */
	public T pop() {
		if(stackList.isEmpty()) {
			return null;
		}
		
		Node<T> firstNode =  stackList.head();
		return stackList.remove(firstNode);
	}
	
	/*
	 * Takes a look at the first element in the stack without removing it (2 marks)
	 */
	public T peak() {
		return stackList.head().element;
	}
	
	/*
	 * Returns the size of the stack (1 mark)
	 */
	public int size() {
		return stackList.size();
	}
	
	/*
	 * Returns whether the stack is empty or not (1 mark)
	 */
	public boolean isEmpty() {
		return stackList.isEmpty();
	}
	
}
