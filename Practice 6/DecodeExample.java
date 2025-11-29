public class DecodeExample {
    public static void main(String[] args) {
        // decode понимает разные системы счисления
        Integer hex = Integer.decode("0xFF");     // 16-ричная
        Integer oct = Integer.decode("012");      // 8-ричная  
        Integer dec = Integer.decode("100");      // 10-ричная
        
        System.out.println("0xFF = " + hex);   // 255
        System.out.println("012 = " + oct);    // 10
        System.out.println("100 = " + dec);    // 100
    }
}