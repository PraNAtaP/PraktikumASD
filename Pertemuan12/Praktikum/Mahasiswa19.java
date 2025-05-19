package Praktikum;

public class Mahasiswa19 {

    String nama;
    String nim;
    String kelas;
    double ipk;

    Mahasiswa19() {

    }

    Mahasiswa19(String nm, String name, String kls,double ip) {
        nama = name;
        nim = nm;
        kelas = kls;
        ipk = ip;
    }

    void tampilInformasi() {
        System.out.println(nama + "\t\t" + nim + "\t\t" + kelas + "\t\t" + ipk);
    }
}