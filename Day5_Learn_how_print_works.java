import java.util.*;
 class Day5
 {
   public static void main(String args[])
   { 
    System.out.println("Selamat datang di hari 5");
    final String hari = "Day5";
    final String nama = "HASNUR";
    //penggunaan komentar digunakan dengan kode (// dan/*)    
    //variabel deklarasi untuk penggunaan string,byte,short,int    
    String h1,h2,h3,h4,h5;
    byte b1,b2,b3,b4;
    short s1,s2;
    int i1,i2;
    char d;
    //Setelah kita deklarasi kita harus menginisialisasinya 
    //Variabel : inisialisasi
    d = 'D';
    h1 = "ayo";
    h2 = "kita belajar";
    h3 = "coding selama 100 hari";
    //rentan nilai short berkisar -128 hingga 127
    b1 = 2;
    b2 = 23;
    b3 = 50;
    b4 = 9;
    s1 = -32768;
    s2 = 32767;
    i1 = -2147483648;
    i2 = 2147483647;
    //penggunaan print akan menampilkan baris tanpa menambah baris baru,
    //artinya Jika kita menggunakan  print  beberapa kali berturut-turut, teks akan ditampilkan dalam satu baris.
    //contoh dibawah ini
    System.out.print("Saya-"+nama);
    System.out.print("-NIM-"+d+"0");
    System.out.print(b1);
    System.out.print(b2);
    System.out.print(b3);
    System.out.println(b4); 
    System.out.print(h1);
    System.out.print(" "+h2);
    System.out.print(" "+h3);
    //penggunaan println akan menambah baris baru untuk setiap print berturut-turut 
    System.out.println("\nBatas bawah untuk nilai short berkisar: "+s1);
    System.out.println("Batas atas untuk nilai short berkisar: "+s2);
    //penggunaan printf akan membuat kita bisa memformat hasil print secara khusus 
    //seperti menambah baris baru, menggabungkan berbagai tipe data dll
    System.out.printf("\nRentan nilai integer berkisar :%d hingga :%d",i1,i2);
    
    //variabel update 
    //variabel update berarti proses mengubah nilai yang sudah kita inisialisasi sebelumnya
    h1 = "Semangat";
    h2 = "Hingga keringat";
    h3 = "berubah menjadi saldo dana";
    System.out.println("Variabel update\n");
    System.out.print(h1);
    System.out.printf("\n%s \n%s",h2,h3);
    
   }
 }
