import java.util.Scanner;//import dulu
public class Day14 {
  public static void main(String[] args) {
     Scanner ip = new Scanner(System.in);//buat pemanggilan input
     final String nama = "HASNUR";
     final String nim = "D0223509";
     
     System.out.println("Kalkulator hitung luas dan keliling persegi panjang");
     System.out.println("---------------"); 
     System.out.print("Masukkan panjang \t= "); 
     
     double panjang = ip.nextDouble();//untuk pengguna memasukkan input panjang ke konsol
     System.out.print("Masukkan lebar \t= "); 
     
     double lebar = ip.nextDouble();//untuk pengguna memasukkan input lebar ke konsol
     System.out.println("---------------"); 
     
     //rumus hiting luas L = p*l
     double luas = panjang * lebar;
     //rumus hitung keliling K = 2(p+l)
     double keliling = 2 * (panjang + lebar);
     
     //print hasil 
     System.out.println("Hasil");
     System.out.println("---------------"); 
     System.out.println("Luas \t= "+luas);
     System.out.println("keliling \t= "+keliling); 
  }
}
