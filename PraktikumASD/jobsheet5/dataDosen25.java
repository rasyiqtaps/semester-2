package PraktikumASD.jobsheet5;

public class dataDosen25 {
    // Inisialisasi array dengan variabel huruf besar
    dosen25[] DataDosen = new dosen25[10];
    int idx = 0;

    public void tambah(dosen25 dsn) {
        if (idx < DataDosen.length) {
            DataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data Dosen sudah penuh!");
        }
    }

    public void tampil() {
        if (idx == 0) {
            System.out.println("Data Dosen masih kosong.");
            return;
        }
        for (int i = 0; i < idx; i++) {
            System.out.println("Data Dosen ke-" + (i + 1));
            DataDosen[i].tampil();
        }
    }

    public void SortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (DataDosen[j].usia > DataDosen[j + 1].usia) {
                    dosen25 temp = DataDosen[j];
                    DataDosen[j] = DataDosen[j + 1];
                    DataDosen[j + 1] = temp;
                }
            }
        }
    }

    public void sortingDSC() {
        insertionSort();
    }

    public void insertionSort() {
        for (int i = 1; i < idx; i++) {
            dosen25 temp = DataDosen[i];
            int j = i - 1;
            while (j >= 0 && DataDosen[j].usia < temp.usia) { 
                DataDosen[j + 1] = DataDosen[j];
                j--;
            }
            DataDosen[j + 1] = temp;
        }
    }
}