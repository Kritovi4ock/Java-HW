public enum Day {
    // Инициализация элементов с параметрами
    MONDAY("Понедельник", 1, false),
    TUESDAY("Вторник", 2, false),
    WEDNESDAY("Среда", 3, false),
    THURSDAY("Четверг", 4, false),
    FRIDAY("Пятница", 5, false),
    SATURDAY("Суббота", 6, true),
    SUNDAY("Воскресенье", 7, true);
    
    // Поля перечисления
    private final String russianName;
    private final int dayNumber;
    private final boolean isWeekend;
    
    // Конструктор
    Day(String russianName, int dayNumber, boolean isWeekend) {
        this.russianName = russianName;
        this.dayNumber = dayNumber;
        this.isWeekend = isWeekend;
    }
    
    // Геттеры
    public String getRussianName() {
        return russianName;
    }
    
    public int getDayNumber() {
        return dayNumber;
    }
    
    public boolean isWeekend() {
        return isWeekend;
    }
    
    // Метод для получения следующего дня
    public Day nextDay() {
        Day[] days = values();
        return days[(this.ordinal() + 1) % days.length];
    }
    
    // Метод для получения предыдущего дня
    public Day previousDay() {
        Day[] days = values();
        return days[(this.ordinal() - 1 + days.length) % days.length];
    }
}