class Node {
    int data;
    Node next;
}

class LinkedLists {
    Node top;

    LinkedLists() {
        top = null;
    }

    void push(int data) {
        Node node = new Node();
        node.data = data;
        node.next = top;
        top = node;
    }

    int pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            int temp = top.data;
            top = top.next;
            return temp;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        String exp = "2 6 * 3 - / 5 5 * +";

        LinkedLists stack = new LinkedLists();
        String[] tokens = exp.split(" ");
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(a + b);
            } else if (tokens[i].equals("-")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b - a);
            } else if (tokens[i].equals("*")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(a * b);
            } else if (tokens[i].equals("/")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b / a);
            } else {
                stack.push(Integer.parseInt(tokens[i]));
            }
        }

        System.out.println("postfix evaluation: " + stack.pop());

    }
}
