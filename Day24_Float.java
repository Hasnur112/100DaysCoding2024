public class Day24
 {
   public static void main(String args[])
   { 
    Float angka1 = 29.7f;
    Float angka2 = 17.25f;
    //panggil keluarannya
    System.out.printf("nilai angka 1 = %.1f\nnilai angka 2 = %.2f\n",angka1,angka2);
    
    //menambahkan variabel angka3 dari hasil angka 1 dan 2
    Float angka3 = angka1 + angka2;
    System.out.printf("nilai angka3 = %.2f\n",angka3);
    
    //mengubah hasil angka 3 ke string 
    String a3 = String.valueOf(angka3);
    System.out.printf("nilai angka 3 dalam string = %s",a3);
   }
 }
