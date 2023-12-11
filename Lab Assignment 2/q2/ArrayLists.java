import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args) {
        Scanner strInput = new Scanner(System.in);
        Scanner intInput = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<String>();
        names.add("Khairul");
        names.add("Hazeeq");
        names.add("Redza");

        // makes all the names in the list to be in uppercase
        for (int i = 0; i < names.size(); i++) {
            names.set(i, names.get(i).toUpperCase());
        }

        System.out.println("Current ArrayList: " + names);

        System.out.print(
                "\n1. Add new elements to the ArrayList\n2. Delete element from a list\n3. The number of elements in the list\n4. To determine either the name exist or not in a list\n5. Sort the list of names in ascending order\n7. Exit\nEnter your choice: ");
        int choice = intInput.nextInt();

        System.out.println();
        while (true) {
            if (choice == 1) {
                System.out.print("Enter the number of elements: ");
                int num = intInput.nextInt();
                for (int i = 0; i < num; i++) {
                    System.out.print("Enter the name: ");
                    String name = strInput.nextLine();
                    names.add(name);
                }
                System.out.println("The elements are: " + names);
            } else if (choice == 2) {
                System.out.print("Enter the index of the element to be removed: ");
                int index = intInput.nextInt();
                try {
                    names.get(index);
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Index out of bounds!");
                    continue;
                }
                names.remove(index);
                System.out.println("After removing element at index " + index + ": " + names);
            } else if (choice == 3) {
                System.out.println("The number of elements in the list: " + names.size());
            } else if (choice == 4) {
                System.out.print("Enter the name to be searched: ");
                String name = strInput.nextLine();
                boolean found = names.contains(name.toUpperCase());
                if (found) {
                    System.out.println("The name exist in the list!");
                } else {
                    System.out.println("The name does not exist in the list!");
                }

            } else if (choice == 5) {
                // bubble sort
                for (int i = 0; i < names.size(); i++) {
                    for (int j = i + 1; j < names.size(); j++) {
                        if (names.get(i).compareTo(names.get(j)) > 0) {
                            String temp = names.get(i);
                            names.set(i, names.get(j));
                            names.set(j, temp);
                        }
                    }
                }

                // insertion sort
                for (int i = 1; i < names.size(); i++) {
                    String temp = names.get(i);
                    for (int j = i - 1; j >= 0; j--) {
                        if (names.get(j).compareTo(temp) > 0) {
                            names.set(j + 1, names.get(j));
                            names.set(j, temp);
                        }
                    }
                }

                System.out.println("The elements are: " + names);
            } else if (choice == 7) {
                break;
            } else {
                System.out.println("Invalid input!");
            }
            System.out.print(
                    "\n1. Add new elements to the ArrayList\n2. Delete element from a list\n3. The number of elements in the list\n4. To determine either the name exist or not in a list\n5. Sort the list of names in ascending order\n7. Exit\nEnter your choice: ");
            choice = intInput.nextInt();

            System.out.println();

        }

        System.out.println("Thank you for using this program!");

        strInput.close();
        intInput.close();
    }
}