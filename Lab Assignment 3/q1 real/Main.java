import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner strInput = new Scanner(System.in);
        Scanner intInput = new Scanner(System.in);

        LinkedList<Friend> sList = new LinkedList<Friend>();

        System.out.println(
                "1. Insert records\n2. View record\n3. Remove the record\n4. Update record\n5. Print all records\n6. Exit\n");

        System.out.print("Enter your choice: ");
        int choice = intInput.nextInt();

        System.out.println();

        while (choice != 6) {
            switch (choice) {
                case 1:
                    System.out.print("Enter the number of friends: ");
                    int numFriends = intInput.nextInt();

                    System.out.println();

                    for (int i = 0; i < numFriends; i++) {
                        System.out.print("Enter the ID number of friend " + (i + 1) + ": ");
                        int idno = intInput.nextInt();

                        System.out.print("Enter the name of friend " + (i + 1) + ": ");
                        String name = strInput.nextLine();

                        System.out.print("Enter the phone number of friend " + (i + 1) + ": ");
                        String hpno = strInput.nextLine();

                        System.out.print("Enter the email of friend " + (i + 1) + ": ");
                        String email = strInput.nextLine();

                        // check if idno already exists
                        if (sList.contains(new Friend(idno, name, hpno, email))) {
                            System.out.println("The data already exists. Please re-enter.");
                            System.out.println();
                            i--;
                            continue;
                        } else {
                            sList.add(new Friend(idno, name, hpno, email));
                        }

                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.print("Enter the ID number of the friend to view: ");
                    int idno = intInput.nextInt();

                    System.out.println();

                    boolean found = false;
                    for (Friend friend : sList) {
                        if (friend.getIdno() == idno) {
                            System.out.println("ID number: " + friend.getIdno());
                            System.out.println("Name: " + friend.getName());
                            System.out.println("Phone number: " + friend.getHpno());
                            System.out.println("Email: " + friend.getEmail());
                            System.out.println();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("The data does not exist.");
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.print("Enter the ID number of the friend to remove: ");
                    idno = intInput.nextInt();

                    System.out.println();

                    found = false;
                    for (Friend friend : sList) {
                        if (friend.getIdno() == idno) {
                            sList.remove(friend);
                            System.out.println("The data has been removed.");
                            System.out.println();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("The data does not exist.");
                        System.out.println();
                    }

                    break;
                case 4:
                    System.out.print("Enter the ID number of the friend to update: ");
                    idno = intInput.nextInt();

                    System.out.println();

                    found = false;
                    for (Friend friend : sList) {
                        if (friend.getIdno() == idno) {

                            System.out.print("Enter the new phone number of friend " + idno + ": ");
                            String hpno = strInput.nextLine();

                            System.out.print("Enter the new email of friend " + idno + ": ");
                            String email = strInput.nextLine();

                            friend.setHpno(hpno);
                            friend.setEmail(email);

                            System.out.println("The data has been updated.");
                            System.out.println();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("The data does not exist.");
                        System.out.println();
                    }
                    break;
                case 5:
                    for (Friend friend : sList) {
                        System.out.println("ID number: " + friend.getIdno());
                        System.out.println("Name: " + friend.getName());
                        System.out.println("Phone number: " + friend.getHpno());
                        System.out.println("Email: " + friend.getEmail());
                        System.out.println();
                    }
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }

            System.out.println(
                    "1. Insert records\n2. View record\n3. Remove the record\n4. Update record\n5. Print all records\n6. Exit\n");

            System.out.print("Enter your choice: ");
            choice = intInput.nextInt();

            System.out.println();
        }

    }
}
