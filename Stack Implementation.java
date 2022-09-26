import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

interface IStack {

    /*** Removes the element at the top of stack and returnsthat element.
     * @return top of stack element, or through exception if empty
     */

    public Object pop();

    /*** Get the element at the top of stack without removing it from stack.
     * @return top of stack element, or through exception if empty
     */

    public Object peek();

    /*** Pushes an item onto the top of this stack.
     * @param object to insert*
     */

    public void push(Object element);

    /*** Tests if this stack is empty
     * @return true if stack empty
     */
    public boolean isEmpty();

    public int size();
}

public class MyStack implements IStack {
    public class Node {
        private Object element;
        private Node next;
        public Node(Object element, Node next) {
            this.element = element;
            this.next = next;
        }
        /* Getter */
        public Object getElement() {
            return element;
        }
        public Node getNext() {
            return next;
        }
        /* Setter */
        public void setElement(Object element) {
            this.element = element;
        }
        public void setNext(Node next) {
            this.next = next;
        }
    }
    private int size;
    private Node top;
    public MyStack() {
        top = new Node(null, null);
        size = 0;
    }
    public Object pop() {
        if (size == 0) {
            return "Error";
        }
        Object temp = top.getElement();
        top = top.getNext();
        size -= 1;
        return temp;
    }
    public Object peek() {
        if (size == 0) {
            return "Error";
        }
        return top.getElement();
    }
    public void push(Object element) {
        Node e = new Node(element, top);
        top = e;
        size += 1;
    }
    public boolean isEmpty() {
        return (size == 0);
    }
    public int size() {
        return size;
    }

    public void display(MyStack st) {
        Node n = top;
        System.out.print("[");
        if (st.size() != 0) {
            System.out.print(st.pop());
        }
        while (st.size() != 0) {
            System.out.print(", ");
            System.out.print(st.pop());
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine().replaceAll("\\[|\\]", "");
        String[] arrIn = in.split(", ");
        MyStack list = new MyStack();
        for (int i = 0; i < arrIn.length && !(arrIn[0].equals("")); i++) {
            list.push(Integer.parseInt(arrIn[arrIn.length - 1 - i]));
        }
        String command = sc.nextLine();
        if (command.equals("push")) {
            int element = sc.nextInt();
            list.push(element);
            list.display(list);
        } else if (command.equals("pop")) {
            if (list.size() == 0) {
                System.out.println("Error");
            } else {
                list.pop();
                list.display(list);
            }
        } else if (command.equals("peek")) {
            System.out.print(list.peek());
        } else if (command.equals("size")) {
            System.out.print(list.size());
        } else if (command.equals("isEmpty")) {
            if (list.isEmpty()) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
    }
}