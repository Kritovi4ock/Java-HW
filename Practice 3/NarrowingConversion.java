public class NarrowingConversion {
    public static void main(String[] args) {
        int bigNumber = 1000;
        // Явное приведение типов
        byte smallByte = (byte) bigNumber;    // Может быть потеря данных!
        short smallShort = (short) bigNumber;
        
        double pi = 3.14159;
        int intPi = (int) pi;                 // Дробная часть теряется
        
        System.out.println("int 1000 -> byte: " + smallByte);     // -24 (переполнение)
        System.out.println("int 1000 -> short: " + smallShort);   // 1000
        System.out.println("double 3.14159 -> int: " + intPi);    // 3
    }
}