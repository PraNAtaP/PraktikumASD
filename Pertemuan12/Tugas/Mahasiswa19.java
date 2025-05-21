package Tugas;

public class Mahasiswa19 {
    String nim;
    String nama;
    String kelas;
    String prodi;

    public Mahasiswa19(String nim, String nama, String prodi, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    public void tampilData() {
        System.out.println(nama + "\t\t" + nim + "\t\t" + kelas + "\t\t" + prodi);
    }
}