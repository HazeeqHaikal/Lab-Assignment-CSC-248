import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<House> qHouse = new LinkedList<>();
        Queue<House> qSemi_D = new LinkedList<>();
        Queue<House> qTerrace = new LinkedList<>();

        // b) Input ten (10) objects of houses and store them into qHouse.
        // For simplicity, I'm creating dummy houses. Replace this with actual input.
        for (int i = 0; i < 10; i++) {
            qHouse.add(new House("Semi-D", "Location " + i, i * 300, i * 40000));
            qHouse.add(new House("Terrace", "Location " + i, i * 300, i * 40000));
        }

        // c) Get all houses from qHouse and store all type of semi-D houses into a
        // queue called qSemi_D and all terrace houses into a queue called qTerrace.
        for (House house : qHouse) {
            if (house.getType().equals("Semi-D")) {
                qSemi_D.add(house);
            } else if (house.getType().equals("Terrace")) {
                qTerrace.add(house);
            }
        }

        // d) Display the information of house from qTerrace that the price is less than
        // RM150,000.
        for (House house : qTerrace) {
            if (house.getPrice() < 150000) {
                System.out.println(house);
            }
        }

        // e) Count the number of houses that the price is more than RM 300,000.00 and
        // display all information for that houses from qHouse.
        int count = 0;
        for (House house : qHouse) {
            if (house.getPrice() > 300000) {
                count++;
                System.out.println(house);
            }
        }
        System.out.println("Number of houses with price more than RM 300,000.00: " + count);
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
