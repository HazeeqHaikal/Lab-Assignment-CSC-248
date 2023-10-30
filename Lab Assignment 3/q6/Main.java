class ArrayLists {
    private char letter;
    private int size;
    private int counter;

    public ArrayLists(int size) {
        this.size = size;
        this.counter = 0;
    }

    public void insertAtFront(char letter) {
        if (counter < size) {
            counter++;
        }
    }

    public void insertAtBack(char letter) {
        if (counter < size) {
            counter++;
        }
    }

    public void removeFromFront() {
        if (counter > 0) {
            counter--;
        }
    }

    public void removeFromBack() {
        if (counter > 0) {
            counter--;
        }
    }

    public char getData(int index) {
        for (int i = 0; i < size; i++) {
            if (i == index) {
                return letter;
            }
        }

        return ' ';
    }
}

public class Main {
    public static void main(String[] args) {
        // array of letters size 13
        ArrayLists arrLetter = new ArrayLists(13);

        char[] data = new char[] { 'd', 'a', 't', 'a', 's', 't', 'r', 'u', 'c', 't', 'u', 'r', 'e' };
        // insert vowel using insert at back meanwhile consonant insert at front of
        // arrLetter
        for (int i = 0; i < data.length; i++) {
            if (data[i] == 'a' || data[i] == 'i' || data[i] == 'u' || data[i] == 'e' || data[i] == 'o') {
                arrLetter.insertAtBack(data[i]);
            } else {
                arrLetter.insertAtFront(data[i]);
            }
        }

        // print the data
        for (int i = 0; i < arrLetter.getData.length; i++) {
            System.out.print(arrLetter.getData(i));
        }
    }
}