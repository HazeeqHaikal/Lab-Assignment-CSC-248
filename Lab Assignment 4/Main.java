import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner strInput = new Scanner(System.in);
        Scanner intInput = new Scanner(System.in);

        int choice = 0;

        System.out.println("Welcome to Computer List Program\n");

        List list = new List();

        while (choice != 6) {

            System.out.print(
                    "1. Insert a new node into list\n2. Delete node from list based on serial number\n3. Print output of computer's information\n4. Count and return the number of computers which exceed a certain amount price\n5. Display all lists\n6. Exit\n\nEnter your choice: ");
            choice = intInput.nextInt();

            System.out.println();
            if (choice == 1) {
                System.out.print("Enter serial number: ");
                int serialNo = intInput.nextInt();

                // check if theres any computer with the same serial number
                ListNode curr = list.getFirstNode();
                // boolean exist = false;
                while (curr != null) {
                    if (((Computer) curr.getObj()).getSerialNo() == serialNo) {
                        System.out.println("Serial number already exist\n");
                        // exist = true;

                        System.out.print("Enter serial number: ");
                        serialNo = intInput.nextInt();

                        // reset curr to first node to check again if theres duplication
                        curr = list.getFirstNode();
                    }
                    curr = curr.getNext();
                }

                System.out.print("Enter brand: ");
                String brand = strInput.nextLine();
                System.out.print("Enter year: ");
                int year = intInput.nextInt();
                System.out.print("Enter price (RM): ");
                double price = intInput.nextDouble();

                System.out.print(
                        "\n1. Insert at the beginning of the list\n2. Insert at the end of the list\n3. Insert at middle of the list\n4. Insert node at specific index\n\nEnter your choice: ");
                int choice2 = intInput.nextInt();

                if (choice2 == 1) {
                    list.insertAtFront(new Computer(serialNo, brand, year, price));
                } else if (choice2 == 2) {
                    list.insertAtBack(new Computer(serialNo, brand, year, price));
                } else if (choice2 == 3) {
                    list.insertAtMiddle(new Computer(serialNo, brand, year, price));
                } else if (choice2 == 4) {
                    if (list.getSize() == 0) {
                        System.out.println("List is empty");
                        continue;
                    }

                    System.out.print("Enter index (0 - " + list.getSize() + "): ");
                    int index = intInput.nextInt();

                    if (index < 0 || index > list.getSize()) {
                        System.out.println("Index is not reachable");
                        continue;
                    }
                    list.insertAtIndex(new Computer(serialNo, brand, year, price), index);
                } else {
                    System.out.println("Invalid choice");
                }
            } else if (choice == 2) {
                System.out.print("Enter serial number: ");
                int serialNo = intInput.nextInt();
                if (list.remove(serialNo) == null) {
                    System.out.println("Serial number not found\n");
                } else {
                    System.out.println("Serial number *" + serialNo + "* has been deleted\n");
                }
            } else if (choice == 3) {
                System.out.print("Enter serial number: ");
                int serialNo = intInput.nextInt();
                list.searchComputer(serialNo);
            } else if (choice == 4) {
                System.out.print("Enter price to print out which computers price exceed it (RM): ");
                double price = intInput.nextDouble();

                System.out.printf("\n\nComputer Information about price exceed RM %,.2f\n\n", price);

                System.out.printf("\n\nThere's %d computers which exceed RM %,.2f\n\n", list.countComputer(price),
                        price);

            } else if (choice == 5) {
                list.print();
            } else {
                System.out.println("Program terminating...");
            }

            System.out.println();
        }

        strInput.close();
        intInput.close();
    }
}
