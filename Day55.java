import java.util.Scanner;
class Day55 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("(1-50) angka akan dikonversi ke type data double");
        System.out.println("(51-100) angka akan di konersi ke string");
        System.out.println("(101- tak hingga) tidak disarankan");
        System.out.print("Masuukkan pilihan: ");
        int a = ip.nextInt();
        
        if(a >= 1 && a <= 50){
            double b = (double) a;
            System.out.println(b);
        }else if(a >= 51 && a <= 100){
            String c = String.valueOf(a);
            System.out.println(c);
        }else if(a == 0 || a < 0){
            System.out.println("Input tidak memenuhi syarat");
        }else{
            String d = "Error";
            for(int i =0; i<a; i++){
                System.out.println(d);
            }
        }
        ip.close();
    }
}
