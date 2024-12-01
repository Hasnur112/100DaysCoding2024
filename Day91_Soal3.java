import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class day91 {
    public static String hapus(String h){
        Pattern pola = Pattern.compile("\\b(\\w+)(?i)(\\b(?:\\s+\\1\\b)+)", Pattern.CASE_INSENSITIVE);//pola regEX yang akan mencocokkan kata yang berulang tanpa menghiraukan besar kecil dari karakter(insensitif)
        Matcher cek = pola.matcher(h);//mencocokkan pola ke innput h    
        
        StringBuffer hasil = new StringBuffer();
        while(cek.find()){//mencari kata yang berulang 
            cek.appendReplacement(hasil, cek.group(1));//cek.group(1) berarti kita hanya mengambil kalimat yang pertama dan mengabaikan yang lain selama kata itu berulang
        }
        cek.appendTail(hasil);
        return hasil.toString();
    }
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.print("Masukkan jumlah perulangan: ");
        int n = Integer.parseInt(ip.nextLine());
        
        String hasil [] = new String[n];
        
        System.out.println("Masukkan kata...");
        for(int i = 0; i < n; i++){//n adalah jumllah perulangan yang di inginkan pengguna
            String a = ip.nextLine();
            if(a.length() > 1000){//batas 1000 karakter 
                System.out.println("input melebihi batas");
                i--;
                continue;
            }
            hasil[i] =  hapus(a);//a adalah kata yang dimasukkan pengguna
        }
        ip.close();   
        
        System.out.println("Hasill...");
        for(String h : hasil){
            System.out.println(h);
        }
    }
}
