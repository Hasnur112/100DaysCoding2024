import java.util.Scanner;

public class day88 {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.println("jari jari tabung: ");
        double jari = ip.nextDouble();
        
        System.out.println("Tinggi tabung: ");
        double tinggi = ip.nextDouble();
        
        double volume = Math.PI * jari*jari*tinggi;
        double p = Math.round(volume);
        System.out.printf("Hasil: %.2f m kubik",volume);
    }
}
