

/**
 *
 * @author Zizo
 */
public class QueueArray {

    private int maxSize;
    private int[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public QueueArray(int s) {
        maxSize = s;
        queArray = new int[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(int j) {
        queArray[++rear] = j;
        nItems++;
    }

    public void remove() {
        if (!isEmpty()) {
            front++;
            nItems--;
        }
    }

    public int peekFront() {
        return queArray[front];
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }

    public int size() {
        return nItems;
    }

}
