public class Stack {
    int ele[];
    int top = -1;
    int max;

    public Stack(int size) {
        ele = new int[size];
        max = size;
    }

    private boolean isEmpty() {
        return (top == -1) ? true : false;
    }

    private boolean isFull() {
        return (top == max - 1) ? true : false;
    }

    public void push(int n) {

        if (isFull()) {
            System.out.println("Stack Full");
            return;
        }
        ele[++top] = n;

    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return ele[top--];

    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return ele[top--];
        }
    }

    void traverse() {
        for (int i = top; i >= 0; i--) {
            System.out.println(ele[i]);
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        stack.traverse();
    }

}
