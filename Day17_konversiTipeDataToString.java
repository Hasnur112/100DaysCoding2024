public class Day17 {
    public static void main(String args[]) {
        System.out.println("Konversi Tipe Data Primitif ke String");
        System.out.println("-----------------------------------");

        // Integer
        int n1 = 23;
        String nString = String.valueOf(n1);//valueof untuk mengkonversi tip data primitif ke string
        System.out.println("Nilai int: " + n1 + " | String: " + nString);

        // Double
        double n2 = 99.99;
        String dString = String.valueOf(n2);
        System.out.println("Nilai double: " + n2 + " | String: " + dString);

        // Float
        float f = 89.7f;
        String fString = String.valueOf(f);
        System.out.println("Nilai float: " + f + " | String: " + fString);

        // Boolean
        boolean b = true;
        String bString = Boolean.toString(b);//tostring untuk mengkonversi juga namun lebih flexibel
        System.out.println("Nilai boolean: " + b + " | String: " + bString);

        // Char
        char c = 'L';
        String cString = String.valueOf(c);
        System.out.println("Char: " + c + " | String: " + cString);

        // Long
        long l = 10000000000L;
        String lString = String.valueOf(l);
        System.out.println("Nilai long: " + l + " | String: " + lString);

        // Long dengan toString
        long l2 = 10000000000L;
        String lString2 = Long.toString(l2);
        System.out.println("Nilai long: " + l2 + " | String: " + lString2);
    }
}
