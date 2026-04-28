package jobsheet1;
import java.util.Scanner;

public class tugas2ProgramMahasiswa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan Jadwal: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[][] arrayJadwalMahasiswa = new String[n][4];

        int pos = 0;    
        System.out.println("Selamat Datang Di Menu Pencatatan Jadwal Mahasiswa");
        
        while (true) {
            System.out.println("pilih menu: \t 1: input data\t 2: tabel jadwal\t 3: cari data sesuai hari\t 4: cari data sesuai matakuliah");
            System.out.print("===");
            pos = sc.nextInt();
            
            switch (pos) {
                case 1:
                    inputJadwalKuliah(arrayJadwalMahasiswa);
                    break;
                    
                    case 2:
                        tabelJadwal(arrayJadwalMahasiswa);
                        break;
                        
                        case 3:
                            mencariHariKuliah(arrayJadwalMahasiswa);
                            break;
                            
                            case 4:
                                mencariJadwalKuliah(arrayJadwalMahasiswa);
                                break;
                                
                                default:
                                    System.out.println("kode invalid.");
                                    continue;
                                }
                                }
    }
    
    static void mencariJadwalKuliah(String[][] arrayJadwalMahasiswa) {
    Scanner sc = new Scanner(System.in);
    boolean ditemukan = false;

    System.out.print("Masukkan nama mata kuliah yang dicari: ");
    String key = sc.nextLine();

    System.out.println("\nHasil pencarian mata kuliah: " + key);
    System.out.println("===========================================================================");
    System.out.printf("%-25s %-14s %-20s %-15s\n",
            "Nama Mata Kuliah", "Ruang", "Hari Kuliah", "Jam Kuliah");
    System.out.println("===========================================================================");

    for (int i = 0; i < arrayJadwalMahasiswa.length; i++) {
        if (arrayJadwalMahasiswa[i][0].equalsIgnoreCase(key)) {
            System.out.printf("%-25s %-14s %-20s %-15s\n",
                    arrayJadwalMahasiswa[i][0],
                    arrayJadwalMahasiswa[i][1],
                    arrayJadwalMahasiswa[i][2],
                    arrayJadwalMahasiswa[i][3]);
            ditemukan = true;
        }
    }

    if (!ditemukan) {
        System.out.println("Mata kuliah tidak ditemukan.");
    }

    System.out.println("===========================================================================");
    }


    static void mencariHariKuliah(String[][] arrayJadwalMahasiswa){
            Scanner sc = new Scanner(System.in);
            boolean ditemukan = false;

            System.out.print("Hari: ");
            String key = sc.nextLine();

            System.out.println("\nHasil pencarian jadwal hari " + key + ":");
            System.out.println("===========================================================================");
            System.out.printf("%-25s %-14s %-20s %-15s\n",
                    "Nama Mata Kuliah", "Ruang", "Hari Kuliah", "Jam Kuliah");
            System.out.println("===========================================================================");

            for (int i = 0; i < arrayJadwalMahasiswa.length; i++) {
                if (arrayJadwalMahasiswa[i][2].equalsIgnoreCase(key)) {
                    System.out.printf("%-25s %-14s %-20s %-15s\n",
                            arrayJadwalMahasiswa[i][0],
                            arrayJadwalMahasiswa[i][1],
                            arrayJadwalMahasiswa[i][2],
                            arrayJadwalMahasiswa[i][3]);
                    ditemukan = true;
                }
            }

            if (!ditemukan) {
                System.out.println("Tidak ada jadwal kuliah pada hari tersebut.");
            }

        System.out.println("===========================================================================");
    }

    static void tabelJadwal(String[][] arrayJadwalMahasiswa) {
        System.out.println();
        System.out.printf("%-25s %-14s %-20s %-15s\n",
                "Nama Mata Kuliah", "Ruang", "Hari Kuliah", "Jam Kuliah");

        System.out.println("===========================================================================");

        for (int i = 0; i < arrayJadwalMahasiswa.length; i++) {
            System.out.printf("%-25s %-14s %-20s %-15s\n",
                    arrayJadwalMahasiswa[i][0],
                    arrayJadwalMahasiswa[i][1],
                    arrayJadwalMahasiswa[i][2],
                    arrayJadwalMahasiswa[i][3]);
        }

        System.out.println("===========================================================================");
    }

    static void inputJadwalKuliah(String[][] arrayJadwalMahasiswa) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arrayJadwalMahasiswa.length; i++) {
            System.out.println("Input Data jadwal ke-" + (i + 1));

            System.out.print("Masukan Nama mata kuliah: ");
            arrayJadwalMahasiswa[i][0] = sc.nextLine();

            System.out.print("Ruang Kuliah: ");
            arrayJadwalMahasiswa[i][1] = sc.nextLine();

            System.out.print("Masukan Hari kuliah: ");
            arrayJadwalMahasiswa[i][2] = sc.nextLine();

            System.out.print("Jam kuliah: ");
            arrayJadwalMahasiswa[i][3] = sc.nextLine();

            System.out.println();
        }
    }
}
