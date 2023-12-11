import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner intInput = new Scanner(System.in);

        System.out.println("Welcome to the Decimal to Hexadecimal Converter!\n");

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        // convert decimal to hexadecimals
        // use stack concept but with arraylist
        System.out.print("Enter a decimal number: ");
        int decimal = intInput.nextInt();

        // last in first out
        while (decimal > 0) {
            int remainder = decimal % 16;
            numbers.add(remainder);
            decimal /= 16;
        }

        System.out.print("\nHexadecimal: ");
        for (int i = numbers.size() - 1; i >= 0; i--) {
            if (numbers.get(i) > 9) {
                // the number 55 is added to the retrieved number. The reason for adding 55 is
                // because in the ASCII table, the character ‘A’ (which represents 10 in
                // hexadecimal) is at position 65. So, if you have a number like 10, adding 55
                // will give you the ASCII value of ‘A’.
                char hex = (char) (numbers.get(i) + 55);
                System.out.print(hex);
            } else {
                System.out.print(numbers.get(i));
            }
        }

        System.out.println();
        System.out.println("\nThank you for using the Decimal to Hexadecimal Converter!");

        intInput.close();
    }
}