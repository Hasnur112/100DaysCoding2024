import java.util.*;
 class evaluasi_day11 {
   public static void main(String args[])
   {
    //Deklarasi var 1 dan var 2
    byte var1; //mendeklarasikan var1 dgn tipe data byte
    String var2;//mendeklarasikan; var2 dengan tipe data string
    //inisialisasi variabel sebanyak 3 dengan nama variabel var3 var4 var5
    int var5 = 999; //inisialsjasi var5 dgn nilai 999 menggunakan tipe data integer
    short var4 = 87; //inisialisaj var4 dengan nilai 87 menggunakan tipe data short
    final String var3 = "Day11_Evaluasi"; //inisialisasi var 3 dengan Day11 menggunakan tipe data string dan membuatnya final artinya nilai nya tidak akan bisa di update atau diubah lagi
    //print dengan format menggunakan printf
    //%d untuk int byte dan short %s untuk String
    System.out.printf("\nvar3: %s\nvar4: %d\nvar5: %d",var3,var4,var5);
    //variabel update, variabel yg sudah kita buat akan diubah
    var1 = 17;//mengupdate variabel var1 dengan nilai 17 menggunakan tipe data byte
    var4 = 60; //mengganti nila var4 menjadi 60
    var5 = 888;//mengganti nilai var5 menjadi 888
    //kita panggil lagi variabel yang sudah kita ubah atau update
    System.out.printf("\nNilai setelah update\nvar1: %d\nvar4 :%d\nvar5 :%d",var1,var4,var5);
   }
 }
