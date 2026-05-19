package cmKuis2;

public class daftarPesanan25 {
    nodePesanan25 head, tail;

    public void tambahPesanan(int kode, String nama, int harga) {
        pesanan25 dataBaru = new pesanan25(kode, nama, harga);
        nodePesanan25 nodeBaru = new nodePesanan25(dataBaru);
        
        if (head == null) {
            head = tail = nodeBaru;
        } else {
            tail.next = nodeBaru;
            nodeBaru.prev = tail;
            tail = nodeBaru;
        }
    }

    public void urutkanPesanan() {
        if (head == null || head.next == null) return;
        
        boolean swapped;
        do {
            swapped = false;
            nodePesanan25 current = head;
            
            while (current.next != null) {
                if (current.data.namaPesanan.compareToIgnoreCase(current.next.data.namaPesanan) > 0) {
                    pesanan25 temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }

    public void cetakLaporan() {
        if (head == null) {
            System.out.println("Belum ada laporan pesanan.");
            return;
        }
        
        urutkanPesanan();

        System.out.println("=========================================");
        System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.println("=========================================");
        System.out.printf("%-15s %-20s %-10s\n", "Kode Pesanan", "Nama Pesanan", "Harga");
        
        nodePesanan25 current = head;
        int totalPendapatan = 0;
        while (current != null) {
            System.out.printf("%-15d %-20s %-10d\n", 
                current.data.kodePesanan, current.data.namaPesanan, current.data.harga);
            totalPendapatan += current.data.harga;
            current = current.next;
        }
        System.out.println("=========================================");
        System.out.println("Total Pendapatan: " + totalPendapatan);
    }
}