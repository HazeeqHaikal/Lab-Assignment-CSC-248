import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner strInput = new Scanner(System.in);
        Scanner intInput = new Scanner(System.in);
        BSTcCrimeComplaint bst = new BSTcCrimeComplaint();


        String[][] complaints = {
                { "Complaint Elements", "Year", "Total Complaints" },
                { "Obscene", "2019", "969" },
                { "Obscene", "2020", "850" },
                { "False", "2019", "2117" },
                { "False", "2020", "3050" },
                { "Offensive", "2019", "1311" },
                { "Offensive", "2020", "2312" },
                { "Indecent", "2019", "139" },
                { "Indecent", "2020", "188" },
                { "Menacing", "2019", "45" },
                { "Menacing", "2020", "88" },
                { "Others", "2019", "3938" },
                { "Others", "2020", "7472" }
        };

        for (int i = 1; i < complaints.length; i++) {
            bst.insertNode(new CCrimeComplaint(complaints[i][0], Integer.parseInt(complaints[i][2]),
                    Integer.parseInt(complaints[i][1])));
        }

        // System.out.println("1. Display all complaint elements");
        // System.out.println("2. Display specific complaint elements");
        // System.out.println("3. Calculate total complaints for a specific year");
        // System.out.println("4. Calculate increment percentage for total number of complaints from 2019 to 2020");
        // System.out.println("5. Exit");
        // System.out.print("\nEnter your choice: ");
        // int choice = intInput.nextInt();

        // switch (choice) {
        //     case 1:
        //         bst.cElementDisplayAll();
        //         break;
        //     case 2:
        //         System.out.print("Enter complaint element: ");
        //         String cElement = strInput.nextLine();
        //         bst.displayBySpesific(cElement);
        //         break;
        //     case 3:
        //         System.out.print("Enter year: ");
        //         int year = intInput.nextInt();
        //         System.out.println("\nTotal complaints for year " + year + ": " + bst.calTotComplaint(year));
        //         break;
        //     case 4:
        //         System.out.println("\n2020 complaint amount: " + bst.calTotComplaint(2020));
        //         System.out.println("2019 complaint amount: " + bst.calTotComplaint(2019));

        //         // change to double to get decimal
        //         double percentage = ((double) (bst.calTotComplaint(2020) - bst.calTotComplaint(2019))
        //                 / (double) bst.calTotComplaint(2019)) * 100;

        //         System.out.println("\n((" + bst.calTotComplaint(2020) + " - " + bst.calTotComplaint(2019) + ") / "
        //                 + bst.calTotComplaint(2019) + ") * 100 = " + percentage + "%");

        //         System.out.println("\nIncrement percentage for total number of complaints from 2019 to 2020: "
        //                 + String.format("%.2f", percentage) + "%");

        //         break;
        //     case 5:
        //         System.exit(0);
        //         break;
        //     default:
        //         System.out.println("Invalid choice");
        //         break;
        // }

        // put into while loop
        while (true) {
            System.out.println("1. Display all complaint elements");
            System.out.println("2. Display specific complaint elements");
            System.out.println("3. Calculate total complaints for a specific year");
            System.out.println("4. Calculate increment percentage for total number of complaints from 2019 to 2020");
            System.out.println("5. Exit");
            System.out.print("\nEnter your choice: ");
            int choice = intInput.nextInt();

            switch (choice) {
                case 1:
                    bst.cElementDisplayAll();
                    break;
                case 2:
                    System.out.print("Enter complaint element: ");
                    String cElement = strInput.nextLine();
                    bst.displayBySpesific(cElement);
                    break;
                case 3:
                    System.out.print("Enter year: ");
                    int year = intInput.nextInt();
                    System.out.println("\nTotal complaints for year " + year + ": " + bst.calTotComplaint(year));
                    break;
                case 4:
                    System.out.println("\n2020 complaint amount: " + bst.calTotComplaint(2020));
                    System.out.println("2019 complaint amount: " + bst.calTotComplaint(2019));

                    // change to double to get decimal
                    double percentage = ((double) (bst.calTotComplaint(2020) - bst.calTotComplaint(2019))
                            / (double) bst.calTotComplaint(2019)) * 100;

                    System.out.println("\n((" + bst.calTotComplaint(2020) + " - " + bst.calTotComplaint(2019) + ") / "
                            + bst.calTotComplaint(2019) + ") * 100 = " + percentage + "%");

                    System.out.println("\nIncrement percentage for total number of complaints from 2019 to 2020: "
                            + String.format("%.2f", percentage) + "%");

                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }

            System.out.println();
        }

    }
}
