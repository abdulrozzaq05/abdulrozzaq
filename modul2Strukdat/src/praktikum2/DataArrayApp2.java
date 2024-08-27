package praktikum2;

public class DataArrayApp2 {
    public static void main(String[] args) {

        int maxSize = 100;
        DataArray2 mhs;
        mhs = new DataArray2(maxSize);

        mhs.insert(166502008, "Jundi", "Malang");
        mhs.insert(166502006, "Ahmad", "Sidoarjo");
        mhs.insert(166502005, "Ismail", "Banyuwangi");
        mhs.insert(166502007, "Sofi", "Semarang");
        mhs.insert(166502002, "Dinda", "Bandung");
        mhs.insert(166502009, "Rais", "Ambon");
        mhs.insert(166502003, "Helmi", "Madura");
        mhs.insert(166502010, "Agung", "Madiun");
        mhs.insert(166502001, "Arina", "Malang");

        System.out.println("Insertion Sort By Name");
        System.out.println("Nama Sebelum diurutkan = ");
        mhs.displayArray();
        mhs.InsertionSortByName();
        System.out.println("Nama Setelah diurutkan = ");
        mhs.displayArray();
        System.out.println("");
    }
}
