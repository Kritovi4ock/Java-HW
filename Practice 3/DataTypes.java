public class DataTypes {
    // Переменные-члены класса (инициализируются нулевыми значениями)
    byte byteValue = 0;       
    short shortValue = 0;    
    int intValue = 0;           
    long longValue = 0L;        
    float floatValue = 0.0f;      
    double doubleValue = 0.0;   
    char charValue = '\u0000';       
    boolean booleanValue = false;
    
    public static void main(String[] args) {
        // Примеры с инициализацией
        byte b = 100;                    // от -128 до 127
        short s = 1000;                  // от -32768 до 32767
        int i = 100000;                  // от -2^31 до 2^31-1
        long l = 10000000000L;           // L в конце
        float f = 3.14f;                 // f в конце
        double d = 3.14159265359;        // по умолчанию
        char c = 'A';                    // один символ
        boolean bool = true;             // true или false
        
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);
    }
}