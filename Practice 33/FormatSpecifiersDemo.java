import java.util.Formatter;

public class FormatSpecifiersDemo {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();
        
        // 1. %s - строковое представление
        formatter.format("String: %s%n", "Hello Java");
        
        // 2. %d - десятичное целое
        formatter.format("Integer: %d%n", 42);
        
        // 3. %f - число с плавающей точкой
        formatter.format("Float: %.2f%n", 3.14159265);
        
        // 4. %b - логическое значение
        formatter.format("Boolean: %b%n", true);
        
        // 5. %c - символьное представление
        formatter.format("Character: %c%n", 'A');
        
        System.out.print(formatter);
        formatter.close();
    }
}