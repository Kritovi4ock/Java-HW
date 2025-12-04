public enum HttpStatus {
    // Инициализация элементов
    OK(200, "Успешно"),
    CREATED(201, "Создано"),
    ACCEPTED(202, "Принято"),
    NO_CONTENT(204, "Нет содержимого"),
    BAD_REQUEST(400, "Неверный запрос"),
    UNAUTHORIZED(401, "Не авторизован"),
    FORBIDDEN(403, "Запрещено"),
    NOT_FOUND(404, "Не найдено"),
    METHOD_NOT_ALLOWED(405, "Метод не разрешен"),
    INTERNAL_ERROR(500, "Внутренняя ошибка сервера"),
    NOT_IMPLEMENTED(501, "Не реализовано"),
    BAD_GATEWAY(502, "Плохой шлюз"),
    SERVICE_UNAVAILABLE(503, "Сервис недоступен");
    
    // Поля
    private final int code;
    private final String message;
    
    // Конструктор
    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }
    
    // Геттеры
    public int getCode() {
        return code;
    }
    
    public String getMessage() {
        return message;
    }
    
    // Метод проверки успешного статуса (2xx)
    public boolean isSuccess() {
        return code >= 200 && code < 300;
    }
    
    // Метод проверки перенаправления (3xx)
    public boolean isRedirect() {
        return code >= 300 && code < 400;
    }
    
    // Метод проверки ошибки клиента (4xx)
    public boolean isClientError() {
        return code >= 400 && code < 500;
    }
    
    // Метод проверки ошибки сервера (5xx)
    public boolean isServerError() {
        return code >= 500 && code < 600;
    }
    
    // Статический метод поиска по коду
    public static HttpStatus findByCode(int code) {
        for (HttpStatus status : values()) {
            if (status.code == code) {
                return status;
            }
        }
        throw new IllegalArgumentException("Неизвестный HTTP код: " + code);
    }
    
    // Переопределение toString
    @Override
    public String toString() {
        return code + " " + name() + " (" + message + ")";
    }
}