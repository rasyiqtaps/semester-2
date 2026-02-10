package PraktikumASD.jobsheet1;

public class praktikumRoyalGarden {
    static int arrayHarga[] = {75000, 50000, 60000, 10000};
    static String arrayBunga[] = {"aglonema", "keladi", "alocasia", "mawar"};
    static int arrayPendapatan[] = new int[4];
    static int arrayStok[][] = {{10, 5, 15, 7},
                                {6, 11, 9, 12},
                                {2, 10, 10, 5},
                                {5, 7, 12, 9}};
    public static void main(String[] args){

        rumusPendapatan(arrayPendapatan);
        
    }
    public static void rumusPendapatan(int arrayPendapatan[]){
        
        for (int i = 0; i < arrayStok.length; i++) {
            int counter = 0;
            for (int j = 0; j < arrayStok[i].length; j++) {
                counter += arrayStok[i][j] * arrayHarga[j];
            }
            arrayPendapatan[i] = counter;
            if (arrayPendapatan[i] > 1500000) {
                System.out.println("Toko ke- " + (i+1) + " adalah " + arrayPendapatan[i] + " Pendapatanmu : 'Sangat Baik'");
            } else {
                System.out.println("Toko ke- " + (i+1) + " adalah " + arrayPendapatan[i] + " Pendapatanmu : 'perlu dievaluasi'");
            }
        }
    }
}

