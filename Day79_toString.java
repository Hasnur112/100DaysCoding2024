import java.util.Scanner;

public class day79 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat(integer): ");
        int a = ip.nextInt();

        System.out.print("Masukkan bilangan desimal(double): ");
        double b = ip.nextDouble();

        String k1 = Integer.toString(a);
        String k2 = Double.toString(b);
        System.out.println("integer dalam bentuk string: " + k1);
        System.out.println("doubel dalam bentuk string: " + k2);

        ip.close();
    }
}
