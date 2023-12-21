import java.util.Scanner;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Scanner intInput = new Scanner(System.in);
        Scanner strInput = new Scanner(System.in);

        Queue qHouse = new Queue();
        Queue qSemi_D = new Queue();
        Queue qTerrace = new Queue();

        Queue temporary = new Queue();

        // b) Input ten (10) objects of houses and store them into qHouse.
        for (int i = 0; i < 2; i++) {
            System.out.print("1. Semi-D\n2. Terrace\nEnter house type: ");
            int typeInt = intInput.nextInt();

            String type = "";

            if (typeInt == 1)
                type = "Semi-D";
            else if (typeInt == 2)
                type = "Terrace";
            else
                System.out.println("Invalid input.");

            System.out.print("Enter location: ");
            String location = strInput.nextLine();

            System.out.print("Enter size (Metre): ");
            double size = intInput.nextDouble();

            System.out.print("Enter price per unit (RM): ");
            double price = intInput.nextDouble();

            qHouse.enqueue(new House(type, location, size, price));

            System.out.println();

        }

        // c) Get all houses from qHouse and store all type of semi-D houses into a
        // queue called qSemi_D and all terrace houses into a queue called qTerrace.
        while (!qHouse.isEmpty()) {
            House house = (House) qHouse.dequeue();

            if (house.getType().equals("Semi-D")) {
                qSemi_D.enqueue(house);
            } else if (house.getType().equals("Terrace")) {
                qTerrace.enqueue(house);
            }

            temporary.enqueue(house);
        }

        // restore the house back to qHouse
        while (!temporary.isEmpty()) {
            qHouse.enqueue(temporary.dequeue());
        }

        // d) Display the information of house from qTerrace that the price is less than
        // RM150,000.

        int countTerrace = 0;

        while (!qTerrace.isEmpty()) {
            House house = (House) qTerrace.dequeue();

            if (house.getPrice() < 150000) {
                countTerrace++;
                if (countTerrace == 1)
                    System.out.println("Houses with price less than RM 150,000.00: ");
                System.out.println(house);
            }
        }

        if (countTerrace == 0)
            System.out.println("No houses with price less than RM 150,000.00.");

        // restore the house back to qTerrace
        while (!temporary.isEmpty()) {
            qTerrace.enqueue(temporary.dequeue());
        }

        // e) Count the number of houses that the price is more than RM 300,000.00 and
        // display all information for that houses from qHouse.
        int count = 0;

        while (!qHouse.isEmpty()) {
            House house = (House) qHouse.dequeue();

            if (house.getPrice() > 300000) {
                count++;
                if (count == 1)
                    System.out.println("Houses with price more than RM 300,000.00: ");
                System.out.println(house);
            }
        }

        if (count == 0)
            System.out.println("No houses with price more than RM 300,000.00.");

        // restore the house back to qHouse
        while (!temporary.isEmpty()) {
            qHouse.enqueue(temporary.dequeue());
        }

        System.out.println("Number of houses with price more than RM 300,000.00: " + count);

        strInput.close();
        intInput.close();
    }
}

class Queue extends LinkedList<Object> {
    protected LinkedList<Object> list;

    public Queue() {
        list = new LinkedList<Object>();
    }

    public void enqueue(Object element) {
        list.addFirst(element);
    }

    public Object dequeue() {
        return list.removeLast();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}

class House {
    private String type;
    private String location;
    private double size;
    private double price;

    public House(String type, String location, double size, double price) {
        this.type = type;
        this.location = location;
        this.size = size;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public String getLocation() {
        return location;
    }

    public double getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "House type: " + type + "\nLocation: " + location + "\nSize (Metre): " + String.format("%,.2f", size)
                + "\nPrice: RM " + String.format("%,.2f", price) + "\n";
    }
}
