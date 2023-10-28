import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Salesperson> salespersonList = new LinkedList<Salesperson>();

        Scanner strInput = new Scanner(System.in);
        Scanner intInput = new Scanner(System.in);

        String name, id;
        double sales;

        System.out.print("Salesperson amount: ");
        int size = intInput.nextInt();

        System.out.println();

        for (int i = 0; i < size; i++) {
            System.out.println("Salesperson " + (i + 1) + ":\n");

            System.out.print("Enter name: ");
            name = strInput.nextLine();
            System.out.print("Enter ID: ");
            id = strInput.nextLine();
            System.out.print("Enter sales (RM): ");
            sales = intInput.nextDouble();

            salespersonList.add(new Salesperson(name, id, sales));
            System.out.println();
        }

        // total sales
        double totalSales = 0.0;
        for (Salesperson salesperson : salespersonList) {
            totalSales += salesperson.getSales();
        }

        System.out.printf("Total sales: RM%,.2f\n", totalSales);

        // use bubble sort to sort salespersonList by sales
        for (int i = 0; i < salespersonList.size() - 1; i++) {
            for (int j = 0; j < salespersonList.size() - i - 1; j++) {
                if (salespersonList.get(j).getSales() > salespersonList.get(j + 1).getSales()) {
                    Salesperson temp = salespersonList.get(j);
                    salespersonList.set(j, salespersonList.get(j + 1));
                    salespersonList.set(j + 1, temp);
                }
            }
        }

        System.out.println("\nSales person with the highest sales:\n");
        // takes the last element of the sorted list
        System.out.println(salespersonList.getLast());

        // takes the first element of the sorted list
        System.out.println("\nSales person with the lowest sales:\n");
        System.out.println(salespersonList.getFirst());

        // calculate total commission
        double totalCommission = 0.0;
        for (Salesperson salesperson : salespersonList) {
            totalCommission += salesperson.calculateCommission();
        }

        System.out.printf("\nTotal commission: RM%,.2f\n", totalCommission);

        // calculate average commission
        double averageCommission = totalCommission / salespersonList.size();
        System.out.printf("Average commission: RM%,.2f\n", averageCommission);

    }
}
