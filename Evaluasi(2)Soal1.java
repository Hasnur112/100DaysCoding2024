import java.util.Scanner;
public class soal1 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        final double PI = 3.14159;

        System.out.print("Input Jari-jari\t: ");
        double jariJari = ip.nextDouble();

        System.out.print("Input satuan\t: ");
        String satuan = ip.next();

        double keliling = 2 * PI * jariJari;
        double luas = PI * jariJari * jariJari;

        System.out.println("====================HASIL========================");
        System.out.printf("Jari-jari\t\t: %.0f %s\n",jariJari,satuan);
        System.out.println("Keliling\t\t: " + keliling + " " + satuan);
        System.out.println("Luas\t\t\t: " + luas + " " + satuan + "^2");
    }
}
