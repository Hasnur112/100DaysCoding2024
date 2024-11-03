import java.util.Scanner;

public class Day63 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int total = 0;
        int a;
        int mx = Integer.MIN_VALUE; 
        int mn = Integer.MAX_VALUE; 

        do {
            System.out.print("Masukkan angka (0 untuk mengakhiri loop): ");
            a = ip.nextInt();            
            if (a < 0) {
                System.out.println("angka negatif skip");
                continue;
            }
            if (a != 0) {
                total += a;                
                if (a > mx) {
                    mx = a;
                }
                if (a < mn) {
                    mn = a;
                }
            }
        } while (a != 0);
        ip.close();
        
        if (mx != Integer.MIN_VALUE && mn != Integer.MAX_VALUE) {
            System.out.println("\n---+---Hasil Akhir---+---:");
            System.out.println("Jumlah total: " + total);
            System.out.println("Angka terbesar: " + mx);
            System.out.println("Angka terkecil: " + mn);
        } else {
            System.out.println("input tidak valkd");
        }
    }
}
