public class Day30 {
    public static void main(String args[]) {
        String a, b, c, d;
        a = "200.300";
        b = "2004";
        c = "A";
        d = "100000000000";

        // konversi string ke berbagai type data primitiv
        double aa = Double.parseDouble(a);
        System.out.println("nilai double: " + aa);

        int i = Integer.parseInt(b);
        System.out.println("nilai int: " + i);

        char cc = c.charAt(0); // menggunkan charAt(0)
        System.out.println("char: " + cc);
        
        long l = Long.parseLong(d);
        System.out.println("nilai long: " + l);
    }
}
