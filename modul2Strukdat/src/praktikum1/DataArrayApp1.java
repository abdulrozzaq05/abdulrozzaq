package praktikum1;

public class DataArrayApp1 {
    public static void main(String[] args) {

        int maxSize = 100;
        DataArray1 mhs;
        mhs = new DataArray1(maxSize);

        mhs.insert(166502008, "Jundi", "Malang");
        mhs.insert(166502006, "Ahmad", "Sidoarjo");
        mhs.insert(166502005, "Ismail", "Banyuwangi");
        mhs.insert(166502007, "Sofi", "Semarang");
        mhs.insert(166502002, "Dinda", "Bandung");
        mhs.insert(166502009, "Rais", "Ambon");
        mhs.insert(166502003, "Helmi", "Madura");
        mhs.insert(166502004, "Agung", "Madiun");
        mhs.insert(166502001, "Arina", "Malang");

        System.out.println("Selection Sort");
        System.out.println("NIM Sebelum diurutkan = ");
        mhs.displayArray();
        mhs.SelectionSort();
        System.out.println("NIM Setelah diurutkan = ");
        mhs.displayArray();
        System.out.println("");
    }
}