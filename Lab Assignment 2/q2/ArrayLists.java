import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args) {
        Scanner strInput = new Scanner(System.in);
        Scanner intInput = new Scanner(System.in);

        // i) add new elements to the ArrayList
        ArrayList<String> names = new ArrayList<String>();
        names.add("Hazeeq");
        names.add("Khairul");
        names.add("Redza");
        System.out.println("The elements are: " + names);

        System.out.println();

        // ii) delete elemnt from a list
        names.remove(0);
        System.out.println("After removing element at index 0: " + names);

        // iii) the number of elements in the list
        System.out.println("The number of elements in the list: " + names.size());

        // iv) to determine either the name exist or not in a list
        System.out.println("Does the name exist in the list? " + names.contains("Redza"));

    }
}