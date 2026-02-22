public class mahasiswa25 { 
    
    String nama;
    String nim;
    String kelas;
    double ipk;

    public mahasiswa25() {}

    public mahasiswa25 (String nm, String nim, double ipk, String kls) {
        nama = nm;
        this.nim = nim;
        this.ipk = ipk;
        kelas = kls;
    }
    
    void tampilkanInformasi(){
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("IPK : " + ipk);
        System.out.println("Kelas : " + kelas);
    }

    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }

    void updateIpk(double ipkBaru) {
        //ipk = ipkBaru;
        while (true) {
            // ipkBaru = sc.nextDouble();
            if (0.0 <= ipkBaru && ipkBaru <= 4.0) {
                ipk = ipkBaru;
                break;
            } else {
                System.out.print("Angka tidak valid. input Ipk baru : ");
            }
        }
    }

    String nilaiKerja() {
        if (ipk >= 3.5) {
            return "Kinerja Sangat Baik";
        } else if (ipk >= 3.0) {
            return "Kinerja Baik";
        } else if (ipk >= 2.0) {
            return "Kinerja Cukup";
        } else {
            return "Kinerja Kurang"; 
        }
    }
}
