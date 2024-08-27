package InsertionSort;

import InsertionSort.HighArray;

public class HighArrayApp {
    public static void main(String[] args) {
        int maxSize = 100;
        InsertionSort.HighArray arr;
        arr = new InsertionSort.HighArray(maxSize);

        arr.insert(70);
        arr.insert(85);
        arr.insert(75);
        arr.insert(55);
        arr.insert(80);
        arr.insert(25);

        System.out.println("Insertion Sort");
        System.out.print("Sebelum diurutkan = ");
//        arr.display();
        arr.InsertionSort();
        System.out.print("Setelah diurutkan = ");
        arr.display();
        System.out.println("");
    }
}
