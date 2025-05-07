package PraktikumJobsheet10.TugasLatihan;

import java.util.Scanner;

public class MainKRS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS q = new AntrianKRS(10);
        int pilihan;

        do {
            System.out.println("\n=== MENU KRS DPA ===");
            System.out.println("1. Cek antrian kosong");
            System.out.println("2. Cek antrian penuh");
            System.out.println("3. Kosongkan antrian");
            System.out.println("4. Tambah antrian");
            System.out.println("5. Proses 2 mahasiswa");
            System.out.println("6. Tampilkan semua antrian");
            System.out.println("7. Tampilkan 2 terdepan");
            System.out.println("8. Tampilkan paling akhir");
            System.out.println("9. Jumlah antrian");
            System.out.println("10. Jumlah diproses");
            System.out.println("11. Sisa kuota proses");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println(q.IsEmpty() ? "Antrian kosong" : "Antrian tidak kosong");
                    break;
                case 2:
                    System.out.println(q.IsFull() ? "Antrian penuh" : "Antrian tidak penuh");
                    break;
                case 3:
                    q.Clear();
                    break;
                case 4:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    q.Enqueue(new Mahasiswa(nim, nama, prodi, kelas));
                    break;
                case 5:
                    q.Process2();
                    break;
                case 6:
                    q.TampilkanSemua();
                    break;
                case 7:
                    q.Tampilkan2Terdepan();
                    break;
                case 8:
                    q.TampilkanTerakhir();
                    break;
                case 9:
                    System.out.println("Jumlah antrian: " + q.JumlahAntrian());
                    break;
                case 10:
                    System.out.println("Jumlah diproses: " + q.JumlahDiproses());
                    break;
                case 11:
                    System.out.println("Sisa kuota proses: " + q.SisaKuota());
                    break;
                case 0:
                    System.out.println("Terima kasih King!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);

        sc.close();
    }
}
