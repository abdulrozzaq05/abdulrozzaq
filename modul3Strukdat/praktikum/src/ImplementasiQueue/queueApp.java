package ImplementasiQueue;

public class queueApp {
    public static void main(String [] args) {
        queue theQueue = new queue(4);
        System.out.println(">> beberapa mulai mengantri");
        theQueue.insert("Andi");
        theQueue.insert("Ahmad");
        theQueue.insert("Satrio");
        theQueue.insert("Afrizal");
        theQueue.insert("Sukran");
        theQueue.insert("Mahmud");

        System.out.println("\n>> isi antrian");
        theQueue.display();

        System.out.println("\n>> satu persatu keluar antrian");

        while (!theQueue.isEmpty()) {
            theQueue.remove();
            theQueue.display();
            System.out.println(" ");
        }
        if (theQueue.isEmpty()) {
            System.out.println("Antrian kosong");
            System.out.println("0 person");
            theQueue.display();
        }
    }
}
