public class ListNode {
    private Object obj;
    private ListNode next;

    public ListNode(Object obj, ListNode next) {
        this.obj = obj;
        this.next = next;
    }

    public Object getObj() {
        return this.obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public ListNode getNext() {
        return this.next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public String toString() {
        return this.obj.toString();
    }
}
