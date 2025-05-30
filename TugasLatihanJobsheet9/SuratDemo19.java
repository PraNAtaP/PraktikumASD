package TugasLatihanJobsheet9;

import java.util.Scanner;

public class SuratDemo19 {
    public static void main(String[] args) {
        StackSurat19 stack = new StackSurat19(5);
        Scanner scan = new Scanner(System.in);

        int pilih;
        do {
            System.out.println("\nMenu Surat Izin:");
            System.out.println("1. Input Surat Izin");
            System.out.println("2. Verifikasi Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat Izin");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat : ");
                    String id = scan.nextLine();
                    System.out.print("Nama Mahasiswa : ");
                    String nama = scan.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = scan.nextLine();
                    System.out.print("Jenis Izin (S/I) : ");
                    char jenis = scan.nextLine().toUpperCase().charAt(0);
                    System.out.print("Durasi Izin (hari) : ");
                    int durasi = scan.nextInt();
                    scan.nextLine();

                    Surat19 surat = new Surat19(id, nama, kelas, jenis, durasi);
                    stack.push(surat);
                    System.out.println("Surat berhasil diterima.");
                    break;

                case 2:
                    Surat19 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("------------------------------------------------------------------");
                        System.out.println("| ID Surat   | Nama Mahasiswa     | Kelas  | Jenis Izin | Durasi |");
                        System.out.println("------------------------------------------------------------------");
                        System.out.printf("| %-10s | %-18s | %-6s | %-10s | %-6d |\n",
                                diproses.idSurat, diproses.namaMahasiswa, diproses.kelas,
                                diproses.jenisIzin == 'S' ? "Sakit" : "Izin", diproses.durasi);
                        System.out.println("------------------------------------------------------------------");
                        System.out.printf("Surat dari %s berhasil diverifikasi.\n", diproses.namaMahasiswa);
                    }
                    break;

                case 3:
                    Surat19 terakhir = stack.peek();
                    if (terakhir != null) {
                        System.out.println("------------------------------------------------------------------");
                        System.out.println("| ID Surat   | Nama Mahasiswa     | Kelas  | Jenis Izin | Durasi |");
                        System.out.println("------------------------------------------------------------------");
                        System.out.printf("| %-10s | %-18s | %-6s | %-10s | %-6d |\n",
                                terakhir.idSurat, terakhir.namaMahasiswa, terakhir.kelas,
                                terakhir.jenisIzin == 'S' ? "Sakit" : "Izin", terakhir.durasi);
                        System.out.println("------------------------------------------------------------------");
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String cariNama = scan.nextLine();
                    stack.cariSurat(cariNama);
                    break;

                case 0:
                    System.out.println("Terima Kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 0);

        scan.close();
    }
}