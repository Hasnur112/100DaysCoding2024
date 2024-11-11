import java.util.Scanner;

public class day70 {
    public static String cek(int b) {
        if (b % 2 == 0) {
            return "genap";
        } else {
            return "ganjil";
        }
    }

    public static void loop(int b) {
        if (b % 2 == 0) {
            for (int i = 2; i <= b; i += 2) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = 1; i <= b; i += 2) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.print("Masukkan sebuah bilangan bulat: ");
        int b = ip.nextInt();
        String hasil = cek(b);
        System.out.println("Bilangan " + b + " adalah " + hasil + ".");

        System.out.print("Apakah ingin melanjutkan ke bagian perhitungan? (y/n): ");
        String j= ip.next();

        if (j.equalsIgnoreCase("y")) {
            loop(b);
        } else {
            System.out.println("Program selesai.");
        }

        ip.close();
    }
}
