public class Day35
 {
   public static void main(String args[])
   { 
    System.out.println("Operator penugasan");
    int a,b,c,d;
    a = 20;
    b = 55;
    c = 62;
    d = 44;
    //menampilkan sebelum perubahan
    System.out.println("Sebelum penambahan dan pengurangan");
    System.out.printf ("a = %d, b = %d, c = %d, d = %d\n",a,b,c,d);   
    //operator penugasan penambahn
    a += 35;
    b += 10;
    c -= 32;
    d -= 20;
    //print 
    System.out.println("Setelah penambahan dan pengurangan");
    System.out.printf ("a = %d, b = %d, c = %d, d = %d",a,b,c,d);   
   }
 }
