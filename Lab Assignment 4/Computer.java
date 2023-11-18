public class Computer {
    private int serialNo;
    private String brand;
    private int year;
    private double price;

    public Computer(int serialNo, String brand, int year, double price) {
        this.serialNo = serialNo;
        this.brand = brand;
        this.year = year;
        this.price = price;
    }

    public int getSerialNo() {
        return this.serialNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "Serial number: " + this.serialNo + "\nBrand: " + this.brand + "\nYear: " + this.year + "\nPrice: RM "
                + this.price;
    }

}