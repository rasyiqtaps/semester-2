package PraktikumASD.jobsheet3;
public class dataDosen25 {
    
    public static void dataSemuaDosen(dosen25[] arrayOfDosen) {
        int i = 1;
        for (dosen25 dosen25 : arrayOfDosen) {
            System.out.println("Data Dosen ke-" + i++);
            dosen25.cetakInfo();
        }
    }

    public static void jumlahDosenPerJenisKelamin(dosen25[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (dosen25 d : arrayOfDosen) {
            if (d.jenisKelamin) pria++;
            else wanita++;
        }
        System.out.println("Jumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
    }

    public static void rerataUsiaDosenPerJenisKelamin(dosen25[] arrayOfDosen) {
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int jmlPria = 0, jmlWanita = 0;

        for (dosen25 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                totalUsiaPria += d.usia;
                jmlPria++;
            } else {
                totalUsiaWanita += d.usia;
                jmlWanita++;
            }
        }
        System.out.println("Rata-rata Usia Pria   : " + (jmlPria > 0 ? (double)totalUsiaPria/jmlPria : 0));
        System.out.println("Rata-rata Usia Wanita : " + (jmlWanita > 0 ? (double)totalUsiaWanita/jmlWanita : 0));
    }

    public static void infoDosenPalingTua(dosen25[] arrayOfDosen) {
        dosen25 palingTua = arrayOfDosen[0];
        for (dosen25 d : arrayOfDosen) {
            if (d.usia > palingTua.usia) {
                palingTua = d;
            }
        }
        System.out.println("Dosen Paling Tua: " + palingTua.nama + " (" + palingTua.usia + " tahun)");
    }

    public static void infoDosenPalingMuda(dosen25[] arrayOfDosen) {
        dosen25 palingMuda = arrayOfDosen[0];
        for (dosen25 d : arrayOfDosen) {
            if (d.usia < palingMuda.usia) {
                palingMuda = d;
            }
        }
        System.out.println("Dosen Paling Muda: " + palingMuda.nama + " (" + palingMuda.usia + " tahun)");
    }
}