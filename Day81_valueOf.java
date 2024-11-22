import java.util.Scanner;

public class  day81 {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.println("Masukkan pilihan: ");
        System.out.println("(1). untuk bilangan bulat\n(2). untuk bilangan decimal");
        System.out.print("Masukkan pilihan: ");
        int a = ip.nextInt();
        if(a == 1){
            System.out.print("Masukkan bilangan bulat: ");
            int b = ip.nextInt();
            
            System.out.println("Bilangan dalam String: "+String.valueOf(b));
        }else if(a == 2){
            System.out.print("Masukkan bilangan decimal: ");
            double c = ip.nextDouble();
            
            System.out.println("Bilangan dalam string: "+String.valueOf(c));
        }
        ip.close();
    }
}
