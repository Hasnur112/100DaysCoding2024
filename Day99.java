import java.util.Scanner;

public class day99{
    public static int penjumlahan(int x, int y) {
        int total = 0;
        for (int i = x; i <= y; i++) {
            if (i % 2 == 0) {
                total += i;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        
        System.out.println("Masukkan angka pertama: ");
        double a1 = ip.nextDouble();

        System.out.println("Masukkan operator (+, -, *, /, %): ");
        char operator = ip.next().charAt(0);

        System.out.println("Masukkan angka kedua: ");
        double a2 = ip.nextDouble();

        double hasil;

        switch (operator) {
            case '+':
                hasil = a1 + a2;
                break;
            case '-':
                hasil = a1 - a2;
                break;
            case '*':
                hasil = a1 * a2;
                break;
            case '/':
                hasil = a1 / a2;
                break;
            case '%':
                hasil = a1 % a2;
                break;
            default:
                System.out.println("Input tidak valid");
                return;
        }

        System.out.println("Hasil: " + hasil);
        
        System.out.println("Masukkan angka awal (x): ");
        int x = ip.nextInt();

        System.out.println("Masukkan angka akhir (y): ");
        int y = ip.nextInt();

        int totalGenap = penjumlahan(x, y);
        System.out.println("Total penjumlahan bilangan genap dari " + x + " ke " + y + " adalah: " + totalGenap);
    }
}
