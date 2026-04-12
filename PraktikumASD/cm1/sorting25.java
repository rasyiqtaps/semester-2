package PraktikumASD.cm1;

public class sorting25 {
    int idx = 0;

    //FOR CASE 1
    public void tampilMhs (mahasiswa25[] arrMhs) {
        System.out.println("");
        System.out.println("Daftar Mahasiswa");
        for (int i = 0; i < 3; i++) {
            arrMhs[i].tampilInformasiMhs25();
        }
        System.out.println("");
    }

    //FOR CASE 2
    public void tampilBk (buku25[] arrBuku) {
        System.out.println("");
        System.out.println("Daftar Buku");
        for (int i = 0; i < 4; i++) {
            arrBuku[i].tampilBuku25();
        }
        System.out.println("");
    }
    
    //FOR CASE 3
    public void tampilPmj (peminjaman25[] arrPeminjaman) {
        System.out.println("");
        System.out.println("Daftar Peminjaman");
        for (int i = 0; i < 5; i++) {
            arrPeminjaman[i].tampilPeminjaman25();
        }
        System.out.println("");
    }
    
    //FOR CASE 4 (INSERTION SORT BEDASARKAN DENDA)
    public void insertionSort(peminjaman25[] arrPeminjaman) {
        for (int i = 1; i < arrPeminjaman.length; i++) {
            peminjaman25 temp = arrPeminjaman[i];
            int j = i - 1;
            temp.hitungDenda25();
            while (j >= 0 && arrPeminjaman[j].denda < temp.denda) {
                arrPeminjaman[j + 1] = arrPeminjaman[j];
                j--;
            }
            arrPeminjaman[j + 1] = temp;
        }
        System.out.println("");
        System.out.println("Setelah diurutkan (Denda Terbesar)");
        tampilPmj(arrPeminjaman);
    }

    //FOR CASE 5 (INSERTION SORT BEDASARKAN NIM UNTUK MENGGUNAKAN BINARY SEARCH)
    public void sortBerdasarkanNim(peminjaman25[] arrPeminjaman) {
        for (int i = 1; i < arrPeminjaman.length; i++) {
            peminjaman25 temp = arrPeminjaman[i];
            int j = i - 1;

            while (j >= 0 && Integer.parseInt(arrPeminjaman[j].mhs.nim) > Integer.parseInt(temp.mhs.nim)) {
                arrPeminjaman[j + 1] = arrPeminjaman[j];
                j--;
            }
            arrPeminjaman[j + 1] = temp;
        }
    }

    //FOR CASE 5 (BINARY SEARCH)
    public int findKey(peminjaman25[] arrPeminjaman, int left, int right, int key) {
        int mid = 0;
        if (right >= left) {
            mid = left + (right - left) / 2;
            int counter = Integer.parseInt(arrPeminjaman[mid].mhs.nim); 

            if (counter == key) {
                return mid;
            } else if (counter > key) {
                return findKey(arrPeminjaman, left, mid - 1, key);
            } else {
                return findKey(arrPeminjaman, mid + 1, right, key);
            }
        }
        return -1;
    }

    //FOR CASE 5 (HASIL BINARY SEARCH)
    public void jrengJreng(int key, int hasil, peminjaman25[] arrPeminjaman) {
        if (hasil != -1) {
        
        int temp = hasil;
        while (temp >= 0 && Integer.parseInt(arrPeminjaman[temp].mhs.nim) == key) {
            temp--;
        }
        temp++; 

        while (temp < arrPeminjaman.length && Integer.parseInt(arrPeminjaman[temp].mhs.nim) == key) {
            arrPeminjaman[temp].tampilPeminjaman25();
            temp++;
        }

        } else { 
            System.out.println("Data " + key + " tidak ditemukan\n");
        }
    }
}
