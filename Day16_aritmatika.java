import java.util.Scanner;

public class day16 {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int angka1 = ip.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int angka2 = ip.nextInt();

        // Penjumlahan
        int hasilPenjumlahan = angka1 + angka2;
        System.out.println("Hasil penjumlahan: " + hasilPenjumlahan);

        // Pengurangan
        int hasilPengurangan = angka1 - angka2;
        System.out.println("Hasil pengurangan: " + hasilPengurangan);

        // Perkalian
        int hasilPerkalian = angka1 * angka2;
        System.out.println("Hasil perkalian: " + hasilPerkalian);

        // Pembagian
        int bagi = angka1 / angka2;
        System.out.println("Hasil bagi: " + bagi);
        // Modulo atau hasil bagi
        int hasilModulo = angka1 % angka2;
        System.out.println("Hasil modulo: " + hasilModulo);
    }
}
