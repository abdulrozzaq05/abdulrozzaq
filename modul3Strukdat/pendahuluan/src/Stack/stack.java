package Stack;

class stack {

    public int maxSize;
    public long[] stackArray;
    public int top;

    public stack(int size) {
        maxSize = size;
        stackArray = new long[maxSize];
        top = -1;
    }

    public void push(long item) {
        stackArray[++top] = item;
    }

    public long pop() {
        return stackArray[top--];
    }

    public long peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return  (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
}
