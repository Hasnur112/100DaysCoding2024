import  java.util.Scanner;
public class day77 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Masukkan film favorit : ");
        String  f = ip.nextLine();
        
        if(f.equalsIgnoreCase("Iron Man")){
            System.out.println("kita memiliki selara yang sama");
        }else if(f.equals(f)){
            System.out.println(f+" memang bagus tapi saya lebih suka Iron Man");
        }else{
            System.out.println("String tdk valid");
        }
        ip.close();
    }
}
