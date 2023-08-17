/*
class Node
{
    int data;
    Node next;
    
    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

class GfG
{
    public static int nknode(Node head, int k)
    {
       // add your code here
       int n=0;
       Node curr = head;
       while(curr!=null){
           n++;
           curr = curr.next;
       }
       int index = (int)Math.ceil((double)n/k);
       curr = head;
       for(int i=1;i<index;i++){
           curr = curr.next;
       }
       return curr.data;
    }
}
