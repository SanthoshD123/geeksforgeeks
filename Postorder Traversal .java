import java.util.ArrayList;

/* A Binary Tree node
class Node {
    int data;
    Node left, right;
    Node(int item) {
        data = item;
        left = right = null;
    }
} */

class Tree {
    // Function to return a list containing the postorder traversal of the tree.
    ArrayList<Integer> postOrder(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        postOrderTraversal(root, result);
        return result;
    }

    // Helper function for recursive postorder traversal
    private void postOrderTraversal(Node root, ArrayList<Integer> result) {
        if (root != null) {
            // Traverse the left subtree
            postOrderTraversal(root.left, result);
            // Traverse the right subtree
            postOrderTraversal(root.right, result);
            // Visit the root node
            result.add(root.data);
        }
    }
}
