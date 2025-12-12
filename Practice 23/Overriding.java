class BaseClass {
    void show() {
        System.out.println("Метод базового класса");
    }
    
    String getValue() {
        return "Базовое значение";
    }
    
    BaseClass createObject() {
        return new BaseClass();
    }
}

class DerivedClass extends BaseClass {
    // Переопределенный метод
    @Override
    void show() {
        System.out.println("Метод производного класса");
    }
    
    // Попытка изменить тип возврата вызовет ОШИБКУ:
    @Override
    int getValue() {  // ОШИБКА: должен возвращать String, а не int
        return 100;
    }
    
    // Ковариантный возврат - можно вернуть подкласс
    @Override
    DerivedClass createObject() {  // OK: DerivedClass наследуется от BaseClass
        return new DerivedClass();
    }
}

public class Overriding {
    public static void main(String[] args) {
        BaseClass base = new BaseClass();
        DerivedClass derived = new DerivedClass();
        
        base.show();        // Метод базового класса
        derived.show();     // Метод производного класса
        
        // Полиморфизм
        BaseClass poly = new DerivedClass();
        poly.show();        // Метод производного класса
        
        System.out.println("\nОтвет на вопрос:");
        System.out.println("Если тип возврата не совпадает - ошибка компиляции");
        System.out.println("Исключение: можно вернуть подкласс (ковариантный возврат)");
    }
}