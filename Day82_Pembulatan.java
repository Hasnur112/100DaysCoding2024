import java.util.Scanner;

public class day82 {
    public static double ceil(double a){
        return Math.ceil(a);
    }
    public static double floor(double a){
        return Math.floor(a);
    }
    public static long round(double a){
        return Math.round(a);
    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String pilih;
        do{
            System.out.print("Masukkan angka (decimal): ");
            double a = ip.nextDouble();
            
            double ceil = ceil(a);
            double floor = floor(a);
            long round = round(a);
            
            System.out.printf("Nilai ceil/pembulatan keatas dari (%.2f) adalah (%s).%n",a,String.valueOf(ceil));
            System.out.printf("Nilai floor/pembulatan kebawah dari (%.2f) adalah (%s).%n",a,String.valueOf(floor));
            System.out.printf("Nilai ceil/pembulatan terdekat dari (%.2f) adalah (%s).%n%n",a,String.valueOf(round));        
            
            System.out.print("Apakah anda ingin melanjutkan ?(ya/tidak) :");
            pilih = ip.next();            
        }while(pilih.equalsIgnoreCase("ya") || pilih.equalsIgnoreCase("iya"));
        System.out.println("Program selesai");
        ip.close();
    }
}
