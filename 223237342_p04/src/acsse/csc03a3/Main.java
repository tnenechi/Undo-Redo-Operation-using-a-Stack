package acsse.csc03a3;
/*
 * Compilation and Correctness
 * (10 marks)
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;

public class Main extends Application {

	@Override
    public void start(Stage primaryStage) {
        // Initialize the UndoManager
        UndoManager undoManager = new UndoManager();

        // Create the TextArea and set its initial text
        /*
         * TextArea declaration
         * (3 marks)
         */
        //TODO: COMPLETE CODE HERE
   
        TextArea txtArea = new TextArea();
        
        txtArea.setPromptText("Enter your text here. Press space before pressing U for undo");
        
       
        
       
		/*
		* Checks for undo keystroke and performs undo
		* (5 marks)
		*/
        //TODO: COMPLETE CODE HERE
         // Sets an undo action on U press
        
    	
        
        UndoManager undoStack = new UndoManager();
        UndoManager redoStack = new UndoManager();
        
     
        
        txtArea.setOnKeyPressed(e -> {
        	String currentState = "";
        	
        	if (e.getCode() == KeyCode.SPACE) {
        		e.consume();
        		currentState = txtArea.getText();
                undoStack.record(currentState);
                
            }
        	else if(e.getCode() == KeyCode.U) {
        		e.consume();
        		currentState = undoStack.undo();
        		redoStack.record(currentState);
        		
        		currentState = undoStack.undo();
        		System.out.println(currentState);

        		txtArea.setText(":  " + currentState);
        		undoStack.record(currentState);
        		
        		
        	}
        	
        	/*
    		* Checks for redo keystroke and performs redo
    		* (10 marks)
    		*/
            //TODO: COMPLETE CODE HERE
            // Sets an undo action on R press
        	
        	else if (e.getCode() == KeyCode.R) {
        		e.consume();
                currentState = redoStack.undo();
                undoStack.record(currentState);
                txtArea.setText(":  " + currentState);
                
            }
        	
        	
        });
        
        
        
        
        
	
        
        
        
        
        
        
        
        /*
         * GUI setup and show
         * (7 marks)
         */
        //TODO: COMPLETE CODE HERE
        
        GridPane root = new GridPane();
        root.add(txtArea, 0, 0);
        Scene scene = new Scene(root, 700, 700);
        primaryStage.setTitle("Undo Redo Program");
        primaryStage.setScene(scene);
        primaryStage.show();
        txtArea.requestFocus();
        

    }

    public static void main(String[] args) {
        launch(args);
    	
    }
}
