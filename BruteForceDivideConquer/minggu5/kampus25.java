package BruteForceDivideConquer.minggu5;

public class kampus25 {
    public String nama;
    public String nim;
    public int tahunMasuk;
    public int nilaiUTS;
    public int nilaiUAS;

    public kampus25(String nama, String nim, int tahunMasuk, int nilaiUTS, int nilaiUAS) {
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahunMasuk;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    public int[] cariMinMaxUTS(kampus25[] mhs, int awal, int akhir) {
        int[] minMax = new int[2];
        int[] hasilKiri, hasilKanan;

        if (awal == akhir) {
            minMax[0] = mhs[awal].nilaiUTS;
            minMax[1] = mhs[awal].nilaiUTS;
            return minMax;
        }

        if (akhir == awal + 1) {
            if (mhs[awal].nilaiUTS < mhs[akhir].nilaiUTS) {
                minMax[0] = mhs[awal].nilaiUTS;
                minMax[1] = mhs[akhir].nilaiUTS;
            } else {
                minMax[0] = mhs[akhir].nilaiUTS;
                minMax[1] = mhs[awal].nilaiUTS;
            }
            return minMax;
        }

        int tengah = (awal + akhir) / 2;
        hasilKiri = cariMinMaxUTS(mhs, awal, tengah);
        hasilKanan = cariMinMaxUTS(mhs, tengah + 1, akhir);

        minMax[0] = Math.min(hasilKiri[0], hasilKanan[0]);
        minMax[1] = Math.max(hasilKiri[1], hasilKanan[1]);

        return minMax;
    }

    public double rataUAS(kampus25[] mhs) {
        int total = 0;
        for (kampus25 m : mhs) {
            total += m.nilaiUAS;
        }
        return (double) total / mhs.length;
    }
}
