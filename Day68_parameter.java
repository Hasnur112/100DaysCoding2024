import java.util.Scanner;

class Day68 {
    public static void operasi(int a, int b, char op) {
        double hs;

        if (op == '+') {
            hs = a + b;
            System.out.println("Hasil Penjumlahan: " + hs);
        } else if (op == '-') {
            hs = a - b;
            System.out.println("Hasil Pengurangan: " + hs);
        } else if (op == '*') {
            hs = a * b;
            System.out.println("Hasil Perkalian: " + hs);
        } else if (op == '/') {
            if (b != 0) {
                hs = (double) a / b;
                System.out.println("Hasil Pembagian: " + hs);
            } else {
                System.out.println("Error Pembagian dengan nol tidak diperbolehkan.");
            }
        } else {
            System.out.println("Operasi tidak dikenali. Silakan pilih: +, -, *, atau /.");
        }
    }

    public static void main(String args[]) {
        Scanner ip = new Scanner(System.in);
      
        System.out.print("Masukkan angka pertama: ");
        int angka1 = ip.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int angka2 = ip.nextInt();
        System.out.print("Pilih operasi (+, -, *, /): ");
        char op = ip.next().charAt(0);

        operasi(angka1, angka2, op);
        ip.close();
    }
}
