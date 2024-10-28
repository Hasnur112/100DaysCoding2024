import java.util.Scanner;
public class Day56 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Masukkan angka awal: ");
        int a = ip.nextInt();
        System.out.print("Masukkan batas bawah: ");
        int b = ip.nextInt();
        if (a >= b) {
            for (; a >= b; a--) {
                System.out.println(a);
            }
        } else {
            System.out.println("Nilai pertama harus lebih besar atau sama dengan nilai batas yang dimasukkan");
        }

        ip.close();
    }
}
