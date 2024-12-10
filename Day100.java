import java.util.Scanner;
import java.time.LocalTime;

public class day100 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        
        System.out.println("masukkan nama: ");
        String nama = ip.nextLine();
        LocalTime sekarang = LocalTime.now();
        String salam;

        if (sekarang.isBefore(LocalTime.of(12, 0))) {
            salam = "Selamat pagi";
        } else if (sekarang.isBefore(LocalTime.of(17, 0))) {
            salam = "Selamat siang";
        } else {
            salam = "Selamat malam";
        }
        System.out.println("================================================");
        System.out.println(salam + ", " + nama);
        System.out.println("Progam Anda Telak Selesai");
        System.out.println("================================================");
    }

}
