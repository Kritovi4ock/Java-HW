public class Calculator {
    
    // Пример 1: Перегрузка по количеству параметров
    
    // Сумма двух чисел
    public int add(int a, int b) {
        System.out.println("Сумма двух целых: " + a + " + " + b);
        return a + b;
    }
    
    // Сумма трех чисел
    public int add(int a, int b, int c) {
        System.out.println("Сумма трех целых: " + a + " + " + b + " + " + c);
        return a + b + c;
    }
    
    // Пример 2: Перегрузка по типам параметров
    
    // Сумма двух чисел с плавающей точкой
    public double add(double a, double b) {
        System.out.println("Сумма двух double: " + a + " + " + b);
        return a + b;
    }
    
    // Конкатенация строк
    public String add(String a, String b) {
        System.out.println("Конкатенация строк: \"" + a + "\" + \"" + b + "\"");
        return a + b;
    }
    
    // Пример 3: Перегрузка с разным порядком параметров
    public void printInfo(String name, int age) {
        System.out.println("Имя: " + name + ", Возраст: " + age);
    }
    
    public void printInfo(int id, String name) {
        System.out.println("ID: " + id + ", Имя: " + name);
    }
    
    // НЕВАЛИДНАЯ перегрузка - только тип возвращаемого значения отличается
    /*
    public double add(int a, int b) { // ОШИБКА КОМПИЛЯЦИИ!
        return a + b;
    }
    */
}