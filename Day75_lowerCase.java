import  java.util.Scanner;
public class day75 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Masukkan kata Dalam huruf KAPITAL: ");
        String  k = ip.nextLine();
        String ubah = "";
        for(int i = 0;  i < k.length(); i++){
            char ch = k.charAt(i);
                ubah += Character.toLowerCase(ch);
            System.out.println("Karakter ke-"+i+" di ubah ke LowerCase- "+ubah);
        }
        System.out.println("Setelah  full perubahan: "+ubah);
    }
}
