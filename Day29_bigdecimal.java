import java.math.BigDecimal;

public class Day29 {
    public static void main(String[] args) {
        BigDecimal b1 = BigDecimal.valueOf(123.456); 
        BigDecimal b2 = BigDecimal.valueOf(78.901); 

        System.out.println("Bilangan 1: " + b1);
        System.out.println("Bilangan 2: " + b2);

        // Operasi Aritmatika
        BigDecimal hasilPenjumlahan = b1.add(b2);//menambahkan b1 dan b2
        System.out.println("Hasil Penjumlahan: " + hasilPenjumlahan); 

        BigDecimal hasilPengurangan = b1.subtract(b2); //mengurangkan b2 dengan b1
        System.out.println("Hasil Pengurangan: " + hasilPengurangan);

        BigDecimal hasilPerkalian = b1.multiply(b2); //mengalikan b2 dengan b1
        System.out.println("Hasil Perkalian: " + hasilPerkalian);

        BigDecimal hasilPembagian = b1.divide(b2, 2, BigDecimal.ROUND_HALF_UP); // membagi b1 dan b2 tapi hasil terbatas 2 angka setelah koma
        System.out.println("Hasil Pembagian: " + hasilPembagian);

        // Perbandingan
        int hasilPerbandingan = b1.compareTo(b2); 
        System.out.println("Perbandingan: " + hasilPerbandingan); // 1 jika b1 lebih b2, -1 jika b1 lebih kcl b2, 0 jika sama

        // Konversi ke String
        String strBilangan1 = b1.toString(); 
        System.out.println("Bilangan 1 (String): " + strBilangan1);
    }
}
