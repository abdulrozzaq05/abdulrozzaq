package praktikum1;

public class MahasiswaBubble {
    private long nim;
    private String nama;
    private String asal;

    public MahasiswaBubble(long nim, String nama, String asal) {
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

class DataArray {

    public MahasiswaBubble[] mhs;
    private int nElemen;

    public DataArray(int max) {
        mhs = new MahasiswaBubble[max];
        nElemen = 0;
    }

    public void insert(long nim, String nama, String asal) {
        mhs[nElemen] = new MahasiswaBubble(nim, nama, asal);
        nElemen++;
    }

    public void displayArray() {
        for (int i = 0; i < nElemen; i++) {
            mhs[i].displayMhs();
        }
    }

    public void BubbleSort() {
        int batas, i;
        for (batas = nElemen - 1; batas > 0; batas--) {
            for (i = 0; i < batas; i++) {
                if (mhs[i].getNim() > mhs[i + 1].getNim()) {
                    swap(i, i + 1);
                }
            }
        }
    }

    public void swap(int one, int two) {
        MahasiswaBubble temp = mhs[one];
        mhs[one] = mhs[two];
        mhs[two] = temp;
    }
}
