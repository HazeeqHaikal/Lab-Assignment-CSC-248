public class Salesperson {
    private String name;
    private String id;
    private double sales;

    public Salesperson() {
        this.name = "";
        this.id = "";
        this.sales = 0.0;
    }

    public Salesperson(String name, String id, double sales) {
        this.name = name;
        this.id = id;
        this.sales = sales;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSales() {
        return this.sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public String toString() {
        return "Name: " + this.name + "\nID: " + this.id + String.format("\nSales: RM%,.2f", this.sales);
    }

    public double calculateCommission() {
        if (sales < 500) {
            return 0.1 * sales;
        } else if (sales >= 500 && sales < 1000) {
            return 0.15 * sales;
        } else if (sales >= 1000 && sales < 2000) {
            return 0.2 * sales;
        } else {
            return 0.25 * sales;
        }
    }
}