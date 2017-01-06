/**
 * Class ListNode for LinkedList exercise
 *
 * @author Ginestra Ferraro
 */

public class ListNode {
    
    private Object listItem;
    private ListNode next;
    private ListNode prev;
    
    // Constructor
    public ListNode(Object listItem) {
        this.listItem = listItem;
        next = null;
        prev = null;
    }
    
    public void setObject(Object listItem) {
        this.listItem = listItem;
    }
    
    public void setNext(ListNode next) {
        this.next = next;
    }
    
    public void setPrev(ListNode prev) {
        this.prev = prev;
    }
    
    public Object getListItem() {
        return listItem;
    }
    
    public ListNode getNext() {
        return next;
    }
    
    public ListNode getPrev() {
        return prev;
    }
}