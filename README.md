# Stack Implementation

Create a stack class that implements MyStack interface.

## Input Format
The first line contains a comma-sepatared list of the stack elements. Next line contains "push", "pop", "peek", "isEmpty", or "size" depending on the required operation. The last line exists only for the "push" case, which contains the element to push to the stack.

## Constraints
The stack contains only integer values.

## Output Format

#### push: <br>prints the stack after the push operation.
#### pop: <br>prints the stack after the pop operation.
#### peek: <br>prints the top element of the stack.
#### isEmpty: <br>prints "True" or "False".
#### size: <br>prints the size of the stack.
If any error occurs, print "Error".

## Input and Output Samples

|N| Input | Output |
|--|-------|--------|
|1|[7, -2, -22, -27, 22, -24, -8, 22, -5, 27, -5, 1, 18, 17, 10, 19]<br>push<br>1|[1, 7, -2, -22, -27, 22, -24, -8, 22, -5, 27, -5, 1, 18, 17, 10, 19]|
|2|[-5, -23, 4, 19, 12, 11, 22, -18, -27]<br>pop|[-23, 4, 19, 12, 11, 22, -18, -27]|
|3|[-3, -12, -3, 15, -7, 9]<br>peek|-3|
|4|[-12, 1, -23]<br>isEmpty|False|
|5|[-11, -27, 29]<br>size|3|
