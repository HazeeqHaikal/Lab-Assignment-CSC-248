public class Cloth {
    private String name;
    private double price;
    private double length;

    public Cloth(String name, double price, double length) {
        this.name = name;
        this.price = price;
        this.length = length;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String toString() {
        return "Name: " + this.name + "\nPrice: " + this.price + "\nLength: " + this.length;
    }

    public double calcPayment() {
        return this.price * this.length * 1.06;
    }
}
