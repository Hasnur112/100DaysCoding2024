import java.util.Scanner;

class Day68 {
    public static double operasi(double a, double b, String op) {
        switch (op) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "%":
                return a % b;
            case "/":
                if (a != 0 && b != 0) {
                    return a / b;
                } else {
                    System.out.println("Error, Pembagian dengan nol tidak diperbolehkan");
                    return 0;
                }
            default:
                System.out.println("Operator tidak valid");
                return 0;
        }
    }

    public static void loop(int h) {
        Scanner ip = new Scanner(System.in);
        for (int i = 0; i < h; i++) {
            System.out.print("Angka pertama:\t");
            double a = ip.nextDouble();
            System.out.print("Angka kedua:\t");
            double b = ip.nextDouble();
            System.out.print("Operator yang diinginkan (+, -, *, %, /):\t");
            String op = ip.next();

            double hasil = operasi(a, b, op);
            System.out.println("Hasil: " + hasil);
        }
    }

    public static void main(String args[]) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Ingin berapa kali Anda melakukan operasi (bilangan bulat): ");
        int h = ip.nextInt();

        loop(h);
    }
}
