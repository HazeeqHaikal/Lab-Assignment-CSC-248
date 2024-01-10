
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TreeNode root = null;
        bookRecord record = new bookRecord();
        Book[] books = new Book[8];

        // initialize the book
        for (int i = 0; i < books.length; i++) {
            books[i] = new Book();
        }

        // insert the book into the tree
        books[0].setData(1217, "Bunga Dedap", "Daud Kamal", 'A', "Sejana", 1998);
        books[1].setData(1324, "Fizik", "Prof. Bun Tat", 'C', "Mc Graw", 2000);
        books[2].setData(1001, "Kimia", "Prof. Kamarul", 'C', "Anderson", 2001);
        books[3].setData(1009, "Botani", "Puan Salmah", 'E', "Mutiara", 1999);
        books[4].setData(781, "Komputer", "Dr Abu ", 'D', "Deitel", 2001);
        books[5].setData(4320, "Sosial", "Dr Kamariah", 'B', "Mutiara", 1998);
        books[6].setData(2700, "Ilmu Alam ", "Dr Kamarudin ", 'A', "Mutiara ", 1999);
        books[7].setData(1243, "Sejarah ", "Puan Kalsom ", 'B', "Tamadun ", 1989);

        // insert the book into the tree using the insert method
        for (int i = 0; i < books.length; i++) {
            if (root == null) {
                root = new TreeNode(books[i]);
            } else {
                root.insert(books[i]);
            }
        }

        // set the root
        record.setRoot(root);

        while (true) {

            System.out.println("1. Count the number of books in the tree");
            System.out.println("2. Search for a book");
            System.out.println("3. Display all books");
            System.out.println("4. Exit");
            System.out.print("\nEnter your choice: ");
            int choice = input.nextInt();

            System.out.println();

            switch (choice) {
                case 1:
                    // record.countBookCode(root);
                    record.countBookCode();
                    break;
                case 2:
                    System.out.print("Enter the serial number: ");
                    int serialNum = input.nextInt();

                    System.out.println();

                    record.searchBook(serialNum);
                    break;
                case 3:
                    record.displayAll();
                    break;
                case 4:
                    System.out.println("Thank you for using this program!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }

            System.out.println();
        }

    }
}
