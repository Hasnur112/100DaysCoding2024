
import java.util.Scanner;
public class Day3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kode Matkul            Mata Kuliah");
        System.out.println("-------------------------------------+");
        System.out.printf("|%-14s|%21s|\n", "AOK", "AOK");
        System.out.printf("|%-14s|%21s|\n", "PW", "Pemrograman Web");
        System.out.printf("|%-14s|%21s|\n", "AL", "Aljabar Linear");
        System.out.printf("|%-14s|%21s|\n", "Algoritma", "Algoritma");
        System.out.printf("|%-14s|%21s|\n", "MC", "Microcontroller");
        System.out.printf("|%-14s|%21s|\n", "WIRA", "Kewirausahaan");
        System.out.printf("|%-14s|%21s|\n", "IMK", "IMK");
        System.out.printf("|%-14s|%21s|\n", "BD", "Basis Data");
        System.out.println("-------------------------------------+");

        System.out.print("Masukkan kode Matkul:\n ");
        String kode = scanner.nextLine();

        int sks = 0;
        double jam = 0;
        String nM = "";

        switch (kode) {
            case "AL":
                nM = "Aljabar Linear";
                sks = 3;
                jam = 10.50;
                break;
            case "BD":
                nM = "Basis Data";
                sks = 3;
                jam = 9.00;
                break;
            case "IMK":
                nM = "Interaksi Manusia Komputer";
                sks = 3;
                jam = 7.30;
                break;
            case "PW":
                nM = "Pemrograman Web";
                sks = 3;
                jam = 14.40;
                break;
            case "Algoritma":
                nM = "Algoritma";
                sks = 3;
                jam = 10.50;
                break;
            case "WIRA":
                nM = "Kewirausahaan";
                sks = 2;
                jam = 10.00;
                break;
            case "AOK":
                nM = "Arsitektur Organisasi Komputer";
                sks = 2;
                jam = 10.50;
                break;
            case "MC":
                nM = "Microcontroller";
                sks = 2;
                jam = 9.10;
                break;
            default:
                System.out.println("Invalid course code.");
                return;
        }
        System.out.println("+------------------------------+");
        System.out.println("| Informasi Matakuliah yang Dipilih");
        System.out.printf("| Kode Matkul\t: %27s|\n", kode);
        System.out.printf("| Mata Kuliah\t: %27s|\n", nM);
        System.out.printf("| SKS\t\t: %27d|\n", sks);
        System.out.printf("| Jam\t\t: %27.2f|\n", jam);
        System.out.println("+------------------------------+");
    }
}
