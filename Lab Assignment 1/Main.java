import java.io.BufferedReader;
import java.io.FileReader;
// import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner strInput = new Scanner(System.in);
        Scanner intInput = new Scanner(System.in);

        // ArrayList<Land> lands = new ArrayList<Land>();

        Land[] lands = null;

        // read customerData.txt
        try {
            BufferedReader br = new BufferedReader(new FileReader("customerData.txt"));
            // get the number of lines in the file
            int count = 0;
            String line = br.readLine();
            while (line != null) {
                count++;
                line = br.readLine();
            }
            br.close();

            lands = new Land[count];
            count = 0;

            br = new BufferedReader(new FileReader("customerData.txt"));
            line = br.readLine();
            while (line != null) {
                String id = line.split(";")[0];
                String ownerName = line.split(";")[1];
                char houseType = line.split(";")[2].charAt(0);
                double area = Double.parseDouble(line.split(";")[3]);

                lands[count] = new Land(id, ownerName, houseType, area);
                count++;
                line = br.readLine();
            }

            br.close();
        } catch (Exception e) {
            System.out.println(e.getMessage() + "\nAt line: " + e.getStackTrace()[0].getLineNumber());
        }

        while (true) {
            System.out.println("---------------------------------------");
            System.out.println("Menu Selection");
            System.out.println("\n1. Sorting using Bubble Sort");
            System.out.println("2. Sorting using Insertion Sort");
            System.out.println("3. Searching using Binary Search");
            System.out.println("4. Exit");
            System.out.print("\nYour Option: ");
            int option = intInput.nextInt();

            System.out.println("---------------------------------------\n");
            if (option == 1) {

                System.out.println("Sorting using Bubble Sort\n");

                bubbleSort(lands);

                for (int i = 0; i < lands.length; i++) {
                    System.out.println(lands[i].toString());
                    System.out.printf("Tax: RM %,.2f\n", lands[i].calculateTax());
                    System.out.println();
                }

                System.out.println("This is sorted based on the tax price");

                // O(n^2)
                // for (int i = 0; i < lands.size() - 1; i++) {
                // for (int j = 0; j < lands.size() - i - 1; j++) {
                // if (lands.get(j).calculateTax() > lands.get(j + 1).calculateTax()) {
                // Land temp = lands.get(j);
                // lands.set(j, lands.get(j + 1));
                // lands.set(j + 1, temp);
                // counter++;
                // }
                // }
                // }

            } else if (option == 2) {

                System.out.println("Sorting using Insertion Sort\n");

                insertionSort(lands);

                for (int i = 0; i < lands.length; i++) {
                    System.out.println(lands[i].toString());
                    System.out.printf("Tax: RM %,.2f\n", lands[i].calculateTax());
                    System.out.println();
                }

                System.out.println("This is sorted based on the ID");

                // sort based on id and display the list
                // for (int i = 1; i < lands.size(); i++) {
                // Land key = lands.get(i);
                // int j = i - 1;

                // while (j >= 0 && lands.get(j).getId().compareTo(key.getId()) > 0) {
                // lands.set(j + 1, lands.get(j));
                // j--;
                // counter++;
                // }

                // lands.set(j + 1, key);

                // }

                // for (Land land : lands) {
                // System.out.println(land.toString());
                // System.out.printf("Tax: RM %,.2f\n", land.calculateTax());
                // System.out.println();
                // }

            } else if (option == 3) {
                System.out.println("Searching using Binary Search\n");

                System.out.print("Enter the ID to search: ");
                String id = strInput.nextLine();

                Land land = binarySearch(lands, id);

                if (land != null) {
                    System.out.println(land.toString());
                    System.out.printf("Tax: RM %,.2f\n", land.calculateTax());
                } else {
                    System.out.println("Land not found!");
                }

                // sort based on id and display the list
                // for (int i = 1; i < lands.size(); i++) {
                // Land key = lands.get(i);
                // int j = i - 1;

                // while (j >= 0 && lands.get(j).getId().compareTo(key.getId()) > 0) {
                // lands.set(j + 1, lands.get(j));
                // j--;
                // }

                // lands.set(j + 1, key);
                // }

                // int high = lands.size() - 1;

                // while (low <= high) {
                // if (lands.get(mid).getId().compareTo(id) < 0) {
                // low = mid + 1;
                // } else if (lands.get(mid).getId().compareTo(id) == 0) {
                // System.out.println(lands.get(mid).toString());
                // System.out.printf("Tax: RM %,.2f\n", lands.get(mid).calculateTax());
                // break;
                // } else {
                // high = mid - 1;
                // }

                // mid = (low + high) / 2;
                // counter++;
                // }

            } else if (option == 4) {
                System.out.println("Thank you for using this program!");
                break;
            }

            while (option < 1 || option > 4) {
                System.out.println("Invalid option!");
                System.out.print("\nYour Option: ");
                option = intInput.nextInt();
            }

            System.out.println("Enter any key to continue...");
            strInput.nextLine();

        }
        strInput.close();
        intInput.close();
    }

    // bubble sort method
    public static Land[] bubbleSort(Land[] lands) {

        System.out.println("Sorting using Bubble Sort\n");
        for (int i = 0; i < lands.length - 1; i++) {
            for (int j = 0; j < lands.length - i - 1; j++) {
                if (lands[j].calculateTax() > lands[j + 1].calculateTax()) {
                    Land temp = lands[j];
                    lands[j] = lands[j + 1];
                    lands[j + 1] = temp;
                }
            }
        }

        return lands;

    }

    // insertion sort method
    public static Land[] insertionSort(Land[] lands) {
        for (int i = 1; i < lands.length; i++) {
            Land key = lands[i];
            int j = i - 1;

            while (j >= 0 && lands[j].getId().compareTo(key.getId()) > 0) {
                lands[j + 1] = lands[j];
                j--;
            }

            lands[j + 1] = key;
        }

        return lands;
    }

    // binary search method
    public static Land binarySearch(Land[] lands, String id) {

        insertionSort(lands);

        int low = 0;
        int high = lands.length - 1;
        int mid = (low + high) / 2;

        while (low <= high) {
            if (lands[mid].getId().compareTo(id) < 0) {
                low = mid + 1;
            } else if (lands[mid].getId().compareTo(id) == 0) {
                return lands[mid];
            } else {
                high = mid - 1;
            }

            mid = (low + high) / 2;
        }

        return null;
    }
}
