import java.util.Scanner;

public class day94 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        
        System.out.print("Masukkan tinggi segitiga: ");
        int tinggi = ip.nextInt();
        
        for (int i = 1; i <= tinggi; i++) {
            for (int j = i; j < tinggi; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        ip.close();
    }
}
