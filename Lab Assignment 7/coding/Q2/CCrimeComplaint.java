public class CCrimeComplaint {
    private String cElement;
    private int noOfComplaint;
    private int year;

    public CCrimeComplaint(String cElement, int noOfComplaint, int year) {
        this.cElement = cElement;
        this.noOfComplaint = noOfComplaint;
        this.year = year;
    }

    public String getcElement() {
        return cElement;
    }

    public void setcElement(String cElement) {
        this.cElement = cElement;
    }

    public int getNoOfComplaint() {
        return noOfComplaint;
    }

    public void setNoOfComplaint(int noOfComplaint) {
        this.noOfComplaint = noOfComplaint;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return "Element: " + cElement + "\nNumber of Complaint: " + noOfComplaint + "\nYear: " + year;
    }
}
