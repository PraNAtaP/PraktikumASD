package Tugas;

public class Queue {
    Node19 front;
    Node19 rear;
    int size;
    int max;

    public Queue(int max) {
        this.max = max;
        this.size = 0;
        this.front = null;
        this.rear = null;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        front = null;
        rear = null;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan!");
    }

    public void enqueue(Mahasiswa19 data) {
        if (isFull()) {
            System.out.println("Antrian sudah penuh!");
            return;
        }
        Node19 newNode = new Node19(data, null);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Mahasiswa berhasil ditambahkan ke antrian");
    }

    public Mahasiswa19 dequeue() {
        if (isEmpty()) {
            System.out.println("Tidak ada antrian");
            return null;
        }
        Mahasiswa19 data = front.data;
        front = front.next;
        size--;
        if (isEmpty()) {
            rear = null;
        }
        return data;
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Antrian terdepan:");
            front.data.tampilData();
        } else {
            System.out.println("Tidak ada antrian");
        }
    }

    public void peekBelakang() {
        if (!isEmpty()) {
            System.out.println("Antrian terakhir:");
            rear.data.tampilData();
        } else {
            System.out.println("Tidak ada antrian");
        }
    }

    public void print() {
        if (!isEmpty()) {
            Node19 tmp = front;
            int i = 0;
            System.out.println("Isi antrian: ");
            while (tmp != null) {
                System.out.println("Mahasiswa ke-" + (i + 1) + ":");
                tmp.data.tampilData();
                System.out.println();
                tmp = tmp.next;
                i++;
            }
        } else {
            System.out.println("Tidak ada antrian");
        }
    }

    public int getSize() {
        return size;
    }
}