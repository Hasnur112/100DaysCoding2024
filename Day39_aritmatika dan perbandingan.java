import java.util.Scanner;
 public class Dcoder
 {
   public static void main(String args[])
   {
    Scanner ip = new Scanner(System.in);
    System.out.println("Op perbandingan\nMasukkan angka bilanganbulat");
    
     System.out.print("Nilai 1 = ");
    int a = ip.nextInt();
    System.out.print("Nilai 2 = ");
    int b = ip.nextInt();
     
    System.out.println("Sebelum di jumlahkan");
   
    System.out.println("Nilai a = "+a);
    System.out.println("Nilai b = "+b);
    
    System.out.println("a lebih besar dari (>) b: " + (a > b)); 
    System.out.println("a lebih kecil dari (<) b: " + (a < b)); 
    
    System.out.println("a sama dengan (==) b: " + (a == b)); 
    System.out.println("a tidak sama dengan (!=) b: " + (a != b)); 
    System.out.println("a lebih besar dari atau sama dengan (>=) b: " + (a >= b)); 
    System.out.println("a lebih kecil dari atau sama dengan (<=) b: " + (a <= b));
    System.out.println("Nilai akhir");
    System.out.println("Nilai a = "+a);
    System.out.println("Nilai b = "+b);
  
    //op penugasan
    System.out.println ("Nilai 1 Kan ditambahkan dengan 40 dan nilai 2 akan di sisa bagi dengan 3");
    a += 40;
    b %= 3;
    
    //operator    
    System.out.println("a lebih besar dari (>) b: " + (a > b)); 
    System.out.println("a lebih kecil dari (<) b: " + (a < b)); 
    System.out.println("a sama dengan (==) b: " + (a == b)); 
    System.out.println("a tidak sama dengan (!=) b: " + (a != b)); 
    System.out.println("a lebih besar dari atau sama dengan (>=) b: " + (a >= b)); 
    System.out.println("a lebih kecil dari atau sama dengan (<=) b: " + (a <= b));
   
   }
 }
