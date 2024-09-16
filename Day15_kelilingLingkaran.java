import java.util.Scanner;//import dulu

public class Day15 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in); //Program untuk membuat pengguna dapat menginput

        System.out.println("Kalkulator Luas & Keliling Lingkaran");
        System.out.println("-------------------------------------");

        System.out.print("Masukkan jari-jari lingkaran: ");
        double jariJari = ip.nextDouble();//scanner untuk inputan ke konsol

        // Menghitung Luas lingkaran
        double luas = Math.PI * Math.pow(jariJari, 2);//math pi untuk memanggil pi dalam java

        // Menghitung Keliling lingkaran 
        double keliling = 2 * Math.PI * jariJari;

        //print hasil
        System.out.println("Hasil Perhitungan dari: "+jariJari+" cm");
        System.out.println("------------------");
        System.out.printf("Luas Lingkaran \t= %.2f%n", luas);
        System.out.printf("Keliling Lingkaran \t= %.2f%n", keliling);
    }
}
