package BruteForceDivideConquer.minggu5;

public class mainKampus25 {
    public static void main(String[] args) {
        kampus25[] daftarMhs = {
            new kampus25("Ahmad", "220101001", 2022, 78, 82),
            new kampus25("Budi",  "220101002", 2022, 85, 88),
            new kampus25("Cindy", "220101003", 2021, 90, 87),
            new kampus25("Dian",  "220101004", 2021, 76, 79),
            new kampus25("Eko",   "220101005", 2023, 92, 95),
            new kampus25("Fajar", "220101006", 2020, 88, 85),
            new kampus25("Gina",  "220101007", 2023, 80, 83),
            new kampus25("Hadi",  "220101008", 2020, 82, 84)
        };

        kampus25 util = daftarMhs[0];
        int[] hasilUTS = util.cariMinMaxUTS(daftarMhs, 0, daftarMhs.length - 1);
        double rata = util.rataUAS(daftarMhs);

        System.out.println("=======================================");
        System.out.println("HASIL PENGOLAHAN DATA MAHASISWA");
        System.out.println("=======================================");
        System.out.println("a) Nilai UTS Tertinggi (D&C) : " + hasilUTS[1]);
        System.out.println("b) Nilai UTS Terendah (D&C)  : " + hasilUTS[0]);
        System.out.printf("c) Rata-rata Nilai UAS (BF)  : %.2f\n", rata);
        System.out.println("=======================================");
    }
}
