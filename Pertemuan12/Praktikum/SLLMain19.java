package Praktikum;

import java.util.Scanner;

public class SLLMain19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList19 sll = new SingleLinkedList19();

        Mahasiswa19 mhs1 = new Mahasiswa19("24212208", "Alvaro", "1A", 4.0);
        Mahasiswa19 mhs2 = new Mahasiswa19("23212201", "Bion",   "2B", 3.8);
        Mahasiswa19 mhs3 = new Mahasiswa19("22212206", "Cintia", "3C", 3.5);
        Mahasiswa19 mhs4 = new Mahasiswa19("21212203", "Dirga",  "4D", 3.6);

        sll.addFirst(mhs4);
        sll.addLast(mhs1);
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);

        int pilihan;

        do {
            printMenu();
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    Mahasiswa19 mhsAwal = inputData(sc);
                    sll.addFirst(mhsAwal);
                    break;
                case 2:
                    Mahasiswa19 mhsAkhir = inputData(sc);
                    sll.addLast(mhsAkhir);
                    break;
                case 3:
                    System.out.print("Masukkan nama setelah siapa data ditambahkan: ");
                    String namaCari = sc.nextLine();
                    Mahasiswa19 mhsSetelah = inputData(sc);
                    sll.insertAfter(namaCari, mhsSetelah);
                    break;
                case 4:
                    System.out.print("Masukkan index posisi: ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    Mahasiswa19 mhsIndex = inputData(sc);
                    sll.insertAt(index, mhsIndex);
                    break;
                case 5:
                    sll.print();
                    break;
                case 0:
                    System.out.println("Keluar dari program...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
    }

    public static void printMenu() {
        System.out.println("===== MENU =====");
        System.out.println("1. Tambah Mahasiswa di Awal");
        System.out.println("2. Tambah Mahasiswa di Akhir");
        System.out.println("3. Tambah Mahasiswa Setelah Nama Tertentu");
        System.out.println("4. Tambah Mahasiswa di Index Tertentu");
        System.out.println("5. Tampilkan Daftar Mahasiswa");
        System.out.println("0. Keluar");
    }

    public static Mahasiswa19 inputData(Scanner sc) {
        System.out.print("NIM: ");
        String nim = sc.nextLine();
        System.out.print("Nama: ");
        String nama = sc.nextLine();
        System.out.print("Kelas: ");
        String kelas = sc.nextLine();
        System.out.print("IPK: ");
        double ipk = sc.nextDouble();
        sc.nextLine();

        return new Mahasiswa19(nim, nama, kelas, ipk);
    }
}