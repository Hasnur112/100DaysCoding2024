import java.math.BigInteger;

public class Day28 {
    public static void main(String[] args) {
        BigInteger b1 = BigInteger.valueOf(1000000000000000000L);
        BigInteger b2 = BigInteger.valueOf(500000000000000000L);

        System.out.println("Bilangan 1: " + b1); // Mengganti bilangan1 dengan b1
        System.out.println("Bilangan 2: " + b2); // Mengganti bilangan2 dengan b2

        // Operasi Aritmatika
        BigInteger hasilPenjumlahan = b1.add(b2); // Menambahkan b1 dengan b2
        System.out.println("Hasil Penjumlahan: " + hasilPenjumlahan);

        BigInteger hasilPengurangan = b1.subtract(b2); // Melakukan pengurangan b1 dan b2
        System.out.println("Hasil Pengurangan: " + hasilPengurangan);

        BigInteger hasilPerkalian = b1.multiply(b2); // Mengalikan b1 dengan b2
        System.out.println("Hasil Perkalian: " + hasilPerkalian);

        BigInteger hasilPembagian = b1.divide(b2); // Membagi b1 dengan b2
        System.out.println("Hasil Pembagian: " + hasilPembagian);

        BigInteger hasilSisa = b1.mod(b2); // Modulo
        System.out.println("Sisa Pembagian: " + hasilSisa);
    }
}
