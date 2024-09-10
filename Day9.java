 class Dcoder
 {
   public static void main(String args[]) {
    final String nama = "HASNUR";
    final String nim = "D0223509";
    System.out.println("Day9");
    System.out.println("Bensin eceran");
    String b = "Bensin";
    
    int harga, harga1, harga2; // Deklarasi
    harga = 18000; // inisialisasi 
    harga1 = 15000;
    harga2 = 12000;
    byte jh, jh1, jh2; // Deklarasi 
    jh = 11;
    jh1 = 10;
    jh2 = 9;
    short tt = 30;
    double l1, l2, l3;
    l1 = 1.5;
    l2 = 1.0;
    l3 = 0.7;
    System.out.println("daftar harga perbotol");
    System.out.printf("\n%s %1.1f Liter: %d per-botol\n%s %1.1f Liter: %d per-botol\n%s %1.1f Liter: %d per-botol"
    , b, l1, harga, b, l2, harga1, b, l3, harga2);    
   }
}
