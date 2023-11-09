import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner strInput = new Scanner(System.in);
        Scanner intInput = new Scanner(System.in);

        System.out.print(
                "1. Insert a new node into list\n2. Delete note from list based on serial number\n3. Print output of computer's information\n4. Count and return the number of computers which exceed a certain amount price\n5. Exit\nEnter your choice: ");
        int choice = intInput.nextInt();

        List list = new List();

        System.out.println();
        while (choice != 5) {
            if (choice == 1) {
                System.out.print("Enter serial number: ");
                int serialNo = intInput.nextInt();
                System.out.print("Enter brand: ");
                String brand = strInput.nextLine();
                System.out.print("Enter year: ");
                int year = intInput.nextInt();
                System.out.print("Enter price: ");
                double price = intInput.nextDouble();

                System.out.print(
                        "1. Insert at the beginning of the list\n2. Insert at the end of the list\n3. Insert at middle of the list\nEnter your choice: ");
                int choice2 = intInput.nextInt();

                if (choice2 == 1) {
                    list.insertAtFront(new Computer(serialNo, brand, year, price));
                } else if (choice2 == 2) {
                    list.insertAtBack(new Computer(serialNo, brand, year, price));
                } else if (choice2 == 3) {
                    list.insertAtMiddle(new Computer(serialNo, brand, year, price));
                } else {
                    System.out.println("Invalid choice");
                }
            } else if (choice == 2) {
                System.out.print("Enter serial number: ");
                int serialNo = intInput.nextInt();
                list.remove(serialNo);
            } else if (choice == 3) {
                System.out.print("Enter serial number: ");
                int serialNo = intInput.nextInt();
                list.searchComputer(serialNo);
            } else if (choice == 4) {
                System.out.print("Enter price to print out which computers price exceed it: ");
                double price = intInput.nextDouble();
                System.out.println("Number of computers which exceed " + price + ": " + list.countComputer(price));
            } else {
                System.out.println("Invalid choice");
            }
            System.out.print(
                    "\n1. Insert a new node into list\n2. Delete note from list based on serial number\n3. Print output of computer's information\n4. Count and return the number of computers which exceed a certain amount price\n5. Exit\nEnter your choice: ");
            choice = intInput.nextInt();
        }

        strInput.close();
        intInput.close();

        System.out.println("Program terminating...");
    }
}
