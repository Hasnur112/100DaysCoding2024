import java.util.Scanner;
public class Day_4 {
    public static void main(String[] args) {
        Scanner ip = new Scanner (System.in);
        System.out.println ("Masukkan umur anda");
        int umur = ip.nextInt();
        final int UMUR_MAXIMAL = 99;
        int hasil = UMUR_MAXIMAL-umur;
        System.out.println ("Sisa umur yang mungkin ditempuh\n"+hasil);
        System.err.println("itupun kalo umur kita sampai 99 tahun:(");
    }
}
