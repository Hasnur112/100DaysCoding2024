import java.util.Scanner;

public class day96 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Masukkan angka ganjil sebagai panjang dari baris: ");
        int baris = ip.nextInt();
        int n = baris / 2 + 1;
        if (baris % 2 == 0) {
            System.out.println("Inputan harus ganjil agar hasilnya simetris.");
        } else {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i = n - 1; i >= 1; i--) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        ip.close();
    }
}
