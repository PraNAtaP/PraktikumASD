package Pertemuan14.Praktikum;

public class BinaryTreeArray19 {
    Mahasiswa19[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray19() {
        this.dataMahasiswa = new Mahasiswa19[10];
        this.idxLast = -1;
    }

    void populateData(Mahasiswa19 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    public void add(Mahasiswa19 data) {
        if (idxLast + 1 >= dataMahasiswa.length) {
            System.out.println("Array penuh, tidak bisa menambah data.");
            return;
        }
        idxLast++;
        dataMahasiswa[idxLast] = data;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }

    public void traversePreOrder() {
        traversePreOrderHelper(0);
    }

    public void traversePreOrderHelper(int idx) {
        if (idx <= idxLast && dataMahasiswa[idx] != null) {
            dataMahasiswa[idx].tampilInformasi();
            traversePreOrderHelper(2 * idx + 1);
            traversePreOrderHelper(2 * idx + 2);
        }
    }
}
