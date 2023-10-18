import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        Scanner strInput = new Scanner(System.in);
        Scanner intInput = new Scanner(System.in);

        ArrayList<Product> listProduct1 = new ArrayList<Product>();
        ArrayList<Product> listProduct2 = new ArrayList<Product>();

        // insert ten products into listProduct1
        listProduct1.add(new Product("Apple", 1.99, 10));
        listProduct1.add(new Product("Banana", 0.99, 20));
        listProduct1.add(new Product("Orange", 2.99, 30));
        listProduct1.add(new Product("Grape", 3.99, 40));
        listProduct1.add(new Product("Watermelon", 4.99, 50));
        listProduct1.add(new Product("Pineapple", 5.99, 60));
        listProduct1.add(new Product("Mango", 6.99, 70));
        listProduct1.add(new Product("Strawberry", 7.99, 80));
        listProduct1.add(new Product("Blueberry", 8.99, 90));
        listProduct1.add(new Product("Pen", 9.99, 100));

        System.out.print("Enter product name to be searched: ");
        String productName = strInput.nextLine();

        // search for the product
        int index = -1;
        for (int i = 0; i < listProduct1.size(); i++) {
            if (listProduct1.get(i).getProductName().equals(productName)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Product not found!");
        } else {
            System.out.println("Product found!");
            System.out.println("Product details: " + listProduct1.get(index));
        }

        // find productName that is pen and update quantity to 30 and price with rm1.00
        boolean found = false;
        for (int i = 0; i < listProduct1.size(); i++) {
            if (listProduct1.get(i).getProductName().equals("Pen")) {
                listProduct1.get(i).setQuantity(30);
                listProduct1.get(i).setPrice(1.00);
                System.out.println("Updated product details: " + listProduct1.get(i));
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Product not found!");
        }

        // remove all records for total price more than rm1000 and store into listProduct2
        for (int i = 0; i < listProduct1.size(); i++) {
            if (listProduct1.get(i).getPrice() * listProduct1.get(i).getQuantity() > 1000) {
                listProduct2.add(listProduct1.get(i));
                System.out.println("Removed product details: " + listProduct1.get(i));
                listProduct1.remove(i);
                i--;
            }
        }

        // display all records in listProduct1 and listProduct2
        System.out.println("List of products in listProduct1: ");
        for (int i = 0; i < listProduct1.size(); i++) {
            System.out.println(listProduct1.get(i));
        }

        System.out.println("List of products in listProduct2: ");
        for (int i = 0; i < listProduct2.size(); i++) {
            System.out.println(listProduct2.get(i));
        }

    }
}