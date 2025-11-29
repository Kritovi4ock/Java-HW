public class OperatorsDemo {
    public static void main(String[] args) {
        // Базовые типы
        int a = 10, b = 3;
        double x = 5.5, y = 2.0;
        boolean bool1 = true, bool2 = false;
        
        // 1. Арифметические операторы
        System.out.println("Арифметические:");
        System.out.println("a + b = " + (a + b));      // 13
        System.out.println("a - b = " + (a - b));      // 7
        System.out.println("a * b = " + (a * b));      // 30
        System.out.println("a / b = " + (a / b));      // 3 (целочисленное деление)
        System.out.println("x / y = " + (x / y));      // 2.75
        System.out.println("a % b = " + (a % b));      // 1 (остаток)
        
        // 2. Операторы присваивания
        System.out.println("\nОператоры присваивания:");
        int c = 15;
        System.out.println("c = " + c);
        c += 5;  // c = c + 5
        System.out.println("c += 5 → " + c);
        c -= 3;  // c = c - 3
        System.out.println("c -= 3 → " + c);
        c *= 2;  // c = c * 2
        System.out.println("c *= 2 → " + c);
        c /= 4;  // c = c / 4
        System.out.println("c /= 4 → " + c);
        c %= 3;  // c = c % 3
        System.out.println("c %= 3 → " + c);
        
        // 3. Операторы инкремента/декремента
        System.out.println("\nИнкремент/декремент:");
        int count = 5;
        System.out.println("Исходное значение: " + count);
        System.out.println("++count (префиксный): " + (++count)); // Сначала увеличивает, потом использует
        System.out.println("count++ (постфиксный): " + (count++)); // Сначала использует, потом увеличивает
        System.out.println("После count++: " + count);
        System.out.println("--count (префиксный): " + (--count));
        System.out.println("count-- (постфиксный): " + (count--));
        System.out.println("После count--: " + count);
        
        // 4. Операторы сравнения
        System.out.println("\nОператоры сравнения:");
        System.out.println("a > b: " + (a > b));      // true
        System.out.println("a < b: " + (a < b));      // false
        System.out.println("a >= b: " + (a >= b));    // true
        System.out.println("a <= b: " + (a <= b));    // false
        System.out.println("a == b: " + (a == b));    // false
        System.out.println("a != b: " + (a != b));    // true
        
        // 5. Логические операторы
        System.out.println("\nЛогические операторы:");
        System.out.println("bool1 && bool2: " + (bool1 && bool2)); // AND
        System.out.println("bool1 || bool2: " + (bool1 || bool2)); // OR
        System.out.println("!bool1: " + (!bool1));                // NOT
        
        // 6. Побитовые операторы
        System.out.println("\nПобитовые операторы:");
        int num1 = 5;  // 0101 в двоичной
        int num2 = 3;  // 0011 в двоичной
        System.out.println("num1 & num2 (AND): " + (num1 & num2)); // 0001 = 1
        System.out.println("num1 | num2 (OR): " + (num1 | num2));  // 0111 = 7
        System.out.println("num1 ^ num2 (XOR): " + (num1 ^ num2)); // 0110 = 6
        System.out.println("~num1 (NOT): " + (~num1));             // инверсия битов
        
        // 7. Операторы сдвига
        System.out.println("\nОператоры сдвига:");
        int value = 8; // 1000 в двоичной
        System.out.println("value << 1: " + (value << 1));  // 10000 = 16 (умножение на 2)
        System.out.println("value >> 1: " + (value >> 1));  // 0100 = 4 (деление на 2)
        System.out.println("value >>> 1: " + (value >>> 1)); // 0100 = 4 (беззнаковый сдвиг)
        
        // 8. Тернарный оператор
        System.out.println("\nТернарный оператор:");
        int age = 18;
        String canVote = (age >= 18) ? "Можно голосовать" : "Нельзя голосовать";
        System.out.println("Возраст " + age + ": " + canVote);
        
        System.out.println("\n=== ОПЕРАТОРЫ СО СТРОКАМИ ===");
        
        // Операторы со строками
        String str1 = "Hello";
        String str2 = "World";
        
        // Конкатенация
        String greeting = str1 + " " + str2;
        System.out.println("Конкатенация: " + greeting);
        
        // Составная конкатенация
        String message = "Результат: ";
        message += a + " + " + b + " = " + (a + b);
        System.out.println(message);
        
        // Сравнение строк
        System.out.println("str1 == str2: " + (str1 == str2)); // Сравнение ссылок
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // Сравнение содержимого
        
        String str3 = "Hello";
        System.out.println("str1 == str3: " + (str1 == str3)); // Может быть true (пул строк)
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // true
    }
}