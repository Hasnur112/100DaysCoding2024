import java.util.Scanner;
import java.util.Arrays;

public class latihan {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Silahkan pilih dari tiga pilihan berikut: ");
        System.out.println("1. Array String \n2. Array integer \n3. Array double");
        System.out.print("Pilih: ");
        int pilih = ip.nextInt();
        ip.nextLine();

        if (pilih == 1) {
            System.out.print("Masukkan panjang dari array yang ingin dibuat: ");
            int p = ip.nextInt();
            ip.nextLine();
            String[] a = new String[p];
            for (int i = 0; i < p; i++) {
                System.out.println("Elemen ke-" + i + " :");
                a[i] = ip.nextLine();
            }
            System.out.println("Isi:");
            for (int i = 0; i < p; i++) {
                System.out.println("Elemen ke-" + i + ": " + a[i]);
            }
            System.out.println("Hasil akhir...");
            System.out.println(Arrays.toString(a));

            String jawab;
            do {
                System.out.print("Apakah Anda ingin mengubah nilai di array (ya/tidak): ");
                jawab = ip.nextLine();
                if (jawab.equalsIgnoreCase("ya") || jawab.equalsIgnoreCase("y") || jawab.equalsIgnoreCase("iya")) {
                    System.out.println("Masukkan index yang ingin diubah (0 - " + (p - 1) + "): ");
                    int id = ip.nextInt();
                    ip.nextLine();
                    System.out.print("Masukkan nilai baru: ");
                    a[id] = ip.nextLine();
                    System.out.println("Setelah perubahan...");
                    System.out.println(Arrays.toString(a));
                    System.out.print("Apakah masih ingin lanjut mengedit? (ya/tidak): ");
                    jawab = ip.nextLine();
                }
            } while (jawab.equalsIgnoreCase("ya") || jawab.equalsIgnoreCase("y") || jawab.equalsIgnoreCase("iya"));
            System.out.println("Program selesai");

        } else if (pilih == 2) {
            System.out.print("Masukkan panjang array yang ingin dibuat: ");
            int p = ip.nextInt();
            int[] a = new int[p];
            for (int i = 0; i < p; i++) {
                System.out.println("Elemen ke-" + i + ": ");
                a[i] = ip.nextInt();
            }
            System.out.println("Isi:");
            for (int i = 0; i < p; i++) {
                System.out.println("Elemen ke-" + i + ": " + a[i]);
            }
            System.out.println("Hasil akhir...");
            System.out.println(Arrays.toString(a));

            String jawab;
            do {
                System.out.print("Apakah Anda ingin mengubah nilai di array (ya/tidak): ");
                ip.nextLine();
                jawab = ip.nextLine();
                if (jawab.equalsIgnoreCase("ya") || jawab.equalsIgnoreCase("y") || jawab.equalsIgnoreCase("iya")) {
                    System.out.println("Masukkan index yang ingin diubah (0 - " + (p - 1) + "): ");
                    int id = ip.nextInt();
                    System.out.print("Masukkan nilai baru: ");
                    a[id] = ip.nextInt();
                    System.out.println("Setelah perubahan...");
                    System.out.println(Arrays.toString(a));
                    System.out.print("Apakah masih ingin lanjut mengedit? (ya/tidak): ");
                    ip.nextLine();
                    jawab = ip.nextLine();
                }
            } while (jawab.equalsIgnoreCase("ya") || jawab.equalsIgnoreCase("y") || jawab.equalsIgnoreCase("iya"));
            System.out.println("Program selesai");

        } else if (pilih == 3) {
            System.out.print("Masukkan panjang array yang ingin dibuat: ");
            int p = ip.nextInt();
            double[] a = new double[p];
            for (int i = 0; i < p; i++) {
                System.out.println("Elemen ke-" + i + ": ");
                a[i] = ip.nextDouble();
            }
            System.out.println("Isi:");
            for (int i = 0; i < p; i++) {
                System.out.println("Elemen ke-" + i + ": " + a[i]);
            }
            System.out.println("Hasil akhir...");
            System.out.println(Arrays.toString(a));

            String jawab;
            do {
                System.out.print("Apakah Anda ingin mengubah nilai di array (ya/tidak): ");
                ip.nextLine();
                jawab = ip.nextLine();
                if (jawab.equalsIgnoreCase("ya") || jawab.equalsIgnoreCase("y") || jawab.equalsIgnoreCase("iya")) {
                    System.out.println("Masukkan index yang ingin diubah (0 - " + (p - 1) + "): ");
                    int id = ip.nextInt();
                    System.out.print("Masukkan nilai baru: ");
                    a[id] = ip.nextDouble();
                    System.out.println("Setelah perubahan...");
                    System.out.println(Arrays.toString(a));
                    System.out.print("Apakah masih ingin lanjut mengedit? (ya/tidak): ");
                    ip.nextLine();
                    jawab = ip.nextLine();
                }
            } while (jawab.equalsIgnoreCase("ya") || jawab.equalsIgnoreCase("y") || jawab.equalsIgnoreCase("iya"));
            System.out.println("Program selesai");

        } else {
            System.out.println("Pilihan tidak valid.");
        }

        ip.close();
    }
}
