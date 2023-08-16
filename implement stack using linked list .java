class MyStack 
{
    // class StackNode {
    //     int data;
    //     StackNode next;
    //     StackNode(int a) {
    //         data = a;
    //         next = null;
    //     }
    // }   
    StackNode head;
    MyStack() {
        head = null;
    }
    
    //Function to push an integer into the stack.
    void push(int a) 
    {
        // Add your code here
        
        StackNode temp = new StackNode(a);
        temp.next = head;
        head = temp;
        
    }
    
    //Function to remove an item from top of the stack.
    int pop() 
    {
        // Add your code here
       
        if(head==null){
            return -1;
        }
        int res = head.data;
        head = head.next;
        return res;
    }
}
