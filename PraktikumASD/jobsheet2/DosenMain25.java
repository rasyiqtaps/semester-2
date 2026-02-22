public class DosenMain25 { 
    public static void main(String[] args) {

        Dosen25 dsn1 = new Dosen25();
        dsn1.idDosen = "ID dosen 1";
        dsn1.nama = "Dosen 1";
        dsn1.statusAktif = false;
        dsn1.tahunBergabung = 2018;
        dsn1.bidangKeahlian = "MK 1";

        dsn1.setStatusAktif(false);
        dsn1.ubahKeahlian("Struktur Data");
        dsn1.tampilInformasi();
        System.out.println("Masa Kerja : " + dsn1.hitungMasaKerja(2026) + " tahun");

        Dosen25 dsn2 = new Dosen25("ID dosen 1", "Dosen 2", false, 2020, "MK 2");
        dsn2.setStatusAktif(true);
        dsn2.ubahKeahlian("Pemrograman Java");
        dsn2.tampilInformasi();
        System.out.println("Masa Kerja : " + dsn2.hitungMasaKerja(2026) + " tahun");
    }
}