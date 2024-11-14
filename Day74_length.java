import  java.util.Scanner;
public class day74 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Masukkan kata: ");
        String  k = ip.next();
        
        int b = k.length();
        System.out.println("Panjang karakrakter: "+b);
        for(int i = 0; i < k.length(); i++){
            System.out.println("karakter ke- "+i+" : "+k.charAt(i));  
        }
        ip.close();
    }
}
