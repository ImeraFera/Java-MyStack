public class MyStack {

    public int top;
    public int[] stack;

    public MyStack(int size) {
        stack = new int[size];
        top = -1;
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return stack[top];
    }

    public boolean isFull() {
        return (top + 1 == stack.length);
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public void push(int num) {
        if (!isFull()) {
            top++;
            stack[top] = num;
        } else {
            throw new IllegalStateException("Stack overflow");
        }
    }

    public int pop() {
        if (!isEmpty()) {
            int temp = stack[top];
            top--;
            return temp;
        } else {
            throw new IllegalStateException("Stack is already empty");

        }
    }

    public void clear() {
        while (!isEmpty()) {
            pop();
        }
        System.out.println("Stack has been cleared");
    }

    public int size() {
        return top + 1;
    }
}
