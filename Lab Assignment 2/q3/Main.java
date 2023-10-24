import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner strInput = new Scanner(System.in);
        Scanner intInput = new Scanner(System.in);

        ArrayList<Product> listProduct1 = new ArrayList<Product>();
        ArrayList<Product> listProduct2 = new ArrayList<Product>();
        ArrayLists arrayList = new ArrayLists();


        System.out.println("Inserting ten products into listProduct1");

        // insert ten products into listProduct1
        listProduct1.add(new Product("Pen", 9.99, 100));
        listProduct1.add(new Product("Eraser", 0.99, 10000));
        listProduct1.add(new Product("Pencil", 1.99, 300));
        listProduct1.add(new Product("Ruler", 2.99, 259));
        listProduct1.add(new Product("Sharpener", 3.99, 500));
        listProduct1.add(new Product("Scissor", 4.99, 50));
        listProduct1.add(new Product("Paper", 5.99, 99));
        listProduct1.add(new Product("Book", 6.99, 369));
        listProduct1.add(new Product("Bag", 7.99, 20));
        listProduct1.add(new Product("Pencil Case", 8.99, 10));

        // display all records in listProduct1
        System.out.println("List of products in listProduct1: ");
        for (int i = 0; i < listProduct1.size(); i++) {
            System.out.println(listProduct1.get(i).getProductName());
        }

        System.out.println();

        System.out.print("Enter product name to be searched: ");
        String productName = strInput.nextLine();

        // search for the product
        int index = -1;
        for (int i = 0; i < listProduct1.size(); i++) {
            if (listProduct1.get(i).getProductName().equalsIgnoreCase(productName)) {
                index = i;
                break;
            }
        }

        System.out.println();
        if (index == -1) {
            System.out.println("Product not found!");
        } else {
            System.out.println("Product found!");
            System.out.println("\nProduct details:\n" + listProduct1.get(index));
        }

        System.out.println();

        System.out.println("Press enter to continue...");
        strInput.nextLine();

        // clear terminal
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("Finding product name that is pen and update quantity to 30 and price with rm1.00");
        System.out.println();

        System.out.println("Before update product details:");
        for (int i = 0; i < listProduct1.size(); i++) {
            if (listProduct1.get(i).getProductName().equalsIgnoreCase("pen")) {
                System.out.println(listProduct1.get(i));
                break;
            }
        }

        System.out.println();

        // find productName that is pen and update quantity to 30 and price with rm1.00
        boolean found = false;
        for (int i = 0; i < listProduct1.size(); i++) {
            if (listProduct1.get(i).getProductName().equalsIgnoreCase("pen")) {
                listProduct1.get(i).setQuantity(30);
                listProduct1.get(i).setPrice(1.00);
                System.out.println("Updated product details:\n" + listProduct1.get(i));
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Product not found!");
        }

        System.out.println();

        System.out.println("Press enter to continue...");
        strInput.nextLine();

        // clear terminal
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("Removing all records for total price more than rm1000 and store into listProduct2");

        // remove all records for total price more than rm1000 and store into
        // listProduct2
        System.out.println("Removed product details:");
        System.out.println();
        for (int i = 0; i < listProduct1.size(); i++) {
            double totalPrice = listProduct1.get(i).getPrice() * listProduct1.get(i).getQuantity();
            if (totalPrice > 1000) {
                listProduct2.add(listProduct1.get(i));
                System.out.println(listProduct1.get(i));
                listProduct1.remove(i);
                i--;
            }
        }

        System.out.println();

        System.out.println("Press enter to continue...");
        strInput.nextLine();

        // clear terminal
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // display all records in listProduct1 and listProduct2
        System.out.println("List of products in listProduct1:\n");
        for (int i = 0; i < listProduct1.size(); i++) {
            System.out.println(listProduct1.get(i));
        }

        System.out.println("List of products in listProduct2:\n");
        for (int i = 0; i < listProduct2.size(); i++) {
            System.out.println(listProduct2.get(i));
        }

        System.out.println("Press enter to end program...");
        strInput.nextLine();

    }
}