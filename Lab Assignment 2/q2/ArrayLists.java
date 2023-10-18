import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args) {
        Scanner strInput = new Scanner(System.in);
        Scanner intInput = new Scanner(System.in);

        
        ArrayList<String> names = new ArrayList<String>();
        names.add("Hazeeq");
        names.add("Khairul");
        names.add("Redza");
        
        System.out.println("Current ArrayList: " + names);
        
        System.out.print("1. Add new elements to the ArrayList\n2. Delete element from a list\n3. The number of elements in the list\n4. To determine either the name exist or not in a list\n6. Exit\nEnter your choice: ");
        int choice = intInput.nextInt();
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
                try{
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
                System.out.println("Does the name exist in the list? " + names.contains(name));
            } else if (choice == 6) {
                break;
            } else {
                System.out.println("Invalid input!");
            }
            System.out.print("1. Add new elements to the ArrayList\n2. Delete element from a list\n3. The number of elements in the list\n4. To determine either the name exist or not in a list\n6. Exit\nEnter your choice: ");
            choice = intInput.nextInt();

        }
    }
}