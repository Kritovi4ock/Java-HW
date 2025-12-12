/**
 * Пользовательское проверяемое исключение для ошибок валидации данных
 * Наследуемся от Exception - значит это проверяемое исключение
 */
public class CustomException extends Exception {
    
    // Конструктор по умолчанию
    public CustomException() {
        super("Validation failed");
    }
    
    // Конструктор с сообщением об ошибке
    public CustomException(String message) {
        super(message);
    }
    
    // Конструктор с сообщением и причиной (цепочка исключений)
    public CustomException(String message, Throwable cause) {
        super(message, cause);
    }
    
    // Конструктор только с причиной
    public CustomException(Throwable cause) {
        super(cause);
    }
}