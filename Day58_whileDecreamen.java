import java.util.Scanner;

public class Day58 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int a = ip.nextInt();
        System.out.print("Masukkan batas bawah: ");
        int b = ip.nextInt();
        if (a >= b) {
            while (a >= b) {
                System.out.println(a);
                a-=2;
            }
        } else {
            System.out.println("Nilai pertama harus lebih lebih besar atau sama dengan batas bawah");
        }

        ip.close(); 
    }
}
