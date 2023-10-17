import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args) {
        Scanner strInput = new Scanner(System.in);
        Scanner intInput = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println("The elements are: " + numbers);

        System.out.println();

        System.out.print(
                "1. Add new elements into the ArrayList\n2. Delete element from the ArrayList\n3. The number of elements in the list\n4. Calculate the sum of all elements in the list\n6. Exit\n\nEnter your choice: ");
        int choice = intInput.nextInt();

        while (choice != 6) {
            switch (choice) {
                case 1:
                    System.out.print("Enter the number of elements to be added: ");
                    int num = intInput.nextInt();
                    for (int i = 0; i < num; i++) {
                        System.out.print("Enter the number: ");
                        int number = intInput.nextInt();
                        numbers.add(number);
                    }
                    System.out.println("The elements are: " + numbers);
                    break;
                case 2:
                    System.out.print("Enter the index of the element to be deleted: ");
                    int index = intInput.nextInt();
                    try {
                        numbers.get(index);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Invalid index!");
                        break;
                    }
                    System.out.println("Before removing element at index " + index + ": " + numbers);
                    numbers.remove(index);
                    System.out.println("After removing element at index " + index + ": " + numbers);
                    break;
                case 3:
                    System.out.println("The number of elements in the list: " + numbers.size());
                    break;
                case 4:
                    int sum = 0;
                    for (int i = 0; i < numbers.size(); i++) {
                        sum += numbers.get(i);
                    }
                    System.out.println("The sum of all elements in the list: " + sum);
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
            System.out.print(
                    "\n1. Add new elements into the ArrayList\n2. Delete element from the ArrayList\n3. The number of elements in the list\n4. Calculate the sum of all elements in the list\n6. Exit\n\nEnter your choice: ");
            choice = intInput.nextInt();
        }

        System.out.println("Thank you for using this program!");

        strInput.close();
        intInput.close();
    }
}