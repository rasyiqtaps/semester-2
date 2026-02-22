public class MataKuliahMain25 { 
    public static void main(String[] args) {
        //void kurangiJam void tambahJam void ubahSKS void tampilInformasi

        MataKuliah25 mk1 = new MataKuliah25();
        mk1.kodeMK = "mata kuliah 1";
        mk1.nama = "Dosen 1";
        mk1.sks = 4;
        mk1.jumlahJam = 5;

        mk1.ubahSKS(2);
        mk1.tambahJam(1);
        mk1.tampilInformasi();

        MataKuliah25 mk2 = new MataKuliah25 ("mata kuliahn 2", "Dosen 2", 4, 3);
        mk2.ubahSKS(3);
        mk2.kurangiJam(5);
        mk2.tampilInformasi();

    }
}
