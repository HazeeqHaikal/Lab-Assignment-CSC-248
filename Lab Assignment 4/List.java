public class List {
    private ListNode firstNode;
    private ListNode lastNode;
    private ListNode currNode;

    public List() {
        this.firstNode = null;
        this.lastNode = null;
        this.currNode = null;
    }

    public void insertAtFront(Object obj) {
        ListNode newNode = new ListNode(obj, this.firstNode);
        this.firstNode = newNode;
        if (this.lastNode == null) {
            this.lastNode = newNode;
        }
    }

    public void insertAtBack(Object obj) {
        ListNode newNode = new ListNode(obj, null);
        if (this.lastNode == null) {
            this.firstNode = newNode;
            this.lastNode = newNode;
        } else {
            this.lastNode.setNext(newNode);
            this.lastNode = newNode;
        }
    }

    public void insertAtMiddle(Object obj) {
        if (this.firstNode == null) {
            this.insertAtFront(obj);
        } else if (this.firstNode.getNext() == null) {
            this.insertAtBack(obj);
        } else {
            ListNode newNode = new ListNode(obj, null);
            ListNode curr = this.firstNode;
            ListNode prev = null;
            while (curr != null) {
                if (((Computer) curr.getObj()).getYear() > ((Computer) newNode.getObj()).getYear()) {
                    break;
                }
                prev = curr;
                curr = curr.getNext();
            }
            if (prev == null) {
                newNode.setNext(this.firstNode);
                this.firstNode = newNode;
            } else {
                newNode.setNext(curr);
                prev.setNext(newNode);
            }
        }
    }

    public Object remove(int serialNo) {
        ListNode curr = this.firstNode;
        ListNode prev = null;
        while (curr != null) {
            if (((Computer) curr.getObj()).getSerialNo() == serialNo) {
                break;
            }
            prev = curr;
            curr = curr.getNext();
        }
        if (curr == null) {
            return null;
        }
        if (prev == null) {
            this.firstNode = curr.getNext();
        } else {
            prev.setNext(curr.getNext());
        }
        if (curr.getNext() == null) {
            this.lastNode = prev;
        }
        return curr.getObj();
    }

    public void searchComputer(int serialNo) {
        ListNode curr = this.firstNode;
        while (curr != null) {
            if (((Computer) curr.getObj()).getSerialNo() == serialNo) {
                break;
            }
            curr = curr.getNext();
        }
        if (curr == null) {
            System.out.println("Computer not found");
        } else {
            System.out.println(curr.getObj());
        }
    }

    public int countComputer(double price) {
        int count = 0;
        ListNode curr = this.firstNode;
        while (curr != null) {
            if (((Computer) curr.getObj()).getPrice() > price) {
                count++;
            }
            curr = curr.getNext();
        }
        return count;
    }

    public void print() {
        ListNode curr = this.firstNode;
        while (curr != null) {
            System.out.println(curr.getObj() + "\n");
            curr = curr.getNext();
        }
    }
}
