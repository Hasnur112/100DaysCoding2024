public class Dcoder {
    public static void main(String args[]) {
        System.out.println("Type Casting");
        // deklarasi variable
        int a = 20;
        long b = 2000000000L;
        double c = 10.23;
        float d = 12.45f; 

        // casting 
        double aDouble = a; // casting otomatis
        System.out.println("int ke double: " + aDouble);

        float bFloat = (float) b; // casting manual
        System.out.println("long ke float: " + bFloat);

        long cLong = (long) c; // casting manual (double ke long)
        System.out.println("double ke long: " + cLong);

        int dInt = (int) d; // casting manual
        System.out.println("float ke int: " + dInt);
    }
}
