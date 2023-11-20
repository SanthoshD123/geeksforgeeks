class Solution {
    
    // Function to check whether two linked lists are identical or not.
    public boolean isIdentical(Node head1, Node head2) {
        // Traverse both linked lists
        while (head1 != null && head2 != null) {
            // If the current nodes have different data, return false
            if (head1.data != head2.data) {
                return false;
            }
            // Move to the next nodes in both lists
            head1 = head1.next;
            head2 = head2.next;
        }
        
        // If one list is longer than the other, they are not identical
        return head1 == null && head2 == null;
    }
}
