import java.util.Scanner;

public class ArrayLists{
    public ArrayLists(){

    }

    // insert at back
    public boolean add(ArrayList<Product> list, Product product){
        return list.add(product);
    }

    // remove element based on object
    public boolean remove(ArrayList<Product> list, Product product){
        return list.remove(product);
    }

    // return element from the specified location
    public Product get(ArrayList<Product> list, int index){
        return list.get(index);
    }

    // replace with specified element at the specified location
    public Product set(ArrayList<Product> list, int index, Product product){
        return list.set(index, product);
    }

    // return size of the list
    public int size(ArrayList<Product> list){
        return list.size();
    }

}