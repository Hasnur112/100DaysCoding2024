import java.util.Scanner;

public class Day65 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in); 

        System.out.print("Masukkan batas angka untuk tabel perkalian(1-50): ");
        int batas = ip.nextInt();
        
        if(batas >=1 && batas <= 50){
          for (int i = 1; i <= batas; i++) {
            for (int j = 1; j <= batas; j++) {
                System.out.print(i * j + "\t"); 
            }
            System.out.println(); 
          }
        }else if(batas == 0 && batas <0){
          System.out.println("negatif atau nol tidak diterima");
        }else{
          System.out.println("input melebihi batas");
        }
        ip.close(); 
    }
}
