import java.util.Scanner;

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
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the postfix expression: ");
        String exp = input.nextLine();

        LinkedLists stack = new LinkedLists();
        // Stack stack = new Stack();
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
