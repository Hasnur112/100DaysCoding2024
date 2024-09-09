import java.util.*;
 class Day8 {
   public static void main(String args[])
   {
    System.out.println("Day8");
    final String nama = "HASNUR";
    final String jBaju = "Stone island";
    int noSeri = 1110011;
    byte jumlah = 24;
    //char uB,uB1,uB2; 
    String uB3,uB4;//variabel deklarasi
   /* komentar untuk menghilangkan banya bariz
    uB = 'S';
    uB1 = 'M';
    uB2 = 'L';
    uB3 = "XL";
    uB4 = "XXL";
    */
    short s,m,l,xl,xxl;//variabel deklarasi
    s = 4;
    m = 6;
    l = 3;
    xl = 4;
    xxl = 7;
    System.out.println("TOKO BAJU");
    System.out.printf("\nMerek Baju\t:%s\nNomor Baju\t:%d\nJumlah Tersedia\t:%d\n",jBaju,noSeri,jumlah); //printf untuk format
    System.out.println("Stok Baju");
    System.out.printf("Ukuran S\t: %d\nUkuran M\t: %d\nUkuran L\t: %d\nUkuran XL\t: %d\nUkuran XXL\t: %d\n",s,m,l,xl,xxl);
    //Variabel update
    System.out.println("Stok setelah penjualan");
    s = 2;
    m = 3;
    l = 0;
    xl = 1;
    xxl = 5;
    System.out.printf("\nUkuran S\t: %d\nUkuran M\t: %d\nUkuran L\t: %d\nUkuran XL\t: %d\nUkuran XXL\t: %d\n",s,m,l,xl,xxl);
   }
 }
