public class MixedTypes {
    public static void main(String[] args) {
        int i = 10;
        double d = 3.5;
        long l = 100L;
        float f = 2.5f;
        
        // Результат - double (наибольший тип)
        double result1 = i + d;      // int + double = double
        System.out.println("int + double = " + result1);  // 13.5
        
        // Результат - float (наибольший тип)  
        float result2 = i + f;       // int + float = float
        System.out.println("int + float = " + result2);   // 12.5
        
        // Результат - long (наибольший тип)
        long result3 = i + l;        // int + long = long
        System.out.println("int + long = " + result3);    // 110
    }
}