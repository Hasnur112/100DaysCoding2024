import java.util.Scanner;
public class Day33
 {
   public static void main(String args[])
   {
    Scanner ip = new Scanner(System.in);//metode pemanggilan scanner 
    System.out.println("Input ke konsol");
    
    //mendeklarasilkan variabel dengan scanner
    System.out.println ("Masukkan kata bebas yang dimana nanti akan di tampilkan ke konsol");
    String a = ip.nextLine();//untuk string menggunnkan nextLine
    
    //mendeklarasikan iinteger
    System.out.println ("masukkan angka bilangan bulat bebas yang akan ditampilkan ke konsol");
    int b = ip.nextInt();
    
    //mendeklarasikan double
    System.out.println ("masukkan bilangan desimal bebas yang akan di tampilkan ke konsol");
    double  c = ip.nextDouble();
    
    //mendeklarasikan charakter
    System.out.println ("masukkan 1 karakter bebas yang akan di tampilkan ke konsol");
    char d = ip.next().charAt(0);//metode ppemanggilan char
    
    System.out.printf ("Kata: %s\nBilangan bulat: %d\nBilangan Desimal: %.2f\n karakter: %c",a,b,c,d);
   }
 }
