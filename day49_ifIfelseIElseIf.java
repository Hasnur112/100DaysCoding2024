import java.util.Scanner;
 public class Day49
 {
   public static void main(String args[])
   {
    Scanner ip = new Scanner(System.in);
    System.out.println ("Catatan unuk semua jawaban diwajibkan menggunakan lowerchase atau  huruf kecil")
    System.out.println("tahukah kamu hari kebrapa sekarang dari 100 days of coding yang kita lakukan? jawab(iya/tau/tidak) :");
    String a = ip.next();
    
    if(a.equals("iya")||a.equals("tau")){
      System.out.print ("Hari keberapa kalo kamu tau?");
      String b = ip.next();
      
      if(b.equals("49")||b.equals("ke49")||b.equals("hari ke 49")||b.equals("hari 49")||b.equals("hari ke49")||b.equals("hari49")){
        System.out.println("Benar sekali, tidak teras kita sudah dihari ke 49 hehe");
      }else{
        System.out.println("Jawaban tidak terdaftar");
      }
      ip.close();
    }else if(a.equals("tidak")){
      System.out.println ("Ini hari ke 49, ingat yaa:)");
    }else{
      System.out.println("Jawaban tidak terdaftar");
    }
    ip.close();
   }
 }
