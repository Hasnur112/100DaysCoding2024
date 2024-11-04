import java.util.Scanner;

public class Day64 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        
        System.out.print("Masukkan batas hitungan: ");
        int batas = ip.nextInt();
        
        System.out.println("Program akan menghitung sampai " + batas);
        System.out.println("Mulai menghitung...\n");
        
        luar: while(true) {
            int a = 0;
            while(true) {
                a++;
                System.out.println("Hitungan ke-" + a);
                
                if(a == batas) {
                    break luar; 
                }
            }
        }
        System.out.println("\nDone bang");
        ip.close();
    }
}
