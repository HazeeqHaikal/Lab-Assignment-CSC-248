import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner strInput = new Scanner(System.in);
        Scanner intInput = new Scanner(System.in);

        LinkedList<Cloth> clothes = new LinkedList<Cloth>();

        System.out.print("Enter the number of clothes: ");
        int numClothes = intInput.nextInt();

        System.out.println();
        for (int i = 0; i < numClothes; i++) {
            System.out.print("Enter the name of the cloth: ");
            String name = strInput.nextLine();

            System.out.print("Enter the price of the cloth (in RM): ");
            double price = intInput.nextDouble();

            System.out.print("Enter the length of the cloth (in metres): ");
            double length = intInput.nextDouble();

            clothes.add(new Cloth(name, price, length));
            System.out.println();
        }

        System.out.println("Clothes list:");
        for (Cloth cloth : clothes) {
            System.out.println(cloth);
            System.out.println("Payment: RM" + cloth.calcPayment() + "\n");
        }

        // Calculate total payment
        double totalPayment = 0;
        for (Cloth cloth : clothes) {
            totalPayment += cloth.calcPayment();
        }

        System.out.println("Total payment: RM" + totalPayment);
    }
}
