public class ExceptionExamples {
    public static void main(String[] args) {
        
        // ArithmeticException - арифметическая ошибка
        try {
            int result = 10 / 0; // Деление на ноль
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }
        
        // ArrayIndexOutOfBoundsException - выход за границы массива
        try {
            int[] array = {1, 2, 3};
            System.out.println(array[5]); // Несуществующий индекс
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Index " + 
                e.getMessage() + " is out of bounds");
        }
        
        // IllegalArgumentException - недопустимый аргумент
        try {
            setAge(-5); // Отрицательный возраст
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
            // Исправляем значение:
            setAge(0);
            System.out.println("Age set to default value: 0");
        }
        
        // ClassCastException - некорректное приведение типов
        try {
            Object obj = "Hello";
            Integer num = (Integer) obj; // Строка не может быть приведена к Integer
            System.out.println("Number: " + num);
        } catch (ClassCastException e) {
            System.out.println("ClassCastException: " + e.getMessage());
            // Безопасное приведение с проверкой:
            Object obj = "123";
            if (obj instanceof Integer) {
                Integer num = (Integer) obj;
            } else {
                System.out.println("Object is not an Integer");
            }
        }
        
        // NullPointerException - обращение к null ссылке
        try {
            String text = null;
            int length = text.length(); // Вызов метода у null
            System.out.println("Length: " + length);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
            System.out.println("Stack trace:");
            e.printStackTrace(System.out);
            // Предотвращение NPE:
            String safeText = getTextOrDefault(null, "Default");
            System.out.println("Safe value: " + safeText);
        }
    }
    
    // Метод для IllegalArgumentException
    public static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative: " + age);
        }
        System.out.println("Age set to: " + age);
    }
    
    // Метод для предотвращения NPE
    public static String getTextOrDefault(String text, String defaultValue) {
        return (text != null) ? text : defaultValue;
    }
}