import java.util.Scanner;
class Day53 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("masukkan angka: ");
        int a = ip.nextInt();
        System.out.print("Masukkan batas perulangan 1-1000: ");
        int b = ip.nextInt();
        
        if (b < 1 || b > 1000){
            System.out.println("batas terlampaui");
        }else{
          for(int i = 0; i < b; i++){
            System.out.println(a);
          }   
        }
        
    }
}
