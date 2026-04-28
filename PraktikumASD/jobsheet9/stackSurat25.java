package PraktikumASD.jobsheet9;

public class stackSurat25 {
    surat25[] stack;
    int top;
    int size;

    public stackSurat25(int size) {
        this.size = size;
        stack = new surat25[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(surat25 srt) {
        if (!isFull()) {
            top++;
            stack[top] = srt;
            System.out.println("Surat dari " + srt.namaMahasiswa + " berhasil diterima!");
        } else {
            System.out.println("Kapasitas tumpukan surat penuh!");
        }
    }

    public void pop() {
        if (!isEmpty()) {
            surat25 srt = stack[top];
            top--;
            System.out.println("Surat atas nama " + srt.namaMahasiswa + " (Izin: " + srt.jenisIzin + ") telah diproses.");
        } else {
            System.out.println("Belum ada surat yang masuk atau tumpukan kosong.");
        }
    }

    public void peek() {
        if (!isEmpty()) {
            surat25 srt = stack[top];
            System.out.println("--- Surat Teratas ---");
            System.out.println("ID Surat    : " + srt.idSurat);
            System.out.println("Nama        : " + srt.namaMahasiswa);
            System.out.println("Kelas       : " + srt.kelas);
            System.out.println("Jenis Izin  : " + (srt.jenisIzin == 'S' || srt.jenisIzin == 's' ? "Sakit" : "Keperluan Lain"));
            System.out.println("Durasi      : " + srt.durasi + " hari");
            System.out.println("---------------------");
        } else {
            System.out.println("Belum ada surat yang masuk.");
        }
    }

    public void cariSurat(String nama) {
        if (isEmpty()) {
            System.out.println("Tumpukan surat kosong.");
            return;
        }
        
        boolean ditemukan = false;
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan pada urutan ke-" + (top - i + 1) + " dari atas.");
                System.out.println("ID Surat : " + stack[i].idSurat + " | Kelas: " + stack[i].kelas + " | Durasi: " + stack[i].durasi + " hari");
                ditemukan = true;
            }
        }
        
        if (!ditemukan) {
            System.out.println("Surat atas nama " + nama + " tidak ditemukan.");
        }
    }
}