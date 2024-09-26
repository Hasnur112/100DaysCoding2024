public class Dcoder {
  public static void main(String args[]) {
    // Deklarasi tipe data reference Double
    Double a = 56.87;
    Double b = 77.2333;
    // Print keluaran menggunakan formater
    System.out.printf("Nilai a = %.2f\nNilai b =   %.1f\n", a, b);

    // Deklarasi variabel string
    String c = "10.7";
    String d = "18.59";

    // Mengubah string ke Double
    Double dc = Double.parseDouble(c); // Jangan lupa masukkan argumen c ke dalam parseDouble
    Double dd = Double.parseDouble(d); // Jangan lupa masukkan argumen d ke dalam parseDouble

    System.out.printf("Nilai c setelah di conver ke Double: %.1f\n", dc);
    System.out.printf("Nilai d setelah di conver ke Double: %.2f\n", dd);
  }
}
