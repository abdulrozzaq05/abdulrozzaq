package praktikum2;

public class MahasiswaInsertion {
    private long nim;
    private String nama;
    private String asal;

    public MahasiswaInsertion(long nim, String nama, String asal) {
        this.nim = nim;
        this.nama = nama;
        this.asal = asal;
    }

    public void displayMhs() {
        System.out.print("\tNim: " + nim);
        System.out.print(", Nama: " + nama);
        System.out.println(", Asal: " + asal);
    }


    public long getNim() {
        return nim;
    }
    public String getName() {
        return nama;
    }
}

class DataArray2 {

    public MahasiswaInsertion[] mhs;
    private int nElemen;

    public DataArray2(int max) {
        mhs = new MahasiswaInsertion[max];
        nElemen = 0;
    }

    public void insert(long nim, String nama, String asal) {
        mhs[nElemen] = new MahasiswaInsertion(nim, nama, asal);
        nElemen++;
    }

    public void displayArray() {
        for (int i = 0; i < nElemen; i++) {
            mhs[i].displayMhs();
        }
    }

    public void InsertionSortByName() {
        int i, curIn;

        for (curIn = 1; curIn < nElemen; curIn++) {
            MahasiswaInsertion temp = mhs[curIn];

            i = curIn;
            while (i > 0 && mhs[i - 1].getName().compareTo(temp.getName()) > 0) {
                mhs[i] = mhs[i - 1];
                i--;
            }
            mhs[i] = temp;
        }
    }

    public void swap(int one, int two) {
        MahasiswaInsertion temp = mhs[one];
        mhs[one] = mhs[two];
        mhs[two] = temp;
    }
}

