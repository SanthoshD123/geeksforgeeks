/* A Binary Tree node */
class Node
{
    int data;
    Node left, right;
    
    public Node(int item)
    {
        data = item;
        left = right = null;
    }
}

class Tree
{
    int countLeaves(Node node) 
    {
        // Base case: if the tree is empty
        if (node == null)
            return 0;
        
        // Check if the current node is a leaf (has no left or right child)
        if (node.left == null && node.right == null)
            return 1;

        // Recursively count the leaves in the left and right subtrees
        int leftLeaves = countLeaves(node.left);
        int rightLeaves = countLeaves(node.right);

        // Return the sum of leaves in the left and right subtrees
        return leftLeaves + rightLeaves;
    }
}
