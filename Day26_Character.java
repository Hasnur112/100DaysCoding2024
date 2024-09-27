public class Day26 {
   public static void main(String args[])
   { 
    Character huruf = 'a';
    Character angka = '1';
    Character op = '*';
    
    System.out.println("Huruf: " + huruf);
    System.out.println("Angka: " + angka);
    System.out.println("Simbol: " + op);

    // Menggunakan metode dari kelas Character
    System.out.println("Huruf Besar: " + Character.toUpperCase(huruf)); // Output: Huruf Besar: A
    System.out.println("Apakah Angka sebuah digit: " + Character.isDigit(angka)); // Output: Apakah Angka: true
   }
 }
