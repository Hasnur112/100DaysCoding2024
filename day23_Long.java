public class Day23 {
  public static void main(String args[]) {
    Long ambangAtas = 9223372036854775807L;
    Long ambangBawah = -9223372036854775808L;
    System.out.println("Ambang batas long: "+ambangAtas);
    System.out.println("Ambang bawah long: "+ambangBawah);
   
    // Operator aritmatika dan penugasan
    ambangAtas -= 9223372036854775806L;
    ambangBawah += 9223372036854775806L;
    
    //keluaran dengan printf
    System.out.printf("Ambang Atas setelah dikurangi: %d\n", ambangAtas);
    System.out.printf("Ambang Bawah setelah penambahan: %d\n", ambangBawah);
  }
}
