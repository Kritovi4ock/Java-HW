interface InterfaceA {
    default void show() {
        System.out.println("default метод из InterfaceA");
    }
}

interface InterfaceB {
    default void show() {
        System.out.println("default метод из InterfaceB");
    }
}

// Ситуация: класс реализует два интерфейса с одинаковыми default методами
class ConflictClass implements InterfaceA, InterfaceB {
    // Ошибка компиляции: нужно разрешить конфликт методов
}

// Решение 1: Переопределить конфликтующий метод
class Solution1 implements InterfaceA, InterfaceB {
    @Override
    public void show() {
        System.out.println("Собственная реализация в классе");

        InterfaceA.super.show();  // Вызов метода из InterfaceA
        InterfaceB.super.show();  // Вызов метода из InterfaceB
    }
}

// Решение 2: Выбрать одну из реализаций
class Solution2 implements InterfaceA, InterfaceB {
    @Override
    public void show() {
        // Выбираем реализацию из InterfaceA
        InterfaceA.super.show();
    }
}

// Решение 3: Если один интерфейс наследует другой
interface InterfaceC extends InterfaceA {
}

interface InterfaceD {
    default void show() {
        System.out.println("default метод из InterfaceD");
    }
}

class Solution3 implements InterfaceC, InterfaceD {
    // InterfaceC наследует InterfaceA, поэтому приоритет у InterfaceA
}

public class MultipleDefaultMethods {
    public static void main(String[] args) {
        Solution1 sol1 = new Solution1();
        sol1.show();  // Собственная реализация в классе
        
        Solution2 sol2 = new Solution2();
        sol2.show();  // default метод из InterfaceA
        
        // Что происходит при конфликте default методов:
        // 1. Компилятор требует явного разрешения конфликта
        // 2. Класс должен переопределить конфликтующий метод
        // 3. В переопределенном методе можно:
        //    - Создать свою реализацию
        //    - Вызвать метод конкретного интерфейса через InterfaceName.super.method()
        //    - Вызвать методы обоих интерфейсов
    }
}