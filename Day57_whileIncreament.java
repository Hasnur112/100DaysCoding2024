import java.util.Scanner;
public class Day56 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int a = ip.nextInt();
        System.out.print("Masukkan batas atas: ");
        int b = ip.nextInt();
        if (a <= b) {
            while (a <= b) {
                System.out.println(a);
                a++;
            }
        } else {
            System.out.println("Nilai pertama harus lebih kecil atau sama dengan batas atas");
        }

        ip.close(); 
    }
}
