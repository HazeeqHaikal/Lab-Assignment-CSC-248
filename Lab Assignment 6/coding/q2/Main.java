import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        QUEUE qCustomer = new QUEUE();
        QUEUE qQualify = new QUEUE();

        // ii. Declare a QUEUE object named as qQualify, to store customer information
        // data that qualified to apply a loan
        // iii. Assume a queue for qCustomer has been inserted with some values (please
        // insert some data by the user). Determine either any customers is qualify or
        // disqualify to apply for a loan. If there are any customers qualified to apply
        // for a loan, store the information into qQualify.
        // For simplicity, I'm creating dummy customers. Replace this with actual input.
        for (int i = 0; i < 10; i++) {
            Customer customer = new Customer("Customer" + i, i, i * 1000, i * 20000);
            qCustomer.enqueue(customer);
            if (customer.process()) {
                qQualify.enqueue(customer);
            }
        }

        // iv. Print all customer information from qQualify list
        while (!qQualify.isEmpty()) {
            System.out.println(qQualify.dequeue());
        }
    }
}

class Customer {
    private String name;
    private int accountNo;
    private double saving;
    private double totalTransaction;

    public Customer(String name, int accountNo, double saving, double totalTransaction) {
        this.name = name;
        this.accountNo = accountNo;
        this.saving = saving;
        this.totalTransaction = totalTransaction;
    }

    public String getName() {
        return name;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public double getSaving() {
        return saving;
    }

    public double getTotalTransaction() {
        return totalTransaction;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", accountNo=" + accountNo +
                ", saving=" + saving +
                ", totalTransaction=" + totalTransaction +
                '}';
    }

    public boolean process() {
        return saving > 1000;
    }
}

class Node {
    Object data;
    Node link;

    public Node(Object elem) {
        this.data = elem;
        this.link = null;
    }

    public Node(Object elem, Node nextElem) {
        this.data = elem;
        this.link = nextElem;
    }

    public Object getData() {
        return data;
    }

    public Node getLink() {
        return link;
    }
}

class ListNode {
    Node first;
    Node last;

    public ListNode() {
        this.first = null;
        this.last = null;
    }
}

class QUEUE extends ListNode {
    public QUEUE() {
        super();
    }

    public void enqueue(Object elem) {
        Node newNode = new Node(elem);
        if (this.first == null) {
            this.first = newNode;
            this.last = newNode;
        } else {
            this.last.link = newNode;
            this.last = newNode;
        }
    }

    public Object dequeue() {
        if (this.first != null) {
            Object data = this.first.data;
            this.first = this.first.link;
            return data;
        }
        return null;
    }

    public boolean isEmpty() {
        return this.first == null;
    }

    public Object getFirst() {
        return this.first != null ? this.first.data : null;
    }

    public Object getNext() {
        return this.first != null && this.first.link != null ? this.first.link.data : null;
    }

    public Object getLast() {
        return this.last != null ? this.last.data : null;
    }
}
