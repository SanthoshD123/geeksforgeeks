class Solution {
    // Function to count nodes of a linked list.
    public static int getCount(Node head) {
        int count = 0;
        Node current = head;
        
        while (current != null) {
            count++;
            current = current.next;
        }
        
        return count;
    }
}
