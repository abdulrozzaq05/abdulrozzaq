package praktikum1;

public class MahasiswaSelection {
    private long nim;
    private String nama;
    private String asal;

    public MahasiswaSelection(long nim, String nama, String asal) {
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
}

class DataArray1 {

    public MahasiswaSelection[] mhs;
    private int nElemen;

    public DataArray1(int max) {
        mhs = new MahasiswaSelection[max];
        nElemen = 0;
    }

    public void insert(long nim, String nama, String asal) {
        mhs[nElemen] = new MahasiswaSelection(nim, nama, asal);
        nElemen++;
    }

    public void displayArray() {
        for (int i = 0; i < nElemen; i++) {
            mhs[i].displayMhs();
        }
    }

    public void SelectionSort() {
        int awal, i, min;

        for (awal = 0; awal < nElemen - 1; awal++) {
            min = awal;
            for (i = awal + 1; i < nElemen; i++) {
                if (mhs[i].getNim() < mhs[min].getNim()) {
                    min = i;
                }
            }
            swap(awal, min);
        }
    }

    public void swap(int one, int two) {
        MahasiswaSelection temp = mhs[one];
        mhs[one] = mhs[two];
        mhs[two] = temp;
    }
}
