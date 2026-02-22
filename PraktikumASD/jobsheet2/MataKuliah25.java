public class MataKuliah25 { 
    
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah25() {}

    public MataKuliah25 (String MK, String nm, int sks, int jmlJam) {
        kodeMK = MK;
        nama = nm;
        this.sks = sks;
        jumlahJam = jmlJam;
    }
    
    void tampilInformasi(){
        System.out.println("Mata Kuliah : " + kodeMK);
        System.out.println("Nama Dosen : " + nama);
        System.out.println("SKS : " + sks);
        System.out.println("Jam : " + jumlahJam);
    }

    void ubahSKS(int sksBaru) {
        System.out.println("pemanggilan perubahan sks terdeteksi. nilai sks telah dirubah!");
        sks = sksBaru;
    }

    void tambahJam(int jam) {
        jumlahJam += jam;
    }

    void kurangiJam(int jam) {
        if (jumlahJam <= jam) {
            System.out.println("pengurangan jam tidak dapat dilakukan. jam tidak dikurangi");
        } else {
            jumlahJam -= jam;
        }
    }
}
