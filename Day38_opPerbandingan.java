public class Dcoder {
    public static void main(String args[]) {
        System.out.println("Operator Perbandingan");
        int a, b;
        a = 100;
        b = 50;
        System.out.println("Nilai 1 = " + a);
        System.out.println("Nilai 2 = " + b);

        // Operator Perbandingan
        System.out.println("a lebih besar dari (>) b: " + (a > b)); // true
        System.out.println("a lebih kecil dari (<) b: " + (a < b)); // false
        System.out.println("a sama dengan (==) b: " + (a == b)); // false
        System.out.println("a tidak sama dengan (!=) b: " + (a != b)); // true
        System.out.println("a lebih besar dari atau sama dengan (>=) b: " + (a >= b)); // true
        System.out.println("a lebih kecil dari atau sama dengan (<=) b: " + (a <= b)); // false
    }
}
