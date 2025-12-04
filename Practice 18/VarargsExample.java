public class VarargsExample {
    
    // 1. Базовый метод с varargs
    public static void printAll(String... strings) {
        System.out.print("printAll(String...): ");
        for (String s : strings) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
    
    // 2. Перегрузка - без параметров
    public static void printAll() {
        System.out.println("printAll(): Ничего не передано");
    }
    
    // 3. Перегрузка - один параметр
    public static void printAll(String single) {
        System.out.println("printAll(String): " + single);
    }
    
    // 4. Перегрузка - два параметра
    public static void printAll(String first, String second) {
        System.out.println("printAll(String, String): " + first + ", " + second);
    }
    
    // 5. Перегрузка с разными типами
    public static void printAll(int... numbers) {
        System.out.print("printAll(int...): ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    // 6. Перегрузка с первым обязательным параметром
    public static void printAll(String prefix, String... strings) {
        System.out.print("printAll(String, String...): " + prefix + " -> ");
        for (String s : strings) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
    
    // 7. Смешанные типы
    public static void printAll(Object... objects) {
        System.out.print("printAll(Object...): ");
        for (Object obj : objects) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        // Вызов разных версий метода
        
        printAll();                              // Версия 2
        printAll("один");                        // Версия 3
        printAll("первый", "второй");            // Версия 4
        printAll("A", "B", "C");                 // Версия 1
        printAll("привет", "мир", "!");          // Версия 1
        printAll(1, 2, 3);                       // Версия 5
        printAll(10);                            // Версия 5 (один int)
        printAll("Префикс", "A", "B");           // Версия 6
        printAll("Только префикс");              // Версия 3 (не версия 6!)
        printAll(1, "два", 3.0, true);           // Версия 7
    }
}