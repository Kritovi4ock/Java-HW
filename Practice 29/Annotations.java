// @Override - указывает, что метод переопределяет метод суперкласса
// Компилятор проверяет, действительно ли метод существует в родительском классе
class Parent {
    void show() {
        System.out.println("Родительский метод");
    }
}

class Child extends Parent {
    @Override  // Если сделать ошибку в имени, компилятор сообщит
    void show() {
        System.out.println("Дочерний метод");
    }
}

// @Deprecated - помечает устаревший код, который не рекомендуется использовать
// Компилятор выдаст предупреждение при использовании
class OldClass {
    @Deprecated
    void oldMethod() {
        System.out.println("Устаревший метод");
    }
    
    @Deprecated(since = "1.5", forRemoval = true)
    void veryOldMethod() {
        System.out.println("Очень устаревший метод (будет удален)");
    }
}

// @SuppressWarnings - подавляет предупреждения компилятора
// Используется, когда мы знаем, что делаем, и хотим убрать "шум"
class Example {
    @SuppressWarnings("deprecation")
    void useDeprecated() {
        OldClass obj = new OldClass();
        obj.oldMethod();  // Без аннотации было бы предупреждение
    }
    
    @SuppressWarnings({"unchecked", "rawtypes"})
    void useRawTypes() {
        java.util.List list = new java.util.ArrayList();  // Без аннотации было бы предупреждение
        list.add("test");
    }
}

public class Annotations {
    public static void main(String[] args) {
        Child child = new Child();
        child.show();
        
        OldClass old = new OldClass();
        // old.oldMethod(); // Вызовет предупреждение компилятора
        
        Example example = new Example();
        example.useDeprecated();
        
        // Основные аннотации:
        // 1. @Override - для безопасности при переопределении методов
        // 2. @Deprecated - для пометки устаревшего кода
        // 3. @SuppressWarnings - для контроля предупреждений компилятора
    }
}