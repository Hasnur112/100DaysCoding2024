import java.util.Scanner;

class Day61 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Masukkan sebuah nilai atau kata yang akan dilakukan loop tanpa henti...");
        System.out.println("(1) untuk angka\n(2) untuk kata");
        System.out.print("Masukkan pilihan: ");
        int a = ip.nextInt();

        if (a == 1) {
            System.out.print("Masukkan angka: ");
            int b = ip.nextInt();
            do {
                System.out.println(b);
            } while (true);
        } else if (a == 2) {
            System.out.print("Masukkan kata: ");
            String c = ip.next();
            for (;;) {
                System.out.println(c);
            }
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        ip.close();
    }
}
