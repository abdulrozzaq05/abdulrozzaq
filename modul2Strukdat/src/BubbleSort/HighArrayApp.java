package BubbleSort;

public class HighArrayApp {
    public static void main(String[] args) {

        int maxSize = 100;
        HighArray arr;
        arr = new HighArray(maxSize);

        arr.insert(70);
        arr.insert(85);
        arr.insert(75);
        arr.insert(55);
        arr.insert(80);
        arr.insert(25);

        System.out.print("Sebelum diurutkan = ");
        arr.display();
        arr.BubbleSortAscending();
        System.out.print("Setelah diurutkan = ");
        arr.display();
        System.out.println("");
    }
}
