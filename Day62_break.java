import java.util.Scanner;

class Day62 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Masukkan kata bebas: ");
        String a = ip.next();
        System.out.println("Ingin seberapa banyak kamu ingin melakukan perulangan (bilangan bulat): ");
        int b = ip.nextInt();
        
        int c = 0;

        for (;;) {
            System.out.println(a);
            c++;
            
            if (c >= b) {
                break;
            }
        }

        ip.close();
    }
}
