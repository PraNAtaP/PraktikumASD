package Jobsheet9;

public class Mahasiswa19 {

    String nama;
    String nim;
    String kelas;
    int nilai;

    Mahasiswa19() {

    }

    Mahasiswa19(String nama, String nim, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        nilai = -1;
    }

    void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }
}