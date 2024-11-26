import java.util.Scanner;
import java.util.Arrays;

public class day86 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Pilih tipe array yang ingin digunakan(1/2):");
        System.out.println("1. String");
        System.out.println("2. int");
        System.out.print("Pilih:");
        int pilihan = ip.nextInt();
        ip.nextLine();

        if (pilihan == 1) {
            System.out.println("Masukkan panjang array: ");
            int p = ip.nextInt();
            ip.nextLine(); 
            String[] a = new String[p];
            
            for (int i = 0; i < p; i++) {
                System.out.println("Masukkan elemen ke- " + i + " : ");
                a[i] = ip.nextLine();
            }
            System.out.println("Isi:");
            for (int i = 0; i < p; i++) {
                System.out.println("elemen ke- " + i + ": " + a[i]);
            }
            System.out.println("Hasil final:");
            System.out.println(Arrays.toString(a));

        } else if (pilihan == 2) {
            System.out.println("Masukkan panjang array: ");
            int p = ip.nextInt();
            int[] a = new int[p];
            
            for (int i = 0; i < p; i++) {
                System.out.println("Masukkan elemen ke- " + i + " : ");
                a[i] = ip.nextInt();
            }
            System.out.println("Isi:");
            for (int i = 0; i < p; i++) {
                System.out.println("elemen ke- " + i + ": " + a[i]);
            }
            System.out.println("Hasil final:");
            System.out.println(Arrays.toString(a));
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        ip.close();
    }
}
