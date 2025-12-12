import java.io.*;

public class MultipleExceptionsDemo {
    
    // Создадим иерархию исключений для примера
    static class Ex1 extends Exception {
        public Ex1(String message) { super(message); }
    }
    
    static class Ex2 extends Ex1 {
        public Ex2(String message) { super(message); }
    }
    
    static class Ex3 extends Ex2 {
        public Ex3(String message) { super(message); }
    }
    
    public static void main(String[] args) {
        
        // Идентичная обработка с помощью multi-catch
        try {
            generateRandomException();
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            // Одинаковая обработка для двух несвязанных исключений
            System.out.println("Caught exception: " + e.getClass().getSimpleName());
            System.out.println("Handling both exceptions the same way");
            System.out.println("Message: " + e.getMessage());
            System.out.println("Taking recovery action...\n");
        }
        
        // Обработка иерархии исключений (Ex1 <|-- Ex2 <|-- Ex3)
        try {
            // Генерируем самое конкретное исключение
            throw new Ex3("Ex3 occurred");
        } catch (Ex3 e) {
            // Самый конкретный тип должен быть первым!
            System.out.println("Caught Ex3: " + e.getMessage());
        } catch (Ex2 e) {
            System.out.println("Caught Ex2: " + e.getMessage());
        } catch (Ex1 e) {
            System.out.println("Caught Ex1: " + e.getMessage());
        }
        
        try {
            throw new Ex3("Ex3 occurred");
        } catch (Ex1 e) {
            // Ex1 перехватит все исключения, включая Ex2 и Ex3!
            System.out.println("Caught Ex1 (catches everything): " + e.getMessage());
        }
        // Следующие catch блоки недостижимы:
        // catch (Ex2 e) { ... } // COMPILE ERROR: unreachable code
        // catch (Ex3 e) { ... } // COMPILE ERROR: unreachable code
        
        // Нельзя использовать связанные исключения в multi-catch
        try {
            throw new Ex2("Ex2 occurred");
        } catch (Ex1 e) {
            // Правильно - отдельный catch для родительского типа
            System.out.println("Caught Ex1: " + e.getMessage());
        }
        
        // Правильный multi-catch с несвязанными исключениями
        try {
            generateUnrelatedExceptions();
        } catch (IOException | IllegalArgumentException e) {
            // IOException и IllegalArgumentException не связаны иерархически
            System.out.println("Caught unrelated exception: " + e.getClass().getSimpleName());
            System.out.println("Common handling for unrelated exceptions");
        }
    }
    
    // Метод для генерации случайного исключения
    public static void generateRandomException() {
        double random = Math.random();
        if (random < 0.5) {
            throw new ArithmeticException("Division by zero");
        } else {
            int[] arr = new int[3];
            throw new ArrayIndexOutOfBoundsException("Index " + (int)(random * 10));
        }
    }
    
    // Метод для генерации несвязанных исключений
    public static void generateUnrelatedExceptions() throws IOException {
        double random = Math.random();
        if (random < 0.5) {
            throw new IOException("I/O problem");
        } else {
            throw new IllegalArgumentException("Invalid argument");
        }
    }
}