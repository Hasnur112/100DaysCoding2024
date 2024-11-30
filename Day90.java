import java.util.Scanner;

public class latihan {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Masukkan kata: ");
        String a = ip.nextLine();
        String kata[] = a.split(" ");
        StringBuilder hasil = new StringBuilder();
        for (String k : kata) {
            if (k.length() > 0) {
                hasil.append(Character.toUpperCase(k.charAt(0)));
                hasil.append(k.substring(1).toLowerCase());
                hasil.append(" ");
            }
        }
        System.out.print("Hasil: ");
        System.out.println(hasil.toString().trim());
    }
}
