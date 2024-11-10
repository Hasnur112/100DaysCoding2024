import java.util.Scanner;
public class evaluasi3 {
    public static void pola1(int tinggi){
        //membuat spasi agar membentuk seggitiga sesuai dengn tinggi yang dimasukkan pengguna
        for (int i = 0; i < tinggi; i++){
            for(int j = 0; j < tinggi -i; j++){
                System.out.print(" ");
            }
            int ak = 1;  //membuat variabel ak dan mengisi nya  dengan  nilai 1
            for(int k = 0; k <= i; k++){
                System.out.print(ak + " ");
                ak = ak*(i - k)/(k + 1);//rumus untuk membuat segitiga pascal 
            }
            System.out.println();//membuat baris baru untuk setiap loop dalam yang telah di eksekusi
        }
    }
    public static void pola2 (int tinggi){
        //Membuat spasi agar berbentuk segitiga
        for(int  i = 0; i < tinggi; i++){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            //membuat segitiga secara terbalik dengan cara mengurangi k sebanyak 1 selama dia masih lebih besar  dari i
            for(int k = tinggi; k > i; k--){
                System.out.print(k + " ");
            }
            System.out.println(); //membuat baris baru setiap loop dalam selesai tereksekusi
        }
    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Masukkan tinggi (bilangan bulat): ");
        int tinggi = ip.nextInt();//menggunakan varibel yang sesuai dengan  ke dua parameter method yanng  telah dibuat
        
        //memangg parameter dari method1/pola1
        System.out.println("Pola 1");
        pola1(tinggi);
        
        //memanggil parameter dri method2/pola2
        System.out.println("Pola 2");
        pola2(tinggi);
    }
}
