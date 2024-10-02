public class Day31 {
   public static void main(String args[])
   { 
    int a = 90;
    double b = 90.71;
    char c = 'H';
    float d = 45.89f;
    System.out.printf("sebelum di konversi ke string\n%d\n%.2f\n%c\n%.1f\n",a,b,c,d);
    //konver ke string menggunakan valueOf
    System.out.println("Setelah di konversi");
    String a1 = String.valueOf(a);
    System.out.println("nilai int ke string: "+a1);
    String b1 = String.valueOf(b);
    System.out.println("double ke string: "+b1);
    String c1 = String.valueOf(c);
    System.out.println("char ke string: "+c1);
    String d1 = String.valueOf(d);
    System.out.println("float ke String: "+d1);
   }
 }
