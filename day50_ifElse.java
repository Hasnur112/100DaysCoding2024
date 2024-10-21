import java.util.Scanner;
class day50 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print ("Masukkan sebuah angka bebas\t: ");
        float a = ip.nextFloat();
        
        System.out.println("Pilih metode percabangan ntuk bilangan yang dimasukkan tadi..");
        System.out.println("(1) Mengkonversi bilangan ini ke  String");
        System.out.println("(2) Membandingkan besar kecil dengan bilangan lain");
        System.out.println("(3) Menjumlahkan nya dengan bilangan lain menggunakan semua operator aritmatika");
        
        System.out.print("Masukkan pilihan anda(1/2/3) harap hanya memasukkan 1 nomor saja\t: ");
        String b = ip.next();
        
        if(b.equals("1")){
            String as = String.valueOf(a); 
            System.out.println("ini dia bilangan  anda dalam bentuk string\t: "+as);
        }
        else if(b.equals("2")){
            System.out.print("Masukkan sebuah bilangan yang ingin anda bandingkan dengan bilangan tadi: ");
            float c = ip.nextFloat();
            if(a > c){
                System.out.printf("(%.2f) lebih besar dari (%.2f) bilangan kedua\n",a,c);
            }else if(a == c){
                 System.out.printf("(%.2f) sama dengan (%.2f) bilangan kedua\n",a,c);
            }else{
                 System.out.printf("(%.2f) lebih kecil dari (%.2f) bilangan kedua\n",a,c);
            }
        }else if(b.equals("3")){
            System.out.print("Masukkan bilangan  ke-dua\t: ");
            float d = ip.nextFloat();
            System.out.println(a +" + "+d+" = "+(a+d));
            System.out.println(a +" - "+d+" = "+(a-d));
            System.out.println(a +" x "+d+" = "+(a*d));
            System.out.println(a +" / "+d+" = "+(a/d));
            System.out.println(a +" % "+d+" = "+(a%d));
            System.out.println("Sebaliknya");
            System.out.println(d +" - "+a+" = "+(d-a));
            System.out.println(d +" / "+a+" = "+(d/a));
            System.out.println(d +" % "+a+" = "+(d%a));
        }else{
            System.out.println("///inputan tidak terdaftar///");
        }
        ip.close(); 
    }
}
