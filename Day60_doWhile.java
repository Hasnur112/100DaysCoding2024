import java.util.Scanner;

public class Day60 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int a;
        int b = 0;

        do {
            System.out.print("Masukkan angka (0 untuk berhenti): ");
            a = ip.nextInt();
            b += a;
        } while (a != 0);
        System.out.println("Total keseluruhan: " + b);
        ip.close();
    }
}
