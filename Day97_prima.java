import java.util.Scanner;

public class Day97 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Masukkan angka n: ");
        int n = ip.nextInt();

        System.out.println("Bilangan prima dari 1 hingga " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (cek(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean cek(int a) {
        if (a <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}
