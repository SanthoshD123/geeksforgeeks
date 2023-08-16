class GfG {
    int minEle;
    Stack<Integer> s;

    // Constructor    
    GfG() {
        s = new Stack<>();
    }

    /* Returns min element from stack */
    int getMin() {
        if (s.isEmpty()) {
            return -1; // Indicate stack is empty
        }
        return minEle;
    }

    /* Removes the element on top of the stack */
    int pop() {
        if (s.isEmpty()) {
            return -1; // Indicate stack is empty
        }
        
        int popped = s.pop();
        if (popped < minEle) {
            int prevMinEle = minEle;
            minEle = 2 * minEle - popped;
            return prevMinEle;
        }
        return popped;
    }

    /* Push element x into the stack */
    void push(int x) {
        if (s.isEmpty()) {
            minEle = x;
            s.push(x);
            return;
        }
        if (x < minEle) {
            s.push(2 * x - minEle);
            minEle = x;
        } else {
            s.push(x);
        }
    }
}
