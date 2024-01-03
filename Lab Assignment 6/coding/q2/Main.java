import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner strInput = new Scanner(System.in);
        Scanner intInput = new Scanner(System.in);

        QUEUE qCustomer = new QUEUE();

        QUEUE qQualify = new QUEUE();

        System.out.print("Please enter number of records: ");
        int rec = intInput.nextInt();

        System.out.println();

        for (int i = 0; i < rec; i++) {
            System.out.print("Enter customer name: ");
            String name = strInput.nextLine();

            System.out.print("Enter account number: ");
            int accountNo = intInput.nextInt();

            System.out.print("Enter saving (RM): ");
            double saving = intInput.nextDouble();

            System.out.print("Enter total transaction (RM): ");
            double totalTransaction = intInput.nextDouble();

            Customer customer = new Customer(name, accountNo, saving, totalTransaction);

            qCustomer.enqueue(customer);
            if (customer.process()) {
                qQualify.enqueue(customer);
            }

            System.out.println();
        }

        System.out.println("List of customers that has more than RM 1000 saving after transaction:\n");

        while (!qQualify.isEmpty()) {
            System.out.println(qQualify.dequeue() + "\n");
        }

        intInput.close();
        strInput.close();

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
        return "Customer name: " + name + "\nAccount No: " + accountNo + "\nSaving: RM "
                + String.format("%,.2f", saving)
                + "\nTotal Transaction: RM " + String.format("%,.2f", totalTransaction);
    }

    public boolean process() {
        return saving - totalTransaction > 1000;
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
        if (this.first != null) {
            return this.first.data;
        } else {
            return null;
        }
    }

    public Object getNext() {
        if (this.first != null && this.first.link != null) {
            return this.first.link.data;
        } else {
            return null;
        }
    }

    public Object getLast() {
        if (this.last != null) {
            return this.last.data;
        } else {
            return null;
        }
    }
}
