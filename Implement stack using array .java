class MyStack {
    int top;
    int arr[] = new int[1000];

    MyStack() {
        top = -1;
    }

    // Function to push an integer into the stack.
    void push(int a) {
        if (top < 999) {
            arr[++top] = a;
        }
    }

    // Function to remove an item from the top of the stack.
    int pop() {
        if (top >= 0) {
            return arr[top--];
        } else {
            // Stack is empty, returning -1
            return -1;
        }
    }
}
