import  java.util.Scanner;
public class day71 {
    public static int hitung(int a, int p) {
        if (p == 0) {
            return 1;
        } else {
            return a* hitung(a, p - 1);
        }
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int a = ip.nextInt();
        System.out.print("Masukkan pangkat: ");
        int p = ip.nextInt();
        
        int hasil  = hitung(a,p);
        System.out.println("Hasil:  "+hasil);
    }
}
