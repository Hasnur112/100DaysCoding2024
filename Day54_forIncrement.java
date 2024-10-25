import java.util.Scanner;
class Day54 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Masukkan batas angka (1 - 1000) : ");
        int a = ip.nextInt();
        if(a < 1 || a > 1000){
            System.out.println ("Batas terlampaui");
        }else{
            System.out.printf("hitungan akan dimulai dengan 0 dan akan dilakukan penghitungan hingga %d",a);
            for(int i = 0; i <= a; i++){
                System.out.println(i);
                
            }
        }
    }
}
