public class ExceptionHandlingDemo {
    
    // Метод, который генерирует исключение
    public static void processNumber(int number) {
        if (number < 0) {
            // Это исключение будет перехвачено в main()
            throw new IllegalArgumentException("Number cannot be negative: " + number);
        }
        
        if (number == 0) {
            // Это исключение приведёт к аварийной остановке
            throw new RuntimeException("Zero is not allowed!");
        }
        
        System.out.println("Processing number: " + number);
    }
    
    // Вспомогательный метод с вложенным вызовом
    public static void executeOperation(int value) {
        System.out.println("Executing operation with value: " + value);
        processNumber(value); // Исключение передаётся дальше
        System.out.println("Operation completed successfully");
    }
    
    public static void main(String[] args) {
        try {
            executeOperation(-5); // Генерирует IllegalArgumentException
        } catch (IllegalArgumentException e) {
            // Исключение перехвачено и обработано
            System.out.println("Caught exception in main: " + e.getMessage());
        }
        try {
            executeOperation(0); // Генерирует RuntimeException
        } catch (IllegalArgumentException e) {
            // Этот блок не перехватит RuntimeException!
            System.out.println("This won't be printed");
        }
        
        // Следующий код не выполнится из-за неперехваченного исключения
        System.out.println("This line will never be reached");
    }
}