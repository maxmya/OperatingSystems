
package Project;

/**
 *
 * @author Zizo
 */
public class StackArray {

    private int maxSize;
    private int[] stackArray;
    private int top;

    public StackArray(int s) {
        maxSize = s;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int j) {
        stackArray[++top] = j;
    }

    public void pop() {
     top --;
    }

    public int peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    
}
