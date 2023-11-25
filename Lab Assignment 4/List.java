public class List {
    private ListNode firstNode;
    private ListNode lastNode;
    private ListNode currNode;

    public List() {
        this.firstNode = null;
        this.lastNode = null;
        this.currNode = null;
    }

    public ListNode getFirstNode() {
        return this.firstNode;
    }

    public void setFirstNode(ListNode firstNode) {
        this.firstNode = firstNode;
    }

    public ListNode getLastNode() {
        return this.lastNode;
    }

    public void setLastNode(ListNode lastNode) {
        this.lastNode = lastNode;
    }

    public ListNode getCurrNode() {
        return this.currNode;
    }

    public void setCurrNode(ListNode currNode) {
        this.currNode = currNode;
    }

    public void insertAtFront(Object obj) {
        ListNode newNode = new ListNode(obj, this.firstNode);
        this.firstNode = newNode;
        if (this.lastNode == null) {
            this.lastNode = newNode;
        } else {
            this.lastNode.setNext(newNode);
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

    // insert at middle
    public void insertAtMiddle(Object obj) {
        ListNode newNode = new ListNode(obj, null);
        if (this.firstNode == null) {
            this.firstNode = newNode;
            this.lastNode = newNode;
        } else {
            // put the new node at the middle and not based on the serial number
            ListNode curr = this.firstNode;
            int count = 0;
            while (curr != null) {
                count++;
                curr = curr.getNext();
            }

            curr = this.firstNode;
            for (int i = 0; i < (count / 2) - 1; i++) {
                curr = curr.getNext();
            }

            newNode.setNext(curr.getNext());
            curr.setNext(newNode);

            if (newNode.getNext() == null) {
                this.lastNode = newNode;
            }
        }
    }

    public void insertAtIndex(Object obj, int index) {
        ListNode newNode = new ListNode(obj, null);
        if (this.firstNode == null) {
            this.firstNode = newNode;
            this.lastNode = newNode;
        } else {
            ListNode curr = this.firstNode;
            for (int i = 0; i < index - 1; i++) {
                curr = curr.getNext();
            }
            newNode.setNext(curr.getNext());
            curr.setNext(newNode);
            if (newNode.getNext() == null) {
                this.lastNode = newNode;
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
                // print out the computer
                System.out.println(curr.getObj() + "\n");
            }
            curr = curr.getNext();
        }
        return count;
    }

    public int getSize() {
        int count = 0;
        ListNode curr = this.firstNode;
        while (curr != null) {
            count++;
            curr = curr.getNext();
        }
        return count;
    }

    public void print() {
        ListNode curr = this.firstNode;
        boolean empty = true;
        while (curr != null) {
            System.out.println(curr.getObj() + "\n");
            curr = curr.getNext();
            empty = false;
        }
        if (empty) {
            System.out.println("List is empty");
        }
    }
}
