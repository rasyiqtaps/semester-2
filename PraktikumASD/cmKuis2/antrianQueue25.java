package cmKuis2;

public class antrianQueue25 {
    nodePembeli25 head, tail;

    public void tambahAntrian(int no, String nama, String hp) {
        pembeli25 dataBaru = new pembeli25(nama, hp);
        nodePembeli25 nodeBaru = new nodePembeli25(no, dataBaru);
        
        if (head == null) {
            head = tail = nodeBaru;
        } else {
            tail.next = nodeBaru;
            nodeBaru.prev = tail;
            tail = nodeBaru;
        }
        System.out.println("Antrian berhasil ditambahkan dengan nomor: " + no);
    }

    public void cetakAntrian() {
        if (head == null) {
            System.out.println("Antrian Kosong!");
            return;
        }
        System.out.println("=========================================");
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("=========================================");
        System.out.printf("%-12s %-15s %-15s\n", "No Antrian", "Nama", "No HP");
        
        nodePembeli25 current = head;
        while (current != null) {
            System.out.printf("%-12d %-15s %-15s\n", 
                current.noAntrian, current.data.namaPembeli, current.data.noHp);
            current = current.next;
        }
    }

    public nodePembeli25 hapusAntrian() {
        if (head == null) {
            return null;
        }
        nodePembeli25 dipanggil = head;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        return dipanggil;
    }

    public void tambahAntrianPrioritas(int no, String nama, String hp) {
        pembeli25 dataBaru = new pembeli25(nama, hp);
        nodePembeli25 nodeBaru = new nodePembeli25(no, dataBaru);

        if (head == null) {
            head = tail = nodeBaru;
            System.out.println("Antrean masih kosong. Otomatis menjadi antrean pertama (Indeks 0).");
            return;
        }

        if (head.next == null) {
            tail.next = nodeBaru;
            nodeBaru.prev = tail;
            tail = nodeBaru;
            System.out.println("Antrean baru berisi 1 orang. Otomatis ditaruh di urutan belakang (Indeks 1).");
            return;
        }

        nodePembeli25 current = head;
        int counter = 0;
        while (current != null && counter < 2) {
            current = current.next;
            counter++;
        }

        if (current != null) {
            nodeBaru.next = current;
            nodeBaru.prev = current.prev;
            
            current.prev.next = nodeBaru;
            current.prev = nodeBaru;
            System.out.println("Antrian berhasil disisipkan pada indeks ke-2 (Urutan ke-3).");
        } else {
            tail.next = nodeBaru;
            nodeBaru.prev = tail;
            tail = nodeBaru;
            System.out.println("Antrian berhasil ditambahkan di posisi paling belakang (Indeks 2).");
        }
    }
}