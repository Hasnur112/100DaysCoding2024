import java.util.Scanner;
public class day73 {
    public static void main(String[] args) {
        Scanner ip= new Scanner(System.in);
        System.out.println("Masukkan kata: ");
        String k= ip.nextLine();
        
        for(int j= 0; j < k.length(); j++){
            System.out.println("Karakter pada indeks " + j+ " adalah: " + k.charAt(j));
        }
        System.out.println("Apakah kamu ingin membaliknya? y/n");
        String jawab = ip.next();
        if(jawab.equals("y")){
            for (int i = k.length()-1; i>=0; i--  ) {
            System.out.println("Karakter pada indeks " + i + " adalah: " + k.charAt(i));
            }
        }else {
            System.out.println("Program selesai");
        }
        ip.close();
    }
}
