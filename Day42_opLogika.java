import java.util.Scanner;
 public class Day42
 {
   public static void main(String args[])
   { 
    Scanner ip = new Scanner(System.in);
    
    System.out.println ("Untuk kedepannya masukkan true jika iya dan false jika tidak, untuk menjawab");
    System.out.println ("+-----------------------------------------------------------------+");
   
    System.out.println ("Apakah anda sudah menyelesaikan semua tugas tugas anda?");
    boolean a = ip.nextBoolean();
    System.out.println ("Apakah kamu sudah belajar lebih giat dan berusaha semaksimal mungkin?");
    boolean b = ip.nextBoolean();
    
    if(a && b){
      System.out.println ("Kamu memenuhi syarat mengikuti ujian dan telah siap dalam pengerjaannya");
    } else if (a && !b){
        System.out.println ("Kamu harus belajar dulu agar siap meyelesaikan ujian. dan setidaknya jika gagal kamu tidak menyesal");
      } else if (!a && b){
        System.out.println ("Kamu harus mengerjakan tugas mu agar memenuhi syarat untuk mengikuti ujian");
      } else {
        System.out.println ("udahlah kamu berhenti aja");
      } 
      ip.close();
   }
 }
