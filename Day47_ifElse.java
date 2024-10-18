import java.util.Scanner;
class Day47 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Percabangan if else");
        System.out.print("Masukkan ipk anda\t:");
        double a = ip.nextDouble();
        
        if (a > 3 && a <= 4){
            System.out.println("Anda berhak mengambil 20+ SKS");
        }else if(a > 4){
            System.out.println("Nilai yang anda masukkan melebihi batas minimal, silahkan coba lagi");
        }else{
            System.out.println("Maaf SKS yang bisa anda ambil hanya 20 saja");
        }
        ip.close();
    }
}
