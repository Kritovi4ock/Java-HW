// Интерфейс с вложенным статическим классом
interface MyInterface {
    void interfaceMethod();
    
    // Вложенный статический класс внутри интерфейса
    static class NestedClass {
        void nestedMethod() {
            System.out.println("Метод вложенного класса в интерфейсе");
        }
        
        static void staticNestedMethod() {
            System.out.println("Статический метод вложенного класса");
        }
    }
}

// Реализация интерфейса
class MyImplementation implements MyInterface {
    @Override
    public void interfaceMethod() {
        System.out.println("Реализация метода интерфейса");
    }
}

public class NestedClass {
    public static void main(String[] args) {
        // Способ вызова метода вложенного класса:
        
        // 1. Через имя интерфейса (самый распространенный способ)
        MyInterface.NestedClass nested = new MyInterface.NestedClass();
        nested.nestedMethod();
        
        // 2. Вызов статического метода вложенного класса
        MyInterface.NestedClass.staticNestedMethod();
        
        // 3. Создание объекта напрямую
        MyInterface.NestedClass obj = new MyInterface.NestedClass();
        obj.nestedMethod();
        
        // 4. Работа с реализацией интерфейса
        MyInterface impl = new MyImplementation();
        impl.interfaceMethod();
        
        // Дополнительный пример: вложенный класс может реализовывать свой же интерфейс
        MyInterface.NestedClass special = new MyInterface.NestedClass() {
            void nestedMethod() {
                System.out.println("Переопределенный метод вложенного класса");
            }
        };
        special.nestedMethod();
    }
}