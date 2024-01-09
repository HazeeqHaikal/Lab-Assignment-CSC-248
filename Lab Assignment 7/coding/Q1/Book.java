package Q1;
public class Book {
    private int serialNum;
    private String title;
    private String author;
    private char code;
    private String publisher;
    private int year;

    public Book() {
    }

    public void setData(int sn, String t, String a, char c, String p, int y) {
        // method definition
        serialNum = sn;
        title = t;
        author = a;
        code = c;
        publisher = p;
        year = y;
    }

    public int getSerialNum() {
        return serialNum;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public char getCode() {
        return code;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYear() {
        return year;
    }

    public String toString() {
        return "Serial Number: " + serialNum + "\nTitle: " + title + "\nAuthor: " + author + "\nCode: " + code
                + "\nPublisher: " + publisher + "\nYear: " + year;
    }
}