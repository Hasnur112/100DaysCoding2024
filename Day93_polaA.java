import java.util.Scanner;

public class Latihan2 {
    public static void pola(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                if (j == n - 1 - i || j == n - 1 + i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris: ");
        int n = ip.nextInt();
        System.out.println("Hasil:");
        pola(n);
        ip.close();
    }
}
