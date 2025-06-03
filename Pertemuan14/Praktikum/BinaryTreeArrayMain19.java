package Pertemuan14.Praktikum;

public class BinaryTreeArrayMain19 {
    public static void main(String[] args) {
        BinaryTreeArray19 bta = new BinaryTreeArray19();
        Mahasiswa19 mhs1 = new Mahasiswa19("244160121", "Ali", "A", 3.57);
        Mahasiswa19 mhs2 = new Mahasiswa19("244160185", "Candra", "C", 3.41);
        Mahasiswa19 mhs3 = new Mahasiswa19("244160221", "Badar", "B", 3.75);
        Mahasiswa19 mhs4 = new Mahasiswa19("244160220", "Dewi", "B", 3.35);

        Mahasiswa19 mhs5 = new Mahasiswa19("244160131", "Devi", "A", 3.48);
        Mahasiswa19 mhs6 = new Mahasiswa19("244160205", "Ehsan", "D", 3.61);
        Mahasiswa19 mhs7 = new Mahasiswa19("244160170", "Fizi", "B", 3.86);

        Mahasiswa19[] dataMahasiswas = { mhs1, mhs2, mhs3, mhs4, mhs5, mhs6, mhs7, null, null, null };
        int idxLast = 6;
        bta.populateData(dataMahasiswas, idxLast);
        System.out.println("\nInorder Traversal Mahasiswa: ");
        bta.traverseInOrder(0);
    }
}
