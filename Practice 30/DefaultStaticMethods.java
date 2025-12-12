interface MyInterface {
    // Обычный абстрактный метод
    void abstractMethod();
    
    // static метод
    static void staticMethod() {
        System.out.println("static метод интерфейса");
    }
}

class MyClass implements MyInterface {
    @Override
    public void abstractMethod() {
        System.out.println("Реализация абстрактного метода");
    }
    
}

public class DefaultStaticMethods {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        
        // Способы вызова методов:
        
        // 1. Абстрактный метод - вызывается через объект
        obj.abstractMethod();  // Реализация абстрактного метода
        
        // 2. static метод - вызывается через имя интерфейса
        MyInterface.staticMethod();  // static метод интерфейса
        
        // 3. Через интерфейсную ссылку
        MyInterface inter = obj;
        inter.abstractMethod();  // Реализация абстрактного метода
        inter.staticMethod(); // ОШИБКА: нельзя вызвать static метод через ссылку
    }
}