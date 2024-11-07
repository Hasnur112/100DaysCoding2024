import java.util.Scanner;

public class Day67 {

    public static void ak(int jumlah) {
        for (int i = 1; i <= jumlah; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Masukkan batas angka: ");
        int jumlah = ip.nextInt();
        ak(jumlah);
        ip.close();
    }
}
