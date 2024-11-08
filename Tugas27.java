import java.util.Scanner;

public class Tugas27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahResponden = 10;
        int jumlahPertanyaan = 6;

        int[][] dataSurvei = new int[jumlahResponden][jumlahPertanyaan];

        System.out.println("Masukkan nilai survei (1-5):");
        for (int i = 0; i < jumlahResponden; i++) {
            for (int j = 0; j < jumlahPertanyaan; j++) {
                System.out.print("Responden " + (i + 1) + ", Pertanyaan " + (j + 1) + ": ");
                dataSurvei[i][j] = input.nextInt();
            }
        }

        System.out.println("\nRata-rata per responden:");
        for (int i = 0; i < jumlahResponden; i++) {
            int jumlahNilai = 0;
            for (int j = 0; j < jumlahPertanyaan; j++) {
                jumlahNilai += dataSurvei[i][j];
            }
            double rataRataResponden = (double) jumlahNilai / jumlahPertanyaan;
            System.out.println("Responden " + (i + 1) + ": " + rataRataResponden);
        }

        System.out.println("\nRata-rata per pertanyaan:");
        for (int j = 0; j < jumlahPertanyaan; j++) {
            int jumlahNilai = 0;
            for (int i = 0; i < jumlahResponden; i++) {
                jumlahNilai += dataSurvei[i][j];
            }
            double rataRataPertanyaan = (double) jumlahNilai / jumlahResponden;
            System.out.println("Pertanyaan " + (j + 1) + ": " + rataRataPertanyaan);
        }

        int jumlahTotalNilai = 0;
        for (int i = 0; i < jumlahResponden; i++) {
            for (int j = 0; j < jumlahPertanyaan; j++) {
                jumlahTotalNilai += dataSurvei[i][j];
            }
        }
        double rataRataKeseluruhan = (double) jumlahTotalNilai / (jumlahResponden * jumlahPertanyaan);
        System.out.println("\nRata-rata keseluruhan: " + rataRataKeseluruhan);
    }
}
