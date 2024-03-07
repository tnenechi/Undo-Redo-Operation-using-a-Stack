package acsse.csc03a3;

public class UndoManager {
    private final Stack<String> history = new Stack<>();

    public void record(String state) {
        /*
		* add state to stack
		* (2 marks)
		*/
        //TODO: COMPLETE CODE HERE
    	history.push(state);
    	//System.out.println("State: {" + history.peak() + "}");
    }

    public String undo() {
    	/*
	* remove state to stack
	* (3 marks)
	*/
	//TODO: COMPLETE CODE HERE
    	String removedElement = history.pop();
    	
    	
    	return removedElement;
    }
}

