import java.util.Scanner;
public class Day44 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("+------------------------------------------------+");
        System.out.println ("Operator logika or");
        
        System.out.print ("Apakah anda sudah membayar biaya masuk? (iya/tidak)\t:");
        String a = ip.next();
        
        System.out.print ("Apakah anda anggota ISC? (iya /tdak)\t:");
        String b = ip.next();
        
        //mengunakan logika or untuk membuat sebuah jawaban atas pilihan
        if(a.equals("iya")||b.equals("iya")){ 
            System.out.println("Kamu memenuhi syarat untuk mengikuti seminar ini");
        }else{
            System.out.println("Kamu tidak memenuhi syrat untuk mengikuti seminar ini");
        }
        System.out.println("+------------------------------------------------+");
    }
}
