public class day78{
    public static void main(String[] args) {
        String a1 = "HALO";
        String a2 = "halo";
        
        System.out.println("Kata pertama: "+a1);
        System.out.println("Kata kedua: "+a2);
        
        if(a1.equalsIgnoreCase(a2)){
            System.out.println("kedua kata tersebut terhitung sama karena menggunakan  ignoreCase");
        }else{
            System.out.println("Kata tidak sama");
        }
    }
}
