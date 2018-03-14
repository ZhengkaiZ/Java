/*DList.java*/

/**
 * A DList is a mutable doubly-linked list.
 *@author Zhengkai Zhang
 *
 */

public class DList {
    protected DListNode head;
    protected long size;
    
    /**
     * DList() constructor for an empty DList.
     */
    public DList () {
        head = new DListNode();
        head.item = 0;
        head.num = 0;
        head.prev = head;
        head.next = head;
        size = 0;
    }
    
    /**
     * DList() constructor for a non-node DList2.
     */
    public DList (int i, int n) {
        head = new DListNode();
        head.item = 0;
        head.next = new DListNode(i, n);
        head.prev = head.next;
        head.next.next = head;
        head.next.prev = head;
        size = 1;
    }
    /**
     * insertEnd is to insert pixels and runs in to the DList
     * @param i pixels values
     * @param n runs
     */
    public void insertEnd(int i, int n){
        DListNode copy = new DListNode(i, n);
        if (this.size == 0) {
            head.next = copy;
            head.prev = copy;
            copy.next = head;
            copy.prev = head;
            size++;
        } else {
            copy.next = head;
            copy.prev = head.prev;
            head.prev.next = copy;
            head.prev = copy;
            size++;
        }
    }
    /**
     * Remove First
     */
    public void removeFirst() {
        if (this.size == 0) {
            return;
        }
        else if (this.size == 1) {
            head.next = head;
            head.prev = head;
            size--;
        } else {
            head.next = head.next.next;
            head.next.prev = head;
            size--;
        }
        
    }
}
