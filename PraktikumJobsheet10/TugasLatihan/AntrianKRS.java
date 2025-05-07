package PraktikumJobsheet10.TugasLatihan;

public class AntrianKRS {
    Mahasiswa[] data;
    int front, rear, size, max;
    int processedCount = 0;
    int PROCESS_LIMIT = 30;

    public AntrianKRS(int max) {
        this.max = max;
        data = new Mahasiswa[max];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean IsEmpty() {
        return size == 0;
    }

    public boolean IsFull() {
        return size == max;
    }

    public void Clear() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }

    public void Enqueue(Mahasiswa mhs) {
        if (IsFull()) {
            System.out.println("Antrian penuh!");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk antrian.");
    }

    public void Process2() {
        if (processedCount >= PROCESS_LIMIT) {
            System.out.println("Batas proses per DPA (30) sudah tercapai.");
            return;
        }
        if (IsEmpty()) {
            System.out.println("Antrian kosong, gak ada yang diproses.");
            return;
        }
        System.out.println(">> Proses KRS untuk 2 mahasiswa:");
        for (int i = 0; i < 2 && size > 0; i++) {
            Mahasiswa m = data[front];
            System.out.print("Diproses: ");
            m.TampilkanData();
            front = (front + 1) % max;
            size--;
            processedCount++;
        }
    }

    public void TampilkanSemua() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar seluruh antrian:");
        for (int i = 0; i < size; i++) {
            int idx = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[idx].TampilkanData();
        }
    }

    public void Tampilkan2Terdepan() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Dua mahasiswa terdepan:");
        for (int i = 0; i < 2 && i < size; i++) {
            int idx = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[idx].TampilkanData();
        }
    }

    public void TampilkanTerakhir() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Mahasiswa paling akhir:");
        data[rear].TampilkanData();
    }

    public int JumlahAntrian() {
        return size;
    }

    public int JumlahDiproses() {
        return processedCount;
    }

    public int SisaKuota() {
        return PROCESS_LIMIT - processedCount;
    }
}