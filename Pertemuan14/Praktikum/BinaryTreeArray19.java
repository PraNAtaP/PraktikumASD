package Pertemuan14.Praktikum;

public class BinaryTreeArray19 {
    Mahasiswa19[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray19() {
        this.dataMahasiswa = new Mahasiswa19[10];
    }

    void populateData(Mahasiswa19 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
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
}
