import java.util.Scanner;
public class soal2 {
    public static boolean kondisi (String kata, int awal, int akhir){
        if(awal >= akhir){
            return true;
        }else if(kata.charAt(awal) != kata.charAt(akhir)){
            return false;
        }
        return kondisi(kata,awal +1,akhir -1);  
    }
    public static boolean kondisi2 (String kata){
        return kondisi(kata,0,kata.length() - 1);
    }
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        
        System.out.println("Masukkan sebuah kata: ");
        String a = ip.nextLine();
        System.out.println();
        if(kondisi2(a)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        ip.close();
    }
}
