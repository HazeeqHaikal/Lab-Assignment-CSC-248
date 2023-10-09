public class Land {
    private String id;
    private String ownerName;
    private char houseType;
    private double area;

    public Land() {
        id = "";
        ownerName = "";
        houseType = ' ';
        area = 0.0;
    }

    public Land(String id, String ownerName, char houseType, double area) {
        this.id = id;
        this.ownerName = ownerName;
        this.houseType = houseType;
        this.area = area;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public char getHouseType() {
        return this.houseType;
    }

    public void setHouseType(char houseType) {
        this.houseType = houseType;
    }

    public double getArea() {
        return this.area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String toString() {
        return "ID: " + id + "\nOwner Name: " + ownerName + "\nHouse Type: " + houseType + "\nArea: " + area;
    }

    public double calculateTax() {
        double tax = 0.0;

        if (houseType == 'T') {
            tax = 10 * area;
        } else if (houseType == 'S') {
            tax = 15 * area;
        } else if (houseType == 'B') {
            tax = 20 * area;
        } else if (houseType == 'C') {
            tax = 30 * area;
        }

        return tax;
    }
}