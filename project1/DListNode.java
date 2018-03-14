/**
 * DlistNode Class.
 */
public class DListNode {
    
    /**
     * item references the item stored in the current node.
     * prev references the previous node in the DList.
     * next references the next noe in the DList.
     */
    
    public DListNode next;
    public DListNode prev;
    public int item;
    public int num;
    
    /**
     * DListNode() constructor.
     */
    
    DListNode (){
        item = 0;
        num = 0;
        next = null;
        prev = null;
    }

    DListNode (int i, int n) {
        item = i;
        num = n;
        next = null;
        prev = null;
    }
    
}
