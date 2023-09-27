class Solution {
    // Function to reverse a linked list.
    private Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        
        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        
        return prev;
    }
    
    // Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) {
        if (head == null || head.next == null) {
            return true; // An empty list or a single-node list is a palindrome.
        }
        
        Node slow = head;
        Node fast = head;
        
        // Find the middle of the linked list using the slow and fast pointers.
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // Reverse the second half of the linked list.
        Node secondHalfReversed = reverseList(slow);
        
        // Compare the first half with the reversed second half.
        while (secondHalfReversed != null) {
            if (head.data != secondHalfReversed.data) {
                return false; // The linked list is not a palindrome.
            }
            head = head.next;
            secondHalfReversed = secondHalfReversed.next;
        }
        
        return true; // The linked list is a palindrome.
    }
}
