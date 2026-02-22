public class mahasiswaMain25 {
    public static void main(String[] args) {

        mahasiswa25 mhs1 = new mahasiswa25();

        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        mahasiswa25 mhs2 = new mahasiswa25 ("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        mahasiswa25 mhsRasyiqSM = new mahasiswa25("Rasyiq Satrio Musthafa", "254107020079", 3.67, "TI 1G");
        mhsRasyiqSM.tampilkanInformasi();
    }
}

