    import java.util.Scanner;
    public class SIAKAD27 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int jumlahSiswa, jumlahMataKuliah;

            System.out.println("========================================");
            System.out.println("Input Data Nilai & Mata Kuliah Mahasiswa");
            System.out.println("========================================");
            System.out.print("Masukkan Jumlah siswa: ");
            jumlahSiswa = sc.nextInt();
            System.out.print("Masukkan jumlah Mata Kuliah: ");
            jumlahMataKuliah = sc.nextInt();
            int[][] nilai = new int[jumlahSiswa][jumlahMataKuliah];

            System.out.println("========================================");
            for (int i = 0; i < nilai.length; i++) {
                System.out.println("Input nilai mahasiswa ke-" + (i+1));
                double totalPerSiswa = 0;

                for (int j = 0; j < nilai[i].length; j++) {
                    System.out.print("Nilai mata kuliah " + (j+1) + ": ");
                    nilai[i][j] = sc.nextInt();
                    totalPerSiswa += nilai[i][j];
                }

                System.out.println("Nilai rata-rata: " + totalPerSiswa/nilai[i].length);
            }

            System.out.println("\n====================================");
            System.out.println("Rata-rata Nilai setiap Mata Kuliah:");

            for (int j = 0; j < nilai[j].length; j++) {
                double totalPerMatkul = 0;

                for (int i = 0; i < nilai.length; i++) {
                    totalPerMatkul += nilai[i][j];
                }

                System.out.println("Mata kuliah " + (j+1) + ": " + totalPerMatkul / nilai.length);
            } sc.close();
        }
    }
