# Undo-Redo-Operation-using-a-Stack
1. When the user types a key, it is displayed in the text area until the text block is reached.
In our case, it is when the user uses the space bar to denote a space between words.
2. Once the text block has been reached, the current state of the text found in the text
area is pushed onto the undo stack.
3. The undo key-stroke is checked for every key pressed, and if it is activated, the current
state is pushed onto the redo stack, and the current state is set to state popped off the
undo stack.
