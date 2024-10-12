import java.util.Scanner;
public class Day41
 {
   public static void main(String args[])
   {
    Scanner ip = new Scanner(System.in);
    System.out.println("op perbandingan");
    System.out.print("masukkan nilai pertama");
    float a = ip.nextFloat();
    System.out.print("masukkan nilai kedua");
    float b = ip.nextFloat();
    
    //mencetak nilai 1 dan 2
    System.out.println("Nilai 1 = "+a+"\nNilai 2 = "+b);
    
    //perbandingan besar sama dengan dan kecil sama dengan 
    System.out.println("Apakah a besar atau sama dengan b? : "+(a >= b));
    System.out.println("Apakah a kecil atau sama dengan b? : "+(a <= b));
    
   }
 }
